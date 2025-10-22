package Listas;

import java.util.ArrayList;

public class ListaNombres {
    private ArrayList<String> nombres;

    public ListaNombres() {
        nombres = new ArrayList<>();
    }

    // agregar un nombre
    public void agregarNombres(String nombre) {
        this.nombres.add(nombre);
    }

    // eliminar un nombre
     public boolean eliminarNombre(String nombre) {
        return this.nombres.remove(nombre);
     }

     // mostrar todos los nombres
    public void mostrarNombres() {

            System.out.println(nombres);

    }
}
