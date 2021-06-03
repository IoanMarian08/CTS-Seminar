package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;

public class TesteGrupa {


	//Right 
	@Test
	public void testConstructorNumarGrupaCorect() {
		Grupa grupa = new Grupa(1081);
		assertEquals(1081, grupa.getNrGrupa());
	} 
	
	//testExistaLista
	@Test
	public void testConstructorDeExistance() {
		Grupa grupa = new Grupa(1081);
		assertNotNull(grupa.getStudenti());
	}

	
	//B-Boundary
	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	
	
	//verific daca constr arunca o exceptie cand ii dau o conditie gresita
	@Test(expected = IllegalArgumentException.class)
	public void testExceptieConstructorInferior() {
		Grupa grupa = new Grupa(900);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExceptieConstructorSuperior() {
		Grupa grupa = new Grupa(1200);
	}
	
	
	//P - performance . Ex: verific daca un obiect de tipul Grupa e creat in timp util
	@Test(timeout = 500)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1081);
	}
	
	
	//CORRECT
	
	// C - CONFORMANCE - nu avem, dar totusi am putea verifica daca nrGrupei are 4 cifre. Dar e un test fortat
	
	// O - ORDERING - nu avem.
	
	// R - RANGE - ar fi deja realizate ele fiind facut in principiul Right Bicep
	
	// R - REFERENCE - nu avem.
	
	// E - Existence – valoarea exista - avem deja
	
	// C - Cardinality – setul de test contine suficiente valori ( regula 0-1-n)? - Nu avem pt ca avem doar 0
	
	// T - Time ( absolut si relative ) – totul se intampla in ordine ? la momentul potrivit ? intr-un timp finit ? - am facut deja
	
	
	
	
	//testePromovabilitate
	
	//right
	@Test
	public void testGetPromovabilitate() {
		Grupa grupa = new Grupa(1081);
		for(int i=0;i<10;i++) { // am adaugat 10 studenti care nu au restanta
			IStudent student = new Student();
			student.adaugaNota(5);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<5;i++) { // am adaugat 5 studenti care au restanta
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.66f, grupa.getPromovabilitate(), 0.1);
	}
	
	
	//B - boundary
	@Test
	public void testPromovabilitateLimitaInferioara() {
		Grupa grupa = new Grupa(1001);
		for(int i=0;i<5;i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0, grupa.getPromovabilitate(),0.01);
	}
	
	@Test
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa = new Grupa(1081);
		for(int i=0;i<5;i++) {
			IStudent student = new Student();
			student.adaugaNota(5);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}
	

	// I
	
	// C
	
	// E 
	@Test(expected = IndexOutOfBoundsException.class)
	public void testPromovabilitateErrorCondition() {
		Grupa grupa = new Grupa(1050);
		grupa.getPromovabilitate();
	}
	
	//P
	//NU VOM FACE ASA
//	@Test(timeout = 500)
//	public void testPromovabilitatePerformance() {
//		Grupa grupa = new Grupa(1081);
//		for(int i=0;i<20;i++) { 
//			IStudent student = new Student();
//			student.adaugaNota(5);
//			student.adaugaNota(7);
//			grupa.adaugaStudent(student);
//		}
//		for(int i=0;i<15;i++) { 
//			IStudent student = new Student();
//			student.adaugaNota(4);
//			student.adaugaNota(7);
//			grupa.adaugaStudent(student);
//		}
//		grupa.getPromovabilitate();
//	}
	
	
	
	//CORRECT
	
	// C - nu avem. dar putem forta sa verificam faptul ca rezultatul e cu virgula.
	
	// O - nu avem 
	
	// R - nu o sa facem
	
	// R - data viitoare
	
	// E - nu avem
	
	// C 
	@Test
	public void testGetPromovabilitateCadinality1() {
		Grupa grupa = new Grupa(1081);
		IStudent student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(6);
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}
	
	// T - e facut

}
