package arrays_colecciones.arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class CIterator {
    
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add(Integer.valueOf(1));
        a.add(Integer.valueOf(2));
        a.add(Integer.valueOf(3));

        Iterator<Integer> r = a.iterator();
        while(r.hasNext()){
            System.out.println(r.next());
        }  
    }
}
