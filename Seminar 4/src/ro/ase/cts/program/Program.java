package ro.ase.cts.program;

import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;

public class Program {

    public static void main(String[] args){

        Presedinte presedinte1 = Presedinte.getInstance();
        Presedinte presedinte2 = Presedinte.getInstance();

        System.out.println(presedinte1.toString());
        System.out.println(presedinte2.toString());

        presedinte1.setNume("Basescu");
        presedinte2.setMandat(3);

        //va afisa Basescu si 3, pentru ca avem aceeasi Instanta. Indiferent de cate instante creez, am doar una singura in spate.
        System.out.println(presedinte1.toString());
        System.out.println(presedinte2.toString());

        PresedinteLazy presedinteLazy1 = PresedinteLazy.getInstance("PresedinteLazy1",40,4);
        PresedinteLazy presedinteLazy2 = PresedinteLazy.getInstance("PresedinteLazy2",51,1);
        //se va apela primul presedinte
        System.out.println(presedinteLazy1);
        System.out.println(presedinteLazy2);


    }
}
