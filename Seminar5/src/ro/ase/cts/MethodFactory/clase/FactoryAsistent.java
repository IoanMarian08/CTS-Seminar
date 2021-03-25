package ro.ase.cts.MethodFactory.clase;

public class FactoryAsistent implements IFactory{

	@Override
	public PersonalSpital getPersonalSpital(String nume) {
		return new Asistent(nume);
	}

}
