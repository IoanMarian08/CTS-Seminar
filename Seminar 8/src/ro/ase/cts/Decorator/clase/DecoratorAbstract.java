package ro.ase.cts.Decorator.clase;

public abstract class DecoratorAbstract implements INota{
	
	private INota nota;
	
	public DecoratorAbstract(INota nota) {
		super();
		this.nota = nota;
	}

	@Override
	public void printeazaNota() {
		nota.printeazaNota();		
	}
	
	public abstract void printeazaFelicitare();
	
	
	
}
