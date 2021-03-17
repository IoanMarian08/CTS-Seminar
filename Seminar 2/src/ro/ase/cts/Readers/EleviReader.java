package ro.ase.cts.Readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class EleviReader extends iReader {

	public EleviReader(String fisier) {
		super(fisier);
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException {

		Scanner elementInitial = new Scanner(new File(super.fisier));
		elementInitial.useDelimiter(",|\n");

		List<Aplicant> listaElevi = new ArrayList<Aplicant>();

		while (elementInitial.hasNext()) {
			Elev elev = new Elev();
			super.citireAplicant(elementInitial, elev);
			
			int clasaElevului = elementInitial.nextInt();
			String tutoreElev = elementInitial.next();
			
			elev.setClasa(clasaElevului);
			elev.setTutore(tutoreElev);
			
			listaElevi.add(elev);

		}

		elementInitial.close();

		return listaElevi;
	}
}