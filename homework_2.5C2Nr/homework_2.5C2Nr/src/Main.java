public class Main {
    public static void main(String[] args) {
        C2Nr c2Nr = new C2Nr(1, 2);
        System.out.println("Suma (C2Nr): " + c2Nr.getSum()); // Output: 3

        C3Nr c3Nr = new C3Nr(1, 2, 3);
        System.out.println("Suma (C3Nr): " + c3Nr.getSum()); // Output: 6

        C2Nr c2 = new C2Nr(5, 10);
        C3Nr c3 = C2ToC3Adapter.convert(c2);

        System.out.println("C2Nr: " + c2.getSum());       // Output: 15.0
        System.out.println("C3Nr (convertit): " + c3);    // Output: C3Nr(5.0, 10.0, 0.0)
        System.out.println("Suma C3Nr: " + c3.getSum());  // Output: 15.0
    }
}