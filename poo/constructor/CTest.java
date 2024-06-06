package poo.constructor;

public class CTest {
    
    //Sobrecarga de constructores
    public CTest(){}
    public CTest(byte a){}
    public CTest(boolean a){}
    public CTest(short a){}
    public CTest(long a){}
    protected CTest(double a){}
    public CTest(float a, float b){}
    public CTest(char a){}
    public CTest(Integer a){}
    private CTest(int a){
        System.out.println("a = "+a);
    }

    //Llamar a constructor desde otro constructor con this
    public CTest(float f){
        this(10);  //Siempre debe colocarse en la primer línea y sólo se puedes usar this una única vez
        System.out.println("f = "+ f);
    }

    public static void main(String[] args) {
        CTest t = new CTest(3.1f);
    }
}
