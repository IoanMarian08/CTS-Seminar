package ro.ase.cts.MethodFactory.clase;

public class FactoryInfirmier implements IFactory{

	@Override
	public PersonalSpital getPersonalSpital(String nume) {
		return new Infirmier(nume);
	}

}
