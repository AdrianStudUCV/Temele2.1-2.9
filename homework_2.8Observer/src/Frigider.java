public class Frigider implements AparatElectric {
    @Override
    public void conecteazaLaCurent() {
        System.out.println("Frigiderul a fost conectat la curent.");
    }

    @Override
    public void deconecteazaDeLaCurent() {
        System.out.println("Frigiderul a fost deconectat de la curent.");
    }
}