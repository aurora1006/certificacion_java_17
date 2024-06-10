package arrays_colecciones.arrays;

import javax.swing.JButton;
//Tipo de dato generico
//Solo acepta tipos de datos de Java Ej. String, Integer. No acepta primitivos Ej. int, char

public class Genericos<T> {
    
    private T dato;
    
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Genericos(T dato) {
        this.dato = dato;
    }

    public static void print(Genericos<?> generico){
        System.out.println("Generico: "+generico.getDato());
    }

    class GenericoRestrictivo<K extends Number>{
        
        private K dato;

        public GenericoRestrictivo(K dato){
            this.dato = dato;
        }

        public void printB(GenericoRestrictivo<? extends Number> gr){
            System.out.println("Generico restrictivo ");
        }
    }
    
    static class GenericoRestrictivoD<K extends JButton>{
        
            private K dato;

            public GenericoRestrictivoD(K dato){
                this.dato = dato;
            }

            public void printC(GenericoRestrictivoD<?> gr){
                System.out.println("Generico restrictivo");
            }

            public void printButton(GenericoRestrictivoD<? super JButton> gr){
                System.out.println("Generico restrictivo D");
            }
    }

    static class MyClass<A extends Number> { 

        public void print(String a){
            System.out.println(a);
        }
    }

    static class MetodosGenericos { 

        //Es necesario agregar <T> después de public para indicar que es un método generico
        //Ya que la clase no lo es.
        public <T> void m1 (T dato) {}
        public <T extends Number> void m2 (T dato) {} //Restricción de tipo
        public <T> T m3 () { 
            return (T) "Hola";
        }
        public <T> String tipo (T dato){
            return dato.getClass().getName();
        }
    }

    public static void main(String[] args) {

        Genericos<String> b1 = new Genericos<>("test");
        System.out.println(b1.getDato());
        Genericos<Integer> b2 = new Genericos<>(30);
        System.out.println(b2.getDato());
        Genericos<Float> b3 = new Genericos<>(1.3f);
        System.out.println(b3.getDato());
        print(b1);
        print(b2);
        print(b3);

        //Clase estandar
        Genericos<String> a1 = new Genericos<>("test");
        Genericos.GenericoRestrictivo ocr = a1.new GenericoRestrictivo<>(4);
        ocr.printB(ocr);

        //Clase static
        GenericoRestrictivoD d = new GenericoRestrictivoD<JButton>(new JButton("Haz clic aquí"));
        //d.printC(d);
        //d.printButton(new GenericoRestrictivoD<String>("Test"));//Error de compilación
        d.printButton(new GenericoRestrictivoD<JButton>(new JButton("Test")));//Error de compilación

        //Error de compilación -> MyClass<Number> m1 = new MyClass<Integer>();
        MyClass<? extends Number> m1 = new MyClass<Integer>();  // Correcto
        m1.print("m1");
        MyClass<Number> m2 = new MyClass<>();
        m2.print("m2");
        MyClass<?> m3 = new MyClass<Integer>();
        m3.print("m3");
        MyClass<Integer> m4 = new MyClass<Integer>();
        m4.print("m4");

        MetodosGenericos mg = new MetodosGenericos();
        System.out.println(mg.tipo("Test"));
        System.out.println(mg.tipo(50));
        System.out.println(""+mg.m3());
    }
}
