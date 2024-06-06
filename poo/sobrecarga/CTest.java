package poo.sobrecarga;

public class CTest {
    
    public static int operacion (int a, int b) {
        System.out.println("int int " + (a+b));
        return a + b;
    }

    public static void operacion (String a) {
        System.out.println("String a : "+ a );
    }

    public static int operacion (int a, long b) {
        System.out.println("int long " + a + (int)b );
        return a + (int)b;
    }

    public static int operacion (Integer a, long b) {
        System.out.println("Integer long: "+ a + (int)b + 1);
        return a + (int)b + 1;
    }

    public static void operacion (float a, int b) {
        System.out.println("float int concatenar: "+ a + Integer.toBinaryString(b));
        System.out.println("float int sumar: "+ (a+b));
    }

    public static void operacion (int a, double b) {
        System.out.println("int double " + (a + b) );
    }

    //Los métodos son sensibles a mayúsculas por lo cual esta NO es una sobrecarga
    public static int Operacion (Integer a, long b) {
        System.out.println("Operacion Integer long: "+ a + (int)b);
        return a + (int)b;
    }

    public static void main(String[] args) {
        System.out.println("Sobrecarga de métodos");

        long b = 3;
        float c = 3.2f;
        int d = 0b1010; //Valor 10
        double e = 4;

        operacion(1,2);
        operacion("hola");
        operacion(2, b);
        operacion(Integer.valueOf(2), b);
        operacion(c, d);
        operacion(1, e);
        Operacion(Integer.valueOf(1), b);
    }
}
