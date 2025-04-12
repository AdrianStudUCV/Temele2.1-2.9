public class ProductAdapter {

    // conversie din Product în Produs
    public static Produs productToProdus(Product product, double cursUsdToLei) {
        int id = product.getId();
        String nume = product.getName();
        double pretInLei = product.getPriceInUSD() * cursUsdToLei;
        return new Produs(id, nume, pretInLei);
    }

    // conversie din Produs în Product
    public static Product produsToProduct(Produs produs, double cursLeiToUsd) {
        int id = produs.getId();
        String name = produs.getNume();
        double priceInUsd = produs.getPretInLei() * cursLeiToUsd;
        return new Product(id, name, priceInUsd);
    }
}