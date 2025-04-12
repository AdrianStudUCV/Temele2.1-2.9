public class ComplexUtils {

    // suma(ComplexNumber, ComplexNumber)
    public static ComplexNumber suma(ComplexNumber nr1, ComplexNumber nr2) {
        return nr1.add(nr2);
    }

    // suma(Double, Double)
    public static ComplexNumber suma(Double nr1, Double nr2) {
        ComplexNumber c1 = ComplexAdapter.fromDouble(nr1);
        ComplexNumber c2 = ComplexAdapter.fromDouble(nr2);
        return c1.add(c2);
    }

    // suma(ComplexNumber, Double)
    public static ComplexNumber suma(ComplexNumber nr1, Double nr2) {
        Double d1 = ComplexAdapter.toDouble(nr1);
        Double sum = d1 + nr2;
        return ComplexAdapter.fromDouble(sum);
    }

    // suma(Double, ComplexNumber)
    public static ComplexNumber suma(Double nr1, ComplexNumber nr2) {
        Double d2 = ComplexAdapter.toDouble(nr2);
        Double sum = nr1 + d2;
        return ComplexAdapter.fromDouble(sum);
    }
}
