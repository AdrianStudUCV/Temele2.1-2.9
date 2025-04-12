public class AparatCafea implements AparatElectric {
    @Override
    public void conecteazaLaCurent() {
        System.out.println("Aparatul de cafea a fost conectat la curent.");
    }

    @Override
    public void deconecteazaDeLaCurent() {
        System.out.println("Aparatul de cafea a fost deconectat de la curent.");
    }
}