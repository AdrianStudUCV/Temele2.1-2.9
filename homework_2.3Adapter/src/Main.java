public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4); // modul = 5
        ComplexNumber c2 = new ComplexNumber(1, -2);

        System.out.println("Suma(Complex, Complex): " + ComplexUtils.suma(c1, c2));

        System.out.println("Suma(Double, Double): " + ComplexUtils.suma(5.0, 2.0));

        System.out.println("Suma(Complex, Double): " + ComplexUtils.suma(c1, 2.0));

        System.out.println("Suma(Double, Complex): " + ComplexUtils.suma(2.0, c2));
    }
}