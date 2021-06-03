package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.Categorii.GetPromovabilitateCategory;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.teste.Mocks.StubStudent;

public class TestareStubMock {

	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitate() {
		IStudent student = new StubStudent();
		Grupa grupa = new Grupa(1081);
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getPromovabilitate(),0.001);
		
		
	}

}
