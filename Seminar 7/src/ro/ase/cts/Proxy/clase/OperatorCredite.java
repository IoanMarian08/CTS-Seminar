package ro.ase.cts.Proxy.clase;

public class OperatorCredite implements IOperatorCredite{

	@Override
	public void creareCredit(Moneda moneda, int suma) {
		System.out.println("A fost oferit creditu in suma de " + suma + " " + moneda);
		
	}

}
