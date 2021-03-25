package ro.ase.cts.MethodFactory.clase;

public class Infirmier extends PersonalSpital{

	public Infirmier(String nume) {
		super(nume);
	}
	
	
	@Override
	public String toString() {
		return "\nInfirmier: " + super.getNume();
	}
}
