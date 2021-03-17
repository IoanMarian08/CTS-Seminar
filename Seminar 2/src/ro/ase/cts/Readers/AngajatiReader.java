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
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException {

		Scanner elementInitial = new Scanner(new File(super.fisier));
		elementInitial.useDelimiter(",");

		List<Aplicant> listaAngajati = new ArrayList<Aplicant>();

		while (elementInitial.hasNext()) {
			Angajat angajat = new Angajat();
			super.citireAplicant(elementInitial, angajat);
			
			int salariuAngajat = elementInitial.nextInt();
			String ocupatieAngajat = elementInitial.next();
			angajat.setSalariu(salariuAngajat);
			angajat.setOcupatie(ocupatieAngajat);
			
			listaAngajati.add(angajat);
		}
		elementInitial.close();

		return listaAngajati;
	}
}