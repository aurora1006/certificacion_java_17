package arrays_colecciones.arrays;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CTablas {
    
    public static void main(String[] args) {
        crearTabla();
        agregarElemento();
        metodosTabla();
        recorrerTabla();
        treeMap();
    }

    private static void treeMap() {
        System.out.println("**** Tree Map");
        TreeMap<Integer, String> tabla = new TreeMap<>();
        tabla.put(100,"cien");
        tabla.put(1, "Uno");
        tabla.put(200,"Doscientos");
        tabla.putIfAbsent(2, "Dos");
        tabla.putIfAbsent(3, null);

        for (String val : tabla.values()) {
            System.out.println(val);
        }
    }

    private static void recorrerTabla() {
        System.out.println("**** Recorrer tabla");
        Map<Integer,String> tabla = new HashMap<>();
        tabla.put(100,"cien");
        tabla.put(1, "Uno");
        tabla.put(200,"Doscientos");
        tabla.putIfAbsent(2, "New");
        tabla.putIfAbsent(3, null);

        Collection <String> datos = tabla.values();
        for (String val : datos) {
            System.out.println(val);
        }
    }

    private static void metodosTabla() {
        System.out.println("***** Obtener elemento por GET");
        Map<Integer,String> tabla = new HashMap<>();
        tabla.put(100,"cien");
        tabla.put(1, "Uno");
        tabla.put(200,"Doscientos");
        tabla.putIfAbsent(2, "New");
        tabla.putIfAbsent(3, null);

        System.out.println(tabla.get(100));
        System.out.println("Size: "+tabla.size());
        System.out.println("Remove "+tabla.remove(200));
        System.out.println("ContainsKey: "+tabla.containsKey(2));
        System.out.println("ContainsKey: "+tabla.containsValue("cien"));
    }

    private static void agregarElemento() {
        System.out.println("***** Agregar Elemento");
        Map<Integer,String> tabla = new HashMap<>();
        tabla.put(100,"cien");
        tabla.put(1, "Uno");
        tabla.put(200,"Doscientos");
        tabla.putIfAbsent(2, "New");
        tabla.putIfAbsent(3, null);

        for (String val: tabla.values()){
            System.out.println(val);
        }

        //Map<Integer, String> d = Map.copyOf(tabla); //Error de compilación copyOf es inmutable y no acepta nulls
    }

    private static void crearTabla() {
        System.out.println("***** Crear Tabla");
        //Instancias tabla
        Map<Integer,String> tabla = new HashMap<>();

        //Método factoria de Map
        Map<Integer,String> c = Map.ofEntries(
            Map.entry(1, "Uno"),
            Map.entry(2, "Dos"),
            Map.entry(3,"Tres")
        );
        
        //Méotod copyOf de  Map
        Map<Integer,String> d = Map.copyOf(c);

        for (String val: d.values()){
            System.out.println(val);
        }
    }
}
