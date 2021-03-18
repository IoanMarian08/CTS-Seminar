package ro.ase.cts.clase;

public class TrucMagic {

    private String denumireTruc;
    private int durataTruc;
    private int numarMembriExecutanti;

    private static TrucMagic instance = null;

    private TrucMagic(String denumireTruc, int durataTruc, int numarMembriExecutanti) {
        this.denumireTruc = denumireTruc;
        this.durataTruc = durataTruc;
        this.numarMembriExecutanti = numarMembriExecutanti;
    }

    private TrucMagic() {
        this.denumireTruc="MagicTrick";
        this.durataTruc=15;
        this.numarMembriExecutanti=1;
    }

    public static synchronized TrucMagic getInstance(String denumireTruc, int durataTruc, int numarMembriExecutanti) {
        if(instance == null){
            instance = new TrucMagic(denumireTruc, durataTruc, numarMembriExecutanti);
        }
        return instance;
    }

    public void setDenumireTruc(String denumireTruc) {
        this.denumireTruc = denumireTruc;
    }

    public void setDurataTruc(int durataTruc) {
        this.durataTruc = durataTruc;
    }

    public void setNumarMembriExecutanti(int numarMembriExecutanti) {
        this.numarMembriExecutanti = numarMembriExecutanti;
    }

    @Override
    public String toString() {
        return "trucMagic{" +
                "denumireTruc='" + denumireTruc + '\'' +
                ", durataTruc=" + durataTruc +
                ", numarMembriExecutanti=" + numarMembriExecutanti +
                '}';
    }
}
