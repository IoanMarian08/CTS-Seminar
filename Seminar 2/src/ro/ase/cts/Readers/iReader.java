package ro.ase.cts.Readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class iReader {
	
	protected String fisier;
	
	public iReader(String fisier) {
		this.fisier=fisier;
	}
	
	public abstract List<Aplicant> readAplicants()throws FileNotFoundException, NumberFormatException;
	
	public void citireAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int numarProiecte = input.nextInt();
		String[] vectDenumiri = new String[numarProiecte];
		for (int i = 0; i < numarProiecte; i++)
			vectDenumiri[i] = input.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setVectorDenumiri(vectDenumiri, numarProiecte);		
	}
	
}
