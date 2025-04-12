import java.util.ArrayList;
import java.util.List;

public class Prelungitor {
    private List<AparatElectric> aparate = new ArrayList<>();
    private boolean esteConectat = false;

    public void adaugaAparat(AparatElectric aparat) {
        aparate.add(aparat);
    }

    public void conecteazaLaPriza() {
        if (!esteConectat) {
            System.out.println("Prelungitorul a fost conectat la priza.");
            for (AparatElectric aparat : aparate) {
                aparat.conecteazaLaCurent();
            }
            esteConectat = true;
        }
    }

    public void deconecteazaDeLaPriza() {
        if (esteConectat) {
            System.out.println("Prelungitorul a fost scos din priza.");
            for (AparatElectric aparat : aparate) {
                aparat.deconecteazaDeLaCurent();
            }
            esteConectat = false;
        }
    }
}