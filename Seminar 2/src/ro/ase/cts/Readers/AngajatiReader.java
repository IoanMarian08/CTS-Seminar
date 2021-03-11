package ro.ase.cts.Readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class AngajatiReader extends iReader {

	public AngajatiReader(String fisier) {
		super(fisier);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.fisier));
		input2.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Angajat angajat = new Angajat();
			super.citireAplicant(input2, angajat);
			
			int salariu = input2.nextInt();
			String ocupatie = input2.next();
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);
			
			angajati.add(angajat);
		}
		input2.close();
		return angajati;
	}
}