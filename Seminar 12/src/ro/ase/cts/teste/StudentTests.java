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
		
		assertNotNull(student.getNote());
		assertNotNull(student.getNume());
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
