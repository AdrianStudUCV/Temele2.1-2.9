public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public double modulus() {
        return Math.sqrt(real * real + imag * imag);
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imag + other.imag);
    }

    @Override
    public String toString() {
        return real + (imag >= 0 ? " + " : " - ") + Math.abs(imag) + "i";
    }
}