package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{

	private String ocupatieAngajat;
	private int salariuAngajat;
	private static float sumaFinantare = 10;
	
	public float getSumaFinantare() {
		return sumaFinantare;
	}
	
	public static float getSumaFinantata() {
		return sumaFinantare;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatieAngajat = ocupatie;
	}

	public void setSalariu(int salariu) {
		this.salariuAngajat = salariu;
	}

	public Angajat() {
		super();
		
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Angajat: ").append(super.toString()).append("Ocupatie= ").append(ocupatieAngajat).append("Salariu= ").append(salariuAngajat);
		return stringBuilder.toString();
	}

	
	

	
}
