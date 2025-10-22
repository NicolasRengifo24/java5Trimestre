package mapAlumnos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> mapaEstudiantes = new HashMap<String,Integer>();

        mapaEstudiantes.put("Luis",60);
        mapaEstudiantes.put("Jose",26);
        mapaEstudiantes.put("Pedro",70);
        mapaEstudiantes.put("Maria",50);
        mapaEstudiantes.put("Mario",100);


        Iterator ite = mapaEstudiantes.keySet().iterator();

        while (ite.hasNext()) {
            String key = (String) ite.next();
            System.out.println("Nombre Del estudiante: " + key + " -> Nota : " + mapaEstudiantes.get(key));
        }

        // borrando un estudiante

        mapaEstudiantes.remove("Luis");

        System.out.println("\n=== Lista después de borrar a Jose ===");
        for (String key : mapaEstudiantes.keySet()) {
            System.out.println("Nombre del estudiante: " + key + " -> Nota: " + mapaEstudiantes.get(key));
        }


        }
    }

