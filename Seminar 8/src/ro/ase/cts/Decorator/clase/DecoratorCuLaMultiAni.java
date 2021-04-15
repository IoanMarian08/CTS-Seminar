package ro.ase.cts.Decorator.clase;

public class DecoratorCuLaMultiAni extends DecoratorAbstract{

	public DecoratorCuLaMultiAni(INota nota) {
		super(nota);
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: La multi ani!");
	}

	@Override
	public void printeazaNota() {
		super.printeazaNota();
		System.out.println("La multi ani!");
	}
	
	

}
