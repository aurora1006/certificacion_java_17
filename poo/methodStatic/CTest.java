package poo.methodStatic;

public class CTest {

    int num;
    static String exclamacion; 
    static int nums;
    static int n=0;

    //Bloque estatico
    //Se ejecuta una vez durante la vida de una clase
    //Solo puede acceder a otros miembros estaticos
    static{
        n++;
        imprimir("Hola marciano");
    }

    public int getNS(){return n;}

    //Los métodos static no están asociados a ningún objeto de la clase
    //No va usar atributos de la clase, salvo que sean static
    //No se puede usar en  su interior <this> ni <super>
    public static String saludo (String nombre){
        return "Hola "+nombre;
    }

    static void imprimir(String saludo){
        System.out.println(saludo);
        //Error de compilación -> respuesta("Bienvenido")
    }

    void respuesta(int increase){
        nums +=increase;
    }

    public int getN(){
        return nums;
    }

    public void inc(){
        num++;
    }

    public int getNum(){
        return num;
    }


    public static void main(String[] args) {
        //No es necesario crear un objeto para llamarlo, se utiliza el nombre de la clase CTest.saludo(...)
        String saludo = CTest.saludo("terricola");
        exclamacion = "!";
        imprimir(saludo+exclamacion);
        //Error de compilación -> int a = num * 2;

        CTest t1 = new CTest();
        t1.respuesta(3);
        System.out.println(t1.getN());//3
        CTest t2 = new CTest();
        t2.respuesta(2);
        System.out.println(t1.getN());//5
        System.out.println(t2.getN());//5

        CTest t3 = new CTest();
        t3.inc();
        CTest t4 = new CTest();
        t4.inc();
        t4.inc();
        System.out.println(t3.getNum());//1
        System.out.println(t4.getNum());//2


        //Bloque static
        CTest t5 = new CTest();
        CTest t6 = new CTest();
        System.out.println(t5.getNS());//1
        System.out.println(t6.getNS());//1

    }
    
}
