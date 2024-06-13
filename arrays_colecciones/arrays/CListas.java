package arrays_colecciones.arrays;

import java.util.*;

public class CListas {

    public static void main(String[] args) {
        creacionListas();
        agregarElementos();
    }

    private static void agregarElementos() {

        //Constructores de ArrayList
        ArrayList <String> session = new ArrayList<>();
        ArrayList <String> session1 = new ArrayList<>(5);
        ArrayList <String> session2 = new ArrayList<>(List.of("uno", "dos", "tres"));

        //Agregar elementos
        session.add("Primavera");
        session.add("Verano");
        // 0 Primaver 
        // 1 Verano  

        //Agregar elemento en una posición especifica
        session.add(1,"Otoño");
        // 0 Primaver 
        // 1 Otoño
        // 2 Verano  -> Recorre Verano a la siguiente posición  

        //Modificar un elemento de la lista
        session.set(0,"Invierno");
        // 0 Invierno 
        // 1 Otoño
        // 2 Verano

        //Conocer el tamaño de una lista
        System.out.println("Size: "+session.size());
        //Size 3

        //Conocer el valor de una posición
        System.out.println("1 "+session.get(1));
        // 1 Otoño

        //Eliminar elemento por posición
        System.out.println("Borró: "+session.remove(0));
        // 0 Otoño  -> Elimino el elemento Invierno
        // 1 Verano

        session1.add("Primavera");
        session1.add("Verano");
        session1.add("Otoño");
        session1.add("Invierno");
        session1.add("Primavera");

        ////Eliminar por objeto
        System.out.println("Existe objeto: "+session1.remove("Primavera")+ " Borra el objeto");
        // 0 Verano
        // 1 Otoño
        // 2 Invierno
        // 3 Primaver -> Cuando hay dos elemento iguales, se borra el primero
    }

    private static void creacionListas(){
        //Creación de listas
        //1. Como instancias de ArrayList
        List<Integer> enterosList = new ArrayList<>();
        //2. A partir del método asList de Arrays -> Lista de tamaño FIJO, no admite inserción ni eliminación
        List<Integer> enterosList2 = Arrays.asList(1,2,3,4,5,6);
        //3. Mediante método de factoría de List -> 
        //Inmutables, no admiten la eliminación, modificación e inserción de elementos, ni valores null
        List<Integer> enterosList3 = List.of(1,2,3,4,5,6);
        //4. Mediante el método copyOf de List
        //Inmutables, no admiten la eliminación, modificación e inserción de elementos, ni valores null
        List<Integer> enterosCopy = List.copyOf(enterosList2);
    }
    
}
