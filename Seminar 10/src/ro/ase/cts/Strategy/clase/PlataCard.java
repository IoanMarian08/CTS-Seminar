package ro.ase.cts.Strategy.clase;

public class PlataCard implements IPlata{

	@Override
	public void plateste(float suma) {
			System.out.println("A fost realizata plata cu cardul pentru suma de " + suma + " lei");
	}

}
