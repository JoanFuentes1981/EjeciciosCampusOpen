package com.company;

public class Main {

    public static void main(String[] args) {
	// Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    //    numeros(1);
    // Crea un bucle While, este bucle tendrá que tener como condición que la variable numero While sea inferior a 3,
    // el bloque de código que tendrá el bucle deberá:
    // - Incrementar el valor de la variable en uno cada vez que se ejecute.
    // - Mostrarlo por pantalla cada vez que se ejecute.
    //  BuCleWhile();
    //  Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
    //  BluCleDoWhile();
    //  Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable
    //  sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
    //  BucleFor();
    //  Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
    //  Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en
    //  la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
        String estacion = "otoño";
        BucleSwitch(estacion);
    }

    private static void numeros(int numero) {
        if (numero == 0){
            System.out.println("Es igual a 0");
        } else if(numero < 0){
            System.out.println("Es Negativo");
        } else {
            System.out.println("Es Positivo");
        }
    }

    private static void BuCleWhile() {
        int valor = 0;
        while (valor <3 ){
            System.out.println(valor);
            valor = valor + 1 ;
        }
    }

    private static void BluCleDoWhile() {
        int valor = 0;
        do {
            System.out.println(valor);
            valor = valor + 1 ;
        } while (valor < 3);
    }


    private static void BucleFor() {
        int numero = 0;
        for (int i = 0; i <= 3 ; i++) {
            System.out.println(numero);
            numero = numero + 1;
        }
    }

    private static void BucleSwitch(String estacion) {
        switch (estacion){
            case "verano":
            case "VERANO":
                System.out.println("Disfruta del " + estacion + " a plenitud");
                break;
            case "invierno":
            case "INVIERNO":
                System.out.println("Disfruta del " + estacion + " a plenitud");
                break;
            case "primavera":
            case "PRIMAVERA":
                System.out.println("Disfruta de la " + estacion + " a plenitud");
                break;
            case "otoño":
            case "OTOÑO":
                System.out.println("Disfruta del " + estacion + " a plenitud");
                break;
            default:
                System.out.println(estacion + " No es una estación valida");
                break;
        }
    }

}
