package ro.ase.cts.Observer.clase;

public class Manager extends ManagerSalaDeSport{
	
	public void anuntaMeci(String tipSport) {
		super.notificaObservatori("Va avea loc un meci de " + tipSport);
	}
	
}
