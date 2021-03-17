package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String numeAplicant;
	protected String prenumeAplicant;
	protected int varstaAplicant;
	protected int punctajAplicant;
	protected int numarProiecte;
	protected String[] denumiriProiecte;
	

	public void setNumeAplicant(String numeAplicant) {
		this.numeAplicant = numeAplicant;
	}

	public void setPrenumeAplicant(String prenumeAplicant) {
		this.prenumeAplicant = prenumeAplicant;
	}

	public void setVarstaAplicant(int varstaAplicant) {
		this.varstaAplicant = varstaAplicant;
	}
	
	public void afisareRaspunsProiect(Proiect proiect){
		
		boolean esteAcceptat = punctajAplicant >= proiect.getPragDeAcceptare();
		
		StringBuilder stringBuilder = new StringBuilder("Aplicantul ").append(numeAplicant).append(" ").append(prenumeAplicant).append(" ");
		stringBuilder.append(esteAcceptat?" a fost acceptat" : " a fost respins.");
		
		System.out.println(stringBuilder.toString());
	}
	
	public void setPunctajAplicant(int punctajAplicant) {
		this.punctajAplicant = punctajAplicant;
	}
	
	public Aplicant() {
		super();
	}
	
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiect) {
		super();
		this.numeAplicant = nume;
		this.prenumeAplicant = prenume;
		this.varstaAplicant = varsta;
		this.punctajAplicant = punctaj;
		this.numarProiecte = numarProiecte;
		this.denumiriProiecte = denumireProiect;
	}

	public void setVectorDenumiri(String[] denumiriProiecte, int numarProiecte) {
		this.numarProiecte = numarProiecte;
		this.denumiriProiecte=denumiriProiecte;
	}

	public abstract float getSumaFinantare();
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nume= ");
		builder.append(numeAplicant);
		builder.append(" , prenume= ");
		builder.append(prenumeAplicant);
		builder.append(" , varsta= ");
		builder.append(varstaAplicant);
		builder.append(" , punctaj= ");
		builder.append(punctajAplicant);
		builder.append(" , nr_proiecte= ");
		builder.append(numarProiecte);
		builder.append(" , denumiriProiecte= ");
		builder.append(Arrays.toString(denumiriProiecte));
		return builder.toString();
	}
	
	
	
	
}