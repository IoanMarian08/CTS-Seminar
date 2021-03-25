package ro.ase.cts.Prototype.program;

import ro.ase.cts.Prototype.clase.Reteta;

public class Program {
	public static void main(String[] args) {
		Reteta reteta = new Reteta("Paracetamol",250);
		Reteta reteta2=(Reteta)reteta.copiaza();
		
		//sunt doua instante diferite. NU E LA FEL CA LA SINGLETON.
		System.out.println(reteta);
		System.out.println(reteta2);
	}
}
