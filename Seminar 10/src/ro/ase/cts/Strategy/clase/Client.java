package ro.ase.cts.Strategy.clase;

public class Client {
	private String nume;
	private IPlata tipPlata;
	
	public Client(String nume) {
		super();
		this.nume = nume;
		this.tipPlata=new PlataCash();
	}

	public void setTipPlata(IPlata tipPlata) {
		this.tipPlata = tipPlata;
	}
	
	public void plateste(float suma) {
		System.out.println("Clientul " + nume + " are de platit " + suma + " lei");
		tipPlata.plateste(suma);
	}
	
	
	
	
	

}
