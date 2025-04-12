public class ComplexAdapter {

    // Convertim Double -> ComplexNumber (imaginar = 0)
    public static ComplexNumber fromDouble(Double value) {
        return new ComplexNumber(value, 0);
    }

    // Convertim ComplexNumber -> Double (calculăm modulul)
    public static Double toDouble(ComplexNumber complex) {
        return complex.modulus();
    }
}