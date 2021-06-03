package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.teste.Mocks.StubStudent;

public class TestareStubMock {

	@Test
	public void testGetPromovabilitate() {
		IStudent student = new StubStudent();
		Grupa grupa = new Grupa(1081);
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getPromovabilitate(),0.001);
		
		
	}

}
