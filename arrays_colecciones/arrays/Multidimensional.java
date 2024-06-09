package arrays_colecciones.arrays;

public class Multidimensional {


    public static void main (String [] args) {
        //arrayRecorrido();
        //arraysIrregulares();
        //ejemplos();
        abreviaturas();
    }

    private static void abreviaturas() {
        //Creación abreviada
        int [][] auno = {{3,5,8,3}, {8,2,1}};

        //Array de array
        int [][] ados = new int[2][];
        ados[0] = new int[]{2,7,1};
        //Error, no se admité forma simplificada   -> ados[1] = {5,9};
    }

    public static void arrayRecorrido() {

        //Creación de array 
        int [][] ados;
        int [] adosd [];
        int adosa [][];
        int [][][] atres;
        int [] atresa [][];
        int [][][][][] multidimensional;

        //Asignar tamaño al array
        ados = new int [3][4]; //Array de 12 elementos
        atresa = new int [1][2][3]; //Array de 6 elementos

        //Acceso y asignación de valores
        ados[1][2] = 23;
        atresa [0][1][0] = 8;

        //Error de ejecución ->  atresa [0][4][0] = 8;
        /*
         * java.lang.ArrayIndexOutOfBoundsException
         */

        //Recorrido de un array

        int [][] nums = new int [4][6];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
        }

        System.out.println("For each o enhance");

        for (int[] i : nums) {
            for (int j : i) {
                System.out.println(j);
            }
        }

    }

    private static void arraysIrregulares() {
        int [][] a = new int [5][];
        int [][][] b = new int [4][][];
        int [][][] c = new int[2][10][];
        //Error de compilación  ->  int [][][] d = new int[5][][6];  

        a[0] = new int [4];
        a[2] = new int [7];

        b[1] = new int[4][2];

        c[0][0] = new int [6];
    }

    private static void ejemplos() {
        int[] a = new int[10];
        long[][] b = new long[2][3];
        int[][] c = new int[3][];
        long[][][] d = new long[5][][];

        //Instrucciones correctas
        b[0][0]=a[1];
        c[1]=a;
        d[0]=b;

        //Instrucciones incorrectas
        // No se ha dado tamaño a la segunda dimensión   -> c[0][0] = a[1];
        //En la primera dimension de c se debe asignar un array  -> c[2] = a[3]; 
        //tiene que ser  array de dos dimensiones d[1]= a;
        //misma dimensión, pero un array de int no se puede, asignara una variable array de long -> d[0]=c;
    }
    
}
