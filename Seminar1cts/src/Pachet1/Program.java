package Pachet1;

import ClaseZoo.Girafa;
import ClaseZoo.Zoo;

public class Program {
	
	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		Girafa g1 = new Girafa("g1");
		Girafa g2 = new Girafa("g2");
		
		zoo.adaugaAnimal(g1);
		zoo.adaugaAnimal(g2);
		
		zoo.feedAnimals();
	}
}