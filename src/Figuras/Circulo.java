package Figuras;

public  class Circulo extends Figura {

    private double radio;
    private double pi = Math.PI;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {

        Double area =  Math.PI * Math.pow(radio, 2);
        System.out.println("El Area de la Circulo es de: " + area);
        return 0;
    }
}
