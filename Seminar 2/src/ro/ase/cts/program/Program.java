package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.Readers.AngajatiReader;
import ro.ase.cts.Readers.iReader;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;


public class Program {

	public static List<Aplicant> citesteAplicanti(iReader readAplicant ) throws NumberFormatException, FileNotFoundException{
		return readAplicant.readAplicants();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Suma finantata pentru angajati" + Angajat.getSumaFinantata());
		System.out.println("Suma finantata pentru elev" + Elev.getSumaFinantata());
		System.out.println("Suma finantata pentru studenti" + Student.getSumaFinantata());
		
		List<Aplicant> listaAplianti;
		try {
			listaAplianti = citesteAplicanti(new AngajatiReader("angajati.txt"));
			Proiect proiect = new Proiect(81);
			for(Aplicant aplicant:listaAplianti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantare());
				
				aplicant.afisareRaspunsProiect(proiect);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}