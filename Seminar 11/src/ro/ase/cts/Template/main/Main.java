package ro.ase.cts.Template.main;

import ro.ase.cts.Template.clase.Spectator;
import ro.ase.cts.Template.clase.SpectatorAbstract;
import ro.ase.cts.Template.clase.SpectatorVIP;

public class Main {

	public static void main(String[] args) {
		
		SpectatorAbstract spectator = new Spectator("Ioan");
		
		SpectatorAbstract spectatorVIP = new SpectatorVIP("Narcis");
		
		spectator.intrareInStadion();
		spectatorVIP.intrareInStadion();
		
	}

}
