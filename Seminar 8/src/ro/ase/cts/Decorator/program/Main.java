package ro.ase.cts.Decorator.program;

import ro.ase.cts.Decorator.clase.DecoratorAbstract;
import ro.ase.cts.Decorator.clase.DecoratorCuLaMultiAni;
import ro.ase.cts.Decorator.clase.DecoratorUrarePaste;
import ro.ase.cts.Decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {

		NotaDePlata notaInitiala = new NotaDePlata(55);
		notaInitiala.printeazaNota();
		
		System.out.println();
		
		DecoratorAbstract decoratorFelicitare = new DecoratorCuLaMultiAni(notaInitiala);
		decoratorFelicitare.printeazaFelicitare();
		
		System.out.println();
		
		decoratorFelicitare.printeazaNota();
		
		System.out.println();
		
		DecoratorAbstract decoratorUrarePaste = new DecoratorUrarePaste(notaInitiala);
		decoratorUrarePaste.printeazaNota();
		
		System.out.println();
		
		NotaDePlata notaDePlata = new NotaDePlata(150);
		DecoratorAbstract decoratorLaMultiAni2 = new DecoratorCuLaMultiAni(notaDePlata);
		DecoratorAbstract decoratorUrarePaste2 = new DecoratorUrarePaste(decoratorLaMultiAni2);
		decoratorUrarePaste2.printeazaNota();
	}

}
