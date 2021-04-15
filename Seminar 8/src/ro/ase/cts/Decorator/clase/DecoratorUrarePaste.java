package ro.ase.cts.Decorator.clase;

public class DecoratorUrarePaste extends DecoratorAbstract{

	public DecoratorUrarePaste(INota nota) {
		super(nota);
		System.out.println("Paste fericit");
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("Felicitare: Paste fericit!");
	}
	
	

}
