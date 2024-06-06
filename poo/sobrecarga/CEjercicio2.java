package poo.sobrecarga;

public class CEjercicio2 {

    static class Number {

        private int n;

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }
        
    }

    public static void main(String[] args) {
        Number num = new Number();
        processing(num);
        System.out.println(num.getN());

    }

    static void processing (Number x) {
        x.setN(x.getN()+5);
        System.out.println(x.getN());
    }
    
}

/*
 * What is the result?
 * 
 *   A. The output is 0
 *   B. The output is 5
 *   C. The output is 55
 *   D. Compilation fails
 */
