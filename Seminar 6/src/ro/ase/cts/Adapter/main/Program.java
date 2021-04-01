package ro.ase.cts.Adapter.main;

import ro.ase.cts.Adapter.clase.Bilet;
import ro.ase.cts.Adapter.clase.BiletAdaptor;
import ro.ase.cts.Adapter.clase.BiletAdaptorClase;
import ro.ase.cts.Adapter.clase.IBiletOnline;

public class Program {

	private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet) {
		bilet.rezervare();
		bilet.vanzare();
	}
	
	
	private static void rezervaSiAfiseazaBiletOnline(IBiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}
	
	public static void main(String[] args) {
		Bilet bilet1 = new Bilet(30);
		rezervaSiAfiseazaBiletLaCasa(bilet1);
		
		IBiletOnline adaptor = new BiletAdaptor(bilet1);
		rezervaSiAfiseazaBiletOnline(adaptor);
		
		IBiletOnline adapterClase = new BiletAdaptorClase(50);
		rezervaSiAfiseazaBiletOnline(adapterClase);
	}

}
