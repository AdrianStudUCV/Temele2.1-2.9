public class Product {
    private int id;
    private String name;
    private double priceInUSD;

    public Product(int id, String name, double priceInUSD) {
        this.id = id;
        this.name = name;
        this.priceInUSD = priceInUSD;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPriceInUSD() {
        return priceInUSD;
    }

    @Override
    public String toString() {
        return "Product{" + id + ", " + name + ", " + priceInUSD + " USD}";
    }
}