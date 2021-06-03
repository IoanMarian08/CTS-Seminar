package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.Categorii.GetPromovabilitateCategory;
import ro.ase.cts.Categorii.TesteUrgente;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.teste.Mocks.FakeStudent;

public class TestareFakeMock {

	//teste de RIGHT
	@Test
	@Category({GetPromovabilitateCategory.class, TesteUrgente.class})
	public void testGetPromovabilitateFake() {
		Grupa grupa = new Grupa(1051);
		for(int i=0; i<8; i++) {
			FakeStudent student = new FakeStudent();
			student.setAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0; i<2; i++) {
			FakeStudent student = new FakeStudent();
			student.setAreRestante(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.8 ,  grupa.getPromovabilitate(), 0.01);
	}

}
