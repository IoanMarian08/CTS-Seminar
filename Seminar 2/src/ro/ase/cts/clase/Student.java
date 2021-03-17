package ro.ase.cts.clase;
import java.util.Arrays;

public class Student extends Aplicant {

	protected String facultateaStudentului;
	protected int anulDeStudiu;
	private static float sumaFinantare = 20;
	
	
	public float getSumaFinantare() {
		return sumaFinantare;
	}
	
	public static float getSumaFinantata() {
		return sumaFinantare;
	}

	public void setFacultateaStudentului(String facultateaStudentului) {
		this.facultateaStudentului = facultateaStudentului;
	}

	public void setAnulDeStudiu(int anulDeStudiu) {
		this.anulDeStudiu = anulDeStudiu;
	}

	public Student() {
		super();
		
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Student: ").append(super.toString()).append("Facultate= ").append(facultateaStudentului).append("An studii= ").append(anulDeStudiu);
		return stringBuilder.toString();
	}

	
	
	
}
