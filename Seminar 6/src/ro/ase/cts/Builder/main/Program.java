package ro.ase.cts.Builder.main;

import ro.ase.cts.Builder.clase.Rezervare;
import ro.ase.cts.Builder.clase.RezervareBuilder;
import ro.ase.cts.Builder.clase.RezervareBuilderV2;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1;
		//Rezervare rezervare2;
		
		RezervareBuilder rezervareBuilder = new RezervareBuilder();
		
		rezervareBuilder.setCodRezervare(100).setAreMancare(true);
		
		rezervare1 = rezervareBuilder.build();
		
		Rezervare rezervare2 = new RezervareBuilder(200).setAreMuzica(true).build();
		
		Rezervare rezervare3 = new Rezervare(300,true,false,true,true,"pop");
		
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		System.out.println(rezervare3);
		
		Rezervare rezervare4;
		rezervareBuilder.setCodRezervare(400).setAreMuzica(true).setAreScaun(false);
		rezervare4 = rezervareBuilder.build();
		
		System.out.println(rezervare4);
		
		
		RezervareBuilderV2 rbv2 = new RezervareBuilderV2().setAreMancare(true).setAreBautura(true).setAreScaunErgonomic(true);
		Rezervare rezervare5 = rbv2.setCodRezervare(150).build();
		Rezervare rezervare6 = rbv2.setCodRezervare(160).build();
	}

}
