public class Produs {
    private int id;
    private String nume;
    private double pretInLei;

    public Produs(int id, String nume, double pretInLei) {
        this.id = id;
        this.nume = nume;
        this.pretInLei = pretInLei;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public double getPretInLei() {
        return pretInLei;
    }

    @Override
    public String toString() {
        return "Produs{" + id + ", " + nume + ", " + pretInLei + " LEI}";
    }
}