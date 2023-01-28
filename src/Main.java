public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int numeroIf = 0;
        if (numeroIf < 0) {
            System.out.println("La variable numeroIf " + numeroIf + " es negativo");
        } else if (numeroIf > 0) {
            System.out.println("La variable numeroIf " + numeroIf + " es positivo");
        } else {
            System.out.println("La variable numeroIf es 0");
        }

        int numeroWhile = 0;

        while(numeroWhile < 3) {
            ++numeroWhile;
            System.out.println("La variable numeroWhile ahora vale: " + numeroWhile);
        }

        int doWhile = 0;

        do {
            ++doWhile;
            System.out.println("La variable doWhile ahora vale: " + doWhile);
        } while(doWhile < 3);


        for (int numeroFor = 0; numeroFor <= 5; ++numeroFor ) {
            System.out.println("La variable numeroFor ahora vale: " + numeroFor);
        }


        var Estación = "primavera";

        switch (Estación) {
            case "verano":
                System.out.println("Es verano. ");
                break;
            case "otoño":
                System.out.println("Es otoño. ");
                break;
            case "invierno":
                System.out.println("Es invierno. ");
                break;
            case "primavera":
                System.out.println("Es primavera. ");
                break;
            default:
                System.out.println("No es una estación. ");
        }





    }
}
