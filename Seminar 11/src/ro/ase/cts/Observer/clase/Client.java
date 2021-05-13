package ro.ase.cts.Observer.clase;

public class Client implements Observator{

	private String nume;
		
	public Client(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void primesteMesaj(String mesaj) {
		System.out.println("Clientul " + nume + " a primit mesajul: " + mesaj);
	}
}
