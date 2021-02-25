package ClaseZoo;

public abstract class Animal { //nu va contine o metoda virtual pura /abtracta. Dar ea tot e abstracta
	//e abstracta ca sa fie mostenita
	private String name;

	
	public Animal(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
