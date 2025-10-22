package Figuras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int desicion;
        String accion;
        do {
            System.out.println("Ingrese la figura a realizar: ");
            System.out.println("Ingrese 1 para Circulo");
            System.out.println("Ingrese 2 para Cuadrado");
            System.out.println("Ingrese 3 para Triangulo");
            desicion = entrada.nextInt();

            switch (desicion) {
                case 1:
                    System.out.println("Ingrese El Radio Del Circulo");
                    double radio = entrada.nextDouble();

                    Figura figura = new Circulo(radio);
                    figura.calcularArea();
                    break;

                case 2:
                    System.out.println("Ingrese un lado Del Cuadrado");
                    double lado = entrada.nextDouble();

                    Figura figura2 = new Cuadrado(lado);
                    figura2.calcularArea();
                    break;

                case 3:
                    System.out.println("Ingrese la base del triangulo");
                    double base = entrada.nextDouble();
                    System.out.println("Ingrese la altura del triangulo");
                    double altura = entrada.nextDouble();

                    Figura figura3 = new Triangulo(base, altura);
                    figura3.calcularArea();
            }
            entrada.nextLine();
            System.out.print("Desea realizar otra figura? (s/n)");
             accion = entrada.nextLine();
        } while (accion.equals("s"));

    }
}



