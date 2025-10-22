package Calculadora;

public class Calculadora {

    public int dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre cero");
        }
        return a / b;
    }

    public double dividirConDecimales(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("División entre cero no permitida");
        }
        return (double) a / b;
    }
}