package Maps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ManejoConjunto {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Juan","perez",1,5000,10000);
        Cliente c2 = new Cliente("Andres","Gomez",2,5567,50000);
        Cliente c3 = new Cliente("Julian","vera",3,4065,15000);
        Cliente c4 = new Cliente("Diego","nuñez",4,2845,80000);
        Cliente c5 = new Cliente("Jose","mendez",5,1045,100000);

        Set<Cliente> conjuntoClientes = new HashSet<>();

        conjuntoClientes.add(c1);
        conjuntoClientes.add(c2);
        conjuntoClientes.add(c3);
        conjuntoClientes.add(c4);
        conjuntoClientes.add(c5);

        System.out.println("Conjunto de clientes:");

        for (Cliente cliente : conjuntoClientes) {
            System.out.println(cliente.toString());
        }


    System.out.println("------------------------------");


        Iterator <Cliente> ite =  conjuntoClientes.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next().toString());
        }

        long cuentaaEliminar = 5000;

        ite =  conjuntoClientes.iterator();
        while (ite.hasNext()) {
            long ctaActual = (long) ite.next().getCuenta();
            if(ctaActual == cuentaaEliminar){
                ite.remove();
            }

        }

        System.out.println(conjuntoClientes.size());

        ite =  conjuntoClientes.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next().toString());
        }



    }
}
