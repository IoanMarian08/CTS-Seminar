package ro.ase.cts.Facade.program;

import ro.ase.cts.Facade.clase.Persoana;
import ro.ase.cts.Facade.clase.VerificatorPersoaneFacade;

public class Program {

	public static void main(String[] args) {
		Persoana persoana1 = new Persoana("Alex","1951212016866");
		if(VerificatorPersoaneFacade.esteEligibila(persoana1)) {
			System.out.println("Persoana este eligibila. Putem sa ii oferim creditul.");
		}
		else {
			System.out.println("Persoana nu este eligibila. Nu putem sa ii oferim creditul.");
		}
		
	}

}
