package ro.ase.cts.Command.clase;

public abstract class Comanda {
	
	public abstract void executa();
	protected Masa masa;
	
	public Comanda(Masa masa) {
		super();
		this.masa = masa;
	}
		
}
