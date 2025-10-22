package Listas;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaNombres lista = new ListaNombres();
        int opcion;
        String NombreIngresado = "";
        int desicion;


        do {
            System.out.println("Menu De Opciones: ");
            System.out.println("1.Agregar Nombres");
            System.out.println("2.Eliminar Nombres");
            System.out.println("3.Listar Nombres");
            opcion = entrada.nextInt();
            entrada.nextLine();




            switch (opcion) {
                case 1:

                    System.out.println("Ingrese el nombre: ");
                    NombreIngresado = entrada.nextLine();
                    lista.agregarNombres(NombreIngresado);
                    break;
                case 2:

                    System.out.print("Ingrese el nombre para eliminar ");
                    NombreIngresado = entrada.nextLine();
                    lista.eliminarNombre(NombreIngresado);
                    break;

                case 3:
                    lista.mostrarNombres();
                    break;
            }


            entrada.nextLine();
            System.out.println("Ingrese el numero 4 para vovler a desplegar el menu o 5 para terminar");
            desicion = entrada.nextInt();
        }while (desicion != 5);







    }
}
