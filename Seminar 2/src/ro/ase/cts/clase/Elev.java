package ro.ase.cts.clase;
import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasaElevului;
	private String tutoreElev;
	private static float sumaFinantare = 30;
	
	public void setClasaElevului(int numarClasa) {
		this.clasaElevului = numarClasa;
	}

	public void setTutoreElev(String numeleTutorelui) {
		this.tutoreElev = numeleTutorelui;
	}
	
	public float getSumaFinantare() {
		return sumaFinantare;
	}
	
	public static float getSumaFinantata() {
		return sumaFinantare;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Elev: ").append(super.toString()).append("Clasa= ").append(clasaElevului).append("Tutore= ").append(tutoreElev);
		return stringBuilder.toString();
	}

	public Elev() {
		super();
	}
	
}
