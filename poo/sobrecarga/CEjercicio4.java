package poo.sobrecarga;

public class CEjercicio4 {
    int a;
    static int b;
    static {
        b++;
    }

    CEjercicio4(){
        while(a<5){
            b++;
            a++;
        }
    }

    public static void main(String[] args) {
        CEjercicio4 t1 = new CEjercicio4();
        CEjercicio4 t2 = new CEjercicio4();
        System.out.println(t1.a+" : "+t2.b);
    }
}

/*
 *  Which is the result?
 * 
 *   A. 10:10
 *   B. 5:10
 *   C. 5:11
 *   D. 11:5
 *   E. Compilation fails
 */

