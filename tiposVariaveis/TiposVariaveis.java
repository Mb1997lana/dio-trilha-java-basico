package tiposVariaveis;

public class TiposVariaveis {

    public static void main(String[] args) {
        System.out.println ("Hello World!");

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short getNumeroCurto2 = (short) numeroNormal;
        //casting
        int numero = 5;
        numero = 10;
        System.out.println (numero);

        final double VALOR_DE_PI = 3.14;
            System.out.println (VALOR_DE_PI);
    }

}