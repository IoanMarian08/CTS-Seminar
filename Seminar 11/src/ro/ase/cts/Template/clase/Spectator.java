package ro.ase.cts.Template.clase;

public class Spectator extends SpectatorAbstract{

	private String nume;
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void seAseazaLaCoada() {
		System.out.println(this.nume + " s-a asezat la coada.");
	}

	@Override
	public void prezentareBilet() {
		System.out.println(this.nume + " a prezentat biletul.");
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println(this.nume + " a fost controlat.");
	}

	@Override
	public void ocupaLocul() {
		System.out.println(this.nume + " a ocupat locul.");
	}
	
}
