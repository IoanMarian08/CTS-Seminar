package ro.ase.cts.SimpleFactory.program;

import ro.ase.cts.SimpleFactory.clase.FactoryPersonal;
import ro.ase.cts.SimpleFactory.clase.PersonalSpital;
import ro.ase.cts.SimpleFactory.clase.TipPersonal;

public class Main {

	public static void main(String[] args) {
		FactoryPersonal factoryPersonal = new FactoryPersonal();
		
		PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent,"David");
		PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic,"Razvan");
		
		
		System.out.println(asistent);
		System.out.println(medic);
	}

}
