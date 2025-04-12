public class Main {
    public static void main(String[] args) {
        Prelungitor prelungitor = new Prelungitor();

        prelungitor.adaugaAparat(new AparatCafea());
        prelungitor.adaugaAparat(new Frigider());

        prelungitor.conecteazaLaPriza();
        System.out.println("=== Pauză ===");
        prelungitor.deconecteazaDeLaPriza();
    }
}