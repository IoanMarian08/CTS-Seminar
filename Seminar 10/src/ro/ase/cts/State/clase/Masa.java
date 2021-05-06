package ro.ase.cts.State.clase;

public class Masa {
	private Stare stare;
	private int nrMasa;
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare = new StareLibera();
	}

	public Stare getStare() {
		return stare;
	}

	protected void setStare(Stare stare) {
		this.stare = stare;
	}

	public int getNrMasa() {
		return nrMasa;
	}
	
	public void rezervaMasa() {
		StareRezervata rezervata = new StareRezervata();
		rezervata.modificaStare(this);
	}
	
	public void ocupaMasa() {
		StareOcupata ocupata = new StareOcupata();
		ocupata.modificaStare(this);
	}
	
	public void elibereazaMasa() {
		StareLibera libera = new StareLibera();
		libera.modificaStare(this);
	}
}
