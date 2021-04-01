package ro.ase.cts.MethodFactory.main;

import ro.ase.cts.MethodFactory.clase.FactoryAsistent;
import ro.ase.cts.MethodFactory.clase.FactoryBrancardier;
import ro.ase.cts.MethodFactory.clase.FactoryInfirmier;
import ro.ase.cts.MethodFactory.clase.IFactory;
import ro.ase.cts.MethodFactory.clase.PersonalSpital;

public class Program {
	
	public static void afisareInformatiiPersonalSpital(IFactory factory, String nume) {
		PersonalSpital personalSpital = factory.getPersonalSpital(nume);
		System.out.println(personalSpital.toString());
	}

	public static void main(String[] args) {
		afisareInformatiiPersonalSpital(new FactoryAsistent(),"Andrei");
		afisareInformatiiPersonalSpital(new FactoryBrancardier(),"Mihai");
		afisareInformatiiPersonalSpital(new FactoryInfirmier(), "Raluca");
	}

}
