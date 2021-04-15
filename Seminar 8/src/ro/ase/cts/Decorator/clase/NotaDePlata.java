package ro.ase.cts.Decorator.clase;

public class NotaDePlata implements INota{

	private int sumaDePlata;
	
	public NotaDePlata(int sumaDePlata) {
		super();
		this.sumaDePlata = sumaDePlata;
	}

	@Override
	public void printeazaNota() {
		System.out.println(String.format("S-a printat nota de plata cu suma: %d ", sumaDePlata));
	}

}
