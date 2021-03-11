package ro.ase.cts.Readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class iReader {
	
	protected String fisier;
	
	public iReader(String fisier) {
		this.fisier=fisier;
	}
	
	public abstract List<Aplicant> readAplicants()throws FileNotFoundException, NumberFormatException;

}
