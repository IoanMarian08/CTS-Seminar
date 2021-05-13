package ro.ase.cts.Memento.program;

import ro.ase.cts.Memento.clase.ManagerMemento;
import ro.ase.cts.Memento.clase.Meci;

public class Main {

	public static void main(String[] args) {
			
			Meci meci = new Meci("EchipaGazda","EchipaOaspeti",200,200,10,5);
	
			ManagerMemento manager = new ManagerMemento();
			
			manager.addMemento(meci.creazaMemento());
			
			meci.setNrSpectatori(160);
			manager.addMemento(meci.creazaMemento());
			
			System.out.println(meci.toString());
			meci.seteazaMemento(manager.cereUnMemento(0));
			System.out.println(meci.toString());
			meci.seteazaMemento(manager.cereUtimulMemento());
			System.out.println(meci.toString());
			
			
		}
}
