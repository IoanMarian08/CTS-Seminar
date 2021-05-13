package ro.ase.cts.Observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaDeSport {
	private List<Observator>colectieObservatori;

	public ManagerSalaDeSport() {
		super();
		this.colectieObservatori = new ArrayList<>();
	}
	
	public void adaugaObservator(Observator observator) {
		colectieObservatori.add(observator);
	}
	
	public void stergeObservator(Observator observator) {
		colectieObservatori.remove(observator);
	}
	
	public void notificaObservatori(String mesajNotificare) {
		for(Observator obs : colectieObservatori) { //parcurgem lista ca sa trimitem mesaj pt fiecare observator
			obs.primesteMesaj(mesajNotificare);
		}
	}
	
}
