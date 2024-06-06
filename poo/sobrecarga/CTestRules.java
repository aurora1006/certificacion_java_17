package poo.sobrecarga;

/*
 * INSTRUCCIONES
 * Para comprender las reglas de la sobrecarga debes entender el orden para acceder al método. 
 * Si la primer regla no se cumple, se intenta la segunda y así sucesivamente
 * 
 *           REGLAS
 * 1. Se intenta Coincidencia exacta
 * 2. Se intenta Promoción de tipos
 * 3. Se intenta Autoboxing
 * 4. Se intenta número variable de argumentos
 * 
 * Esta clase te permite observar como funciona cada una de las reglas.
 * 
 * Nota: Recuerda que cada que comentes un método debes compilar el proyecto
 */
public class CTestRules {

    //Coincidencia exacta (Comenta este método para probar la siguiente regla)
    static void operacion(int a) {
        System.out.println("COINCIDENCIA EXACTA");
    }

    //Promoción de tipos (Comenta este método para probar la siguiente regla)
    static void operacion(long b) {
        System.out.println("PROMOCIÓN DE TIPO");
    }

    //Autoboxing Clase envoltorio (Comenta este método para probar la siguiente regla)
    static void operacion(Integer c) {
        System.out.println("AUTOBOXING");
    }

    //Si no hay autoboxing, se intenta número variable de argumentos
    static void operacion(int d, int e) {
        System.out.println("NÚMERO VARIABLE DE ARGUMENTOS");
    }

    public static void main(String[] args) {
        operacion(1);
        //Descomenta la llamada al método con dos argumentos para probar la última regla.
        //operacion(1, 0);
    }
    
}
