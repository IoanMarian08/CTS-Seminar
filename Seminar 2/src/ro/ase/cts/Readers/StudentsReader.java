package ro.ase.cts.Readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class StudentsReader extends iReader{

	public StudentsReader(String fisier) {
		super(fisier);
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner elementIntrare = new Scanner(new File(super.fisier));
		elementIntrare.useDelimiter(",|\n");
		List<Aplicant> listaStudenti = new ArrayList<Aplicant>();

		while (elementIntrare.hasNext()) {
			Student student = new Student();
				super.citireAplicant(elementIntrare, student);
	
			int anulDeStudiu = elementIntrare.nextInt();
			String facultateStudentului = (elementIntrare.next());
			
			student.setAn_studii(anulDeStudiu);
			student.setFacultate(facultateStudentului);
		
			listaStudenti.add(student);
		}
		elementIntrare.close();

		return listaStudenti;
	}
}