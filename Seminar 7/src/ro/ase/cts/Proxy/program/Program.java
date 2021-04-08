package ro.ase.cts.Proxy.program;

import ro.ase.cts.Proxy.clase.Moneda;
import ro.ase.cts.Proxy.clase.OperatorCredite;
import ro.ase.cts.Proxy.clase.OperatorCrediteProxy;

public class Program {

	public static void main(String[] args) {
		OperatorCredite operator = new OperatorCredite();
		operator.creareCredit(Moneda.EUR,4000);
		
		OperatorCrediteProxy proxy = new OperatorCrediteProxy(operator);
		proxy.creareCredit(Moneda.EUR,3000);
		proxy.creareCredit(Moneda.RON, 10000);
	}

}
