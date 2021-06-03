package ro.ase.cts.teste.Suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.teste.TestareDummyMock;
import ro.ase.cts.teste.TestareFakeMock;
import ro.ase.cts.teste.TestareStubMock;
import ro.ase.cts.teste.TesteGrupa;
import ro.ase.cts.teste.TesteGrupaFixture;

@RunWith (Suite.class)
@Suite.SuiteClasses({
	TestareDummyMock.class,
	TestareFakeMock.class,
	TestareStubMock.class,
	TesteGrupa.class,
	TesteGrupaFixture.class
})

public class SuiteTests {

}
