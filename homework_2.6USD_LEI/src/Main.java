public class Main {
    public static void main(String[] args) {
        Product p = new Product(1, "Laptop", 1000);
        Produs produs = ProductAdapter.productToProdus(p, 4.7);
        System.out.println(produs); // Produs{1, Laptop, 4700.0 LEI}

        Product p2 = ProductAdapter.produsToProduct(produs, 1 / 4.7);
        System.out.println(p2); // Product{1, Laptop, 1000.0 USD}
    }
}