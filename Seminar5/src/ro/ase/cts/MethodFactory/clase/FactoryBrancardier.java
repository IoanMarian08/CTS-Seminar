package ro.ase.cts.MethodFactory.clase;

public class FactoryBrancardier implements IFactory{

	@Override
	public PersonalSpital getPersonalSpital(String nume) {
		return new Brancardier(nume);
	}
	
}
