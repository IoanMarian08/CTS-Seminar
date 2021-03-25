package ro.ase.cts.MethodFactory.clase;

public class FactoryMedic implements IFactory {

	@Override
	public PersonalSpital getPersonalSpital(String nume) {
		return new Medic(nume);
	}

	
}
