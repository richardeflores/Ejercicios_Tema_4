public class Main {
    public static void main(String[] args) {

        //Utilizando condicionales
        int numeroIf = -0;


        if (numeroIf < 0) {
            System.out.println("El número es negativo");
        }
        else if (numeroIf ==0) {
            System.out.println("El número es cero");
        }
        else {
            System.out.println("El número es positivo");
        }

        //Ejercicio con While
        int  numeroWhile = 0;

        while (numeroWhile <3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //Ejercicio Do-While
        int numeroDoWhile = 1;

        do {
            System.out.println("Número Do-While es:"+ numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 1;
        } while (numeroDoWhile < 2);

        //Ejercicio Bucle for

        for(int numeroFor =0; numeroFor<3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //Ejercicio Switch
        var estacion = "Otoño";

        switch (estacion) {
            case "Primavera":
                System.out.println("Estamos en primavera");
                break;

            case "Verano":
                System.out.println("Estamos en Verano");
                break;

            case  "Otoño":
                System.out.println("Estamos en Otoño");
                break;

            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;

            default:
                System.out.println("Esta no es una estación del año");
        }

    }


}