package ro.ase.cts.Strategy.program;

import ro.ase.cts.Strategy.clase.Client;
import ro.ase.cts.Strategy.clase.PlataCard;

public class Program {

	public static void main(String[] args) {
		
		Client client = new Client("Ioan");
		//e default pentru ca am pus in constructor deja un tip de plata default
		client.plateste(30);
		
		client.setTipPlata(new PlataCard());
		client.plateste(25);
		

	}

}
