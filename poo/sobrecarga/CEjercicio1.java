package poo.sobrecarga;

public class CEjercicio1 {

    static int sum (Integer a, int b){return a+b;}
    static long sum (long x, int y) {return x+y+10;}
    static double sum (int n, double r) {return n+r;}

    public static void main(String[] args) {
        //System.out.println(sum(3,2));
    }
}

/*
 * What is the result?
 * 
 *   A. The output is 5
 *   B. The output is 15
 *   C. The output is 5.0
 *   D. Compilation will fail
 *   E. It will throw an Exception
 */