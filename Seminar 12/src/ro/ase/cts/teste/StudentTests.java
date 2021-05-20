package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuUnParametru() {
		String nume = "Costica";
		Student student = new Student(nume);
		
		assertEquals(nume, student.getNume());	
		assertNotNull(student.getNote()); // sau assertNotEquals ( null, student.getNote() )
	}
	
	
	@Test
	public void testConstructorFaraParametrii() {
		Student student = new Student(); //apelez constr
		
		assertNotNull("Atributul note nu a fost initializat",student.getNote());
		assertNotNull("Atributul numen nu a fost initializat",student.getNume());
	}
	
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		
		int nota = 9;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	
	@Test 
	public void testAdaugaNotaSiDimensiune() {
		Student student = new Student();
		

		student.adaugaNota(5);
		student.adaugaNota(9);
		
		assertEquals(2, student.getNote().size());
	}
	
	
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		
		student.adaugaNota(5);
		student.adaugaNota(8);
		
		assertEquals(6.5f, student.calculeazaMedie(),0.01);
	}
	
	
	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();
		
		assertEquals(0,student.calculeazaMedie(),0.1);
	}
	
	
	@Test
	public void testCalculeazaMedieCuONota() {
		Student student = new Student();
		
		student.adaugaNota(6);
		
		assertEquals(6,student.calculeazaMedie(),0.1);
	}
	
	
	@Test
	public void testAreRestanta() {
		Student student = new Student();
		
		student.adaugaNota(9);
		student.adaugaNota(3);
		
		assertTrue(student.areRestante());
	}
	
	
	@Test
	public void testNuAreRestanta() {
		Student student = new Student();
		
		student.adaugaNota(8);
		student.adaugaNota(10);
		
		assertFalse(student.areRestante());
		
	}
	
	
	@Test  // pentru junit 3
	public void testGetNotaExceptie() {
		Student student = new Student();
		
		student.adaugaNota(5);
		student.adaugaNota(7);
		// 1 - se executa
		try {
			//2 - se executa
			student.getNota(5); // va arunca oe xceptie ca am dat doar o nota
			//3  -- nu se va executa ca a esuat asta de sus
			fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie");
		}catch (IndexOutOfBoundsException exceptie) {
			//4 -- se va executa
		} 
		catch (Exception e) {
			fail("Metoda arunca o alta exceptie");
		}
		//5 -- se va executa
	}
	
	
	@Test(expected = IndexOutOfBoundsException.class)  // JUNIT 4
	public void testGetNotaExceptieJUNIT4() {
		Student student = new Student();
		
		student.adaugaNota(5);
		student.adaugaNota(7);
		student.getNota(5);
	}
	
	//JUNIT 5
	@Test
	public void testGetNotaJUNIT5 () {
		Student student = new Student();
		
		student.adaugaNota(8);
		student.adaugaNota(7);
		
		assertThrows(IndexOutOfBoundsException.class,() -> {
			student.getNota(5);
		});
	}
	
}
