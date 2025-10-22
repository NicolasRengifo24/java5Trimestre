package Figuras;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
       double area = (base*altura)/2;
       System.out.println("Area: " + area);
        return area;
    }
}
