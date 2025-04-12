public class Main {
    public static void main(String[] args) {
        C2Nr c2Nr = new C2Nr(1, 2);
        System.out.println("Suma (C2Nr): " + c2Nr.getSum()); // Output: 3

        C3Nr c3Nr = new C3Nr(1, 2, 3);
        System.out.println("Suma (C3Nr): " + c3Nr.getSum()); // Output: 6
    }
}