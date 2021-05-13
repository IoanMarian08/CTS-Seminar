package ro.ase.cts.Memento.clase;

public class Memento {
	private int nrSpectatori;
	private String numeEchipaGazda;
	private String numeEchipaOaspeti;
	
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public String getNumeEchipaGazda() {
		return numeEchipaGazda;
	}
	public String getNumeEchipaOaspeti() {
		return numeEchipaOaspeti;
	}
	public Memento(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspeti) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchipaOaspeti = numeEchipaOaspeti;
	}
	
}
