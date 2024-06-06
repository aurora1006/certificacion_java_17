package poo.constructor;

public class CBloqueInit {

    //Bloque de inicialización de instancia
    {
        System.out.println("Bloque de inicialización de instancia");
    }

    public CBloqueInit(){
        System.out.println("Constructor ejecutado.");
    }

    public static void main(String[] args) {
        CBloqueInit a = new CBloqueInit();
        CBloqueInit b = new CBloqueInit();
    }

}
