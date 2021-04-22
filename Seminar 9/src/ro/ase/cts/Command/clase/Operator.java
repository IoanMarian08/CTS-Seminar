package ro.ase.cts.Command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	private List<Comanda> listaComenzi;

	public Operator() {
		this.listaComenzi = new ArrayList<Comanda>();
	}
	
	public void invoca(Comanda comanda) {
		this.listaComenzi.add(comanda);
	}
	
	public void executaComanda() {
		listaComenzi.get(0).executa();
		listaComenzi.remove(0);
	}
	
	
}
