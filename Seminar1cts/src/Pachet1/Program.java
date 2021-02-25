package Pachet1;

import ClaseZoo.Girafa;
import ClaseZoo.Zebra;
import ClaseZoo.Zoo;

public class Program {
	
	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		Girafa g1 = new Girafa("g1");
		Girafa g2 = new Girafa("g2");
		
		zoo.adaugaAnimal(g1);
		zoo.adaugaAnimal(g2);
		
	
		
		Zebra z1 = new Zebra("z1");
		Zebra z2 = new Zebra("z2");
		
		zoo.adaugaAnimal(z1);
		zoo.adaugaAnimal(z2);
		
		zoo.feedAllAnimals();
	}
}
