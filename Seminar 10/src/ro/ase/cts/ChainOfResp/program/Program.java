package ro.ase.cts.ChainOfResp.program;

import ro.ase.cts.ChainOfResp.clase.Client;
import ro.ase.cts.ChainOfResp.clase.NotificatorEmail;
import ro.ase.cts.ChainOfResp.clase.NotificatorSMS;

public class Program {

	public static void main(String[] args) {
		Client client1 = new Client ("Ion",null,null);
		Client client2 = new Client ("Maria","0721231231",null);
		Client client3 = new Client ("Ana",null,"ana@gmail.com");
		
		NotificatorSMS notificatorSMS=new NotificatorSMS();
		NotificatorEmail notificatorEmail = new NotificatorEmail();
		
		notificatorSMS.setNotificator(notificatorEmail);
		notificatorSMS.trimiteNotificare(client2, "acesta este un mesaj");
	}

}
