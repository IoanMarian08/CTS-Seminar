package ro.ase.cts.State.program;

import ro.ase.cts.State.clase.Masa;
import ro.ase.cts.State.clase.StareLibera;

public class Main {

	public static void main(String[] args) {
		Masa masa1 = new Masa(10);
		
		masa1.elibereazaMasa();
		
		masa1.rezervaMasa();

		masa1.rezervaMasa();
		
		masa1.ocupaMasa();
		
		
	}

}
