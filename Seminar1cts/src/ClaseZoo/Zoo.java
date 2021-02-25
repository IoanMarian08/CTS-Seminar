package ClaseZoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private ZooKeeper zookeeper;
	private List<Animal> animalList;
	
	public Zoo() {
		animalList = new ArrayList<>();
		zookeeper=new ZooKeeper("Ion");
	}
	
	public Zoo(ZooKeeper zookeeper, List<Animal>animalList) {
		this.zookeeper = zookeeper;
		this.animalList = animalList;
	}
	
	public void adaugaAnimal(Animal animal) {
		animalList.add(animal);
	}
	
	public void feedAnimals() {
		for (Animal animal:animalList) {
			zookeeper.feed(animal);
		}
	}
	
	
	
	
}
