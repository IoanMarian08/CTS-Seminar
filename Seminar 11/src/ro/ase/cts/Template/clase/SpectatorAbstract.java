package ro.ase.cts.Template.clase;

public abstract class SpectatorAbstract {

	public abstract void seAseazaLaCoada();
	public abstract void prezentareBilet();
	public abstract void realizareControlCorporal();
	public abstract void ocupaLocul();
	
	//trebuie sa fie FINAL neaparat
	public final void intrareInStadion() {
		seAseazaLaCoada();
		prezentareBilet();
		realizareControlCorporal();
		ocupaLocul();
	}
}
