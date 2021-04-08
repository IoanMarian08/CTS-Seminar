package ro.ase.cts.Facade.clase;

public class VerificatorPersoaneFacade {
	public static boolean esteEligibila(Persoana persoana) {
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmarit(persoana)) {
				if(!BirouDeCredite.areCredite(persoana)) {
					return true;
				}
			}
		}
		return false;
	}
}
