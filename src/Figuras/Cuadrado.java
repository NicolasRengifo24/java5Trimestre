package Figuras;

public  class Cuadrado extends Figura {


    public Cuadrado(double lado) {
        this.lado = lado;
    }

    private double lado;



    @Override
    public double calcularArea() {
        double area = lado * lado;
        System.out.println("Area: " + area);
        return area;
    }


}
