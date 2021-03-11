package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.Readers.AngajatiReader;
import ro.ase.cts.Readers.iReader;
import ro.ase.cts.clase.Aplicant;


public class Program {

	public static List<Aplicant> citesteAplicanti(iReader readAplicant ) throws NumberFormatException, FileNotFoundException{
		return readAplicant.readAplicants();
	}
	
	public static void main(String[] args) {
		List<Aplicant> listaAplianti;
		try {
			listaAplianti = citesteAplicanti(new AngajatiReader("angajati.txt"));
			for(Aplicant aplicant:listaAplianti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}