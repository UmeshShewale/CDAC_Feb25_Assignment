/* Q4. Complex Number Operations 
Create a class to represent complex numbers. Include the following constructors: 
1.  A default constructor that sets both real and imaginary parts to 0 
2.  A constructor that initializes the real part only 
3.  A constructor that initializes both real and imaginary parts 
Also, write member functions to: 
Add two complex numbers 
Multiply two complex numbers 
In the main() method: 
Create two complex numbers: 3 + 2i and 4 - 2i 
Display their sum and product */

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        if (this.imaginary >= 0) {
            return this.real + " + " + this.imaginary + "i";
        } else {
            return this.real + " - " + (-this.imaginary) + "i";
        }
    }

    public static void main(String[] args) {
        ComplexNumber complex1 = new ComplexNumber(3, 2);  // 3 + 2i
        ComplexNumber complex2 = new ComplexNumber(4, -2); // 4 - 2i

        ComplexNumber sumResult = complex1.add(complex2);
        System.out.println("Sum: " + sumResult);

        ComplexNumber productResult = complex1.multiply(complex2);
        System.out.println("Product: " + productResult);
    }
}
