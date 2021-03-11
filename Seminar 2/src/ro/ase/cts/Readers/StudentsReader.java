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
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.fisier));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student student = new Student();
				super.citireAplicant(input, student);
	
			int an_studii = input.nextInt();
			String facultate = (input.next()).toString();
			
			student.setAn_studii(an_studii);
			student.setFacultate(facultate);
		
			studenti.add(student);
			

			
		}
		input.close();
		return studenti;
	}
}