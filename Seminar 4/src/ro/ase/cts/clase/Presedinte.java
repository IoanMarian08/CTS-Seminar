package ro.ase.cts.clase;

public class Presedinte {

    private String nume;
    private int varsta;
    private int mandat;

    private Presedinte() {
        this.nume="Putin";
        this.varsta=68;
        this.mandat=10;
    }

    private Presedinte(String nume, int varsta, int mandat) {
        this.nume=nume;
        this.varsta=varsta;
        this.mandat=mandat;
    }

    
    private static Presedinte instance = new Presedinte(); //de obicei este private, dar la egar initializam instanca public

    public static Presedinte getInstance(){
        return instance;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setMandat(int mandat) {
        this.mandat = mandat;
    }


    @Override
    public String toString() {
        return "Presedinte{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", mandat=" + mandat +
                '}';
    }
}
