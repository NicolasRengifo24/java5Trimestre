package Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = sc.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = sc.nextDouble();
        sc.nextLine();


        Cuenta cuenta1 = new Cuenta((int) saldoInicial, numeroCuenta);

        String accion;

        do {

            System.out.println("1. Depositar en la cuenta");
            System.out.println("2. Retirar de la cuenta");
            System.out.println("3. Ver saldo");
            System.out.print("Elige una opción: ");

            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el valor a depositar: ");
                    double deposito = sc.nextDouble();
                    sc.nextLine();
                    cuenta1.depositar((int) deposito);
                    System.out.println("Depósito exitoso.");
                    break;

                case "2":
                    System.out.print("Ingrese el valor a retirar: ");
                    double retiro = sc.nextDouble();
                    sc.nextLine();
                    try {
                        cuenta1.retirar((int) retiro);
                        System.out.println("Retiro exitoso.");
                    } catch (FondosInsuficientesException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;


                case "3":
                    System.out.println("Saldo actual: " + cuenta1.getSaldo());
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            System.out.print("¿Desea realizar otra acción? (s/n): ");
            accion = sc.nextLine();

        } while (accion.equalsIgnoreCase("s"));

        System.out.println("Gracias por usar el sistema.");
        sc.close();
    }
}
