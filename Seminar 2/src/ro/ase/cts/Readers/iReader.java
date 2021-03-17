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
	
	public void citireAplicant(Scanner elementIntrare, Aplicant aplicant) {

		String numeAplicant = elementIntrare.next();
		String prenumeAplicant = elementIntrare.next();
		int varstaAplicant = elementIntrare.nextInt();
		int punctajAplicant = elementIntrare.nextInt();
		int numarProiecte = elementIntrare.nextInt();
		String[] vectorDenumiriProiecte = new String[numarProiecte];
		for (int i = 0; i < numarProiecte; i++)
			vectorDenumiriProiecte[i] = elementIntrare.next();
		aplicant.setNume(numeAplicant);
		aplicant.setPrenume(prenumeAplicant);
		aplicant.setVarsta(varstaAplicant);
		aplicant.setPunctaj(punctajAplicant);
		aplicant.setVectorDenumiri(vectorDenumiriProiecte, numarProiecte);
	}
	
}
