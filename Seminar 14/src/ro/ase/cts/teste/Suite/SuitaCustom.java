package ro.ase.cts.teste.Suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.Categorii.GetPromovabilitateCategory;
import ro.ase.cts.Categorii.TesteUrgente;
import ro.ase.cts.teste.TestareDummyMock;
import ro.ase.cts.teste.TesteGrupa;
import ro.ase.cts.teste.TesteGrupaFixture;

@RunWith(Categories.class)
@SuiteClasses({TestareDummyMock.class,TesteGrupa.class,TesteGrupaFixture.class})
@IncludeCategory(GetPromovabilitateCategory.class)
@ExcludeCategory(TesteUrgente.class)

public class SuitaCustom {

}
