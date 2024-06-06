package poo.sobrecarga;

/*
 * Al envíar un primitivo o un objeto inmutable Ej.String
 * se genera una copia del dato, 
 * por lo tanto, lo que le ocurra a la variable dentro del método no afecta el valor de la variable original.
 * 
 * Por otro lado,
 * 
 * Al enviar un objeto mutable Ej.StringBuilder
 * se envía una referencia que apunta al mismo objeto
 * por lo tanto, la modificación al objeto se visualizara en cualquier variable que haga referencia a ese objeto.
 */

public class CTestParams {

    static class OperacionPrimitiva {
        public void incrementar (int a) { //  'a' es una copia 
            a += 2;
            System.out.println("Dentro del método a =  " +a); // a = 2   solo aquí
        }
    }

    static class OperacionObjetoMutable {
        public void incrementar (StringBuilder b) {//  'b' es una referencia del objeto
            b.append(" dos");
            System.out.println("Dentro del método b = " +b); // b = "uno dos" en cualquier variable que tenga la referencia
        }
    }

    static class OperacionObjetoInmutable {
        public void incrementar (String c) {//  'c' es una copia 
            c += " dos";
            System.out.println("Dentro del método  c = " +c); // c = "uno dos"   solo aquí
        }
    }

    public static void main(String[] args) {
        
        int a = 0;
        StringBuilder b = new StringBuilder("uno");
        String c = "uno";

        OperacionPrimitiva operp = new OperacionPrimitiva();
        operp.incrementar(a);

        OperacionObjetoMutable operom = new OperacionObjetoMutable();
        operom.incrementar(b);

        OperacionObjetoInmutable operoi = new OperacionObjetoInmutable();
        operoi.incrementar(c);

        System.out.println("En main a = "+a); // 0
        System.out.println("En main b = "+b); // uno dos
        System.out.println("En main c = "+c); // uno
    }

}