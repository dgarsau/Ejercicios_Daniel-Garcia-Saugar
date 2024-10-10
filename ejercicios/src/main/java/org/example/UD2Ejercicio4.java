package org.example;
import java.util.Scanner;

public class UD2Ejercicio4 {
    public void UD2ejercicio4(){

        Scanner entrada = new Scanner(System.in);

        String espacio = " ";

        System.out.println("PROGRAMA PARA VER CUANTAS VECES APARECE UNA PALABRA EN UN TEXTO");

        System.out.println("Introduce el texto:");
        String texto = entrada.nextLine();
        texto=texto.concat(" ");
        texto=espacio.concat(texto);
        texto=texto.replaceAll("[^\\p{Alpha}]+"," ");
        texto=texto.toLowerCase();

        System.out.println("Introduce la palabra:");
        String subcadena = entrada.nextLine();
        subcadena=subcadena.concat(" ");
        subcadena=espacio.concat(subcadena);
        subcadena=subcadena.replaceAll("[^\\p{Alpha}]+"," ");
        subcadena=subcadena.toLowerCase();

        int posicion = 0;
        int veces = 0;

        posicion = texto.indexOf(subcadena,posicion);

        while (posicion>=0) {

            posicion = texto.indexOf(subcadena,posicion+1);
            veces +=1;

        }

        System.out.println("La palabra aparece " + veces + " veces en el texto.");



//        ASÍ LO HICE AL PRINCIPIO PARA VER COMO PODRÍA HACERLO DEJANDO QUE EL USUARIO
//        INTRODUZCA LAS VARIABLES, EL WHILE SE ME OCURRIO PORQUE AL AÑADIR UNO A LA
//        A LA POSICIÓN DE LA ÚLTIMA PALABRA ME DABA SIEMPRE VALOR -1, LA LINEA DE ANTES
//        DEL WHILE LA HE PUESTO PORQUE COMO SUMO UNO A LA POSICION DENTRO DEL WHILE, NO ME
//        CONTABA LAS PALABRAS QUE ESTUVIESEN AL PRINCIPIO DEL TEXTO


//        String texto = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
//        String subcadena = "Mundo";
//
//        int veces = 0;
//
//        int posicion = texto.indexOf(subcadena);
//        System.out.println(posicion);
//
//        veces += 1;
//
//        int posicion2 = texto.indexOf(subcadena,posicion+1);
//        System.out.println(posicion2);
//
//        veces += 1;
//
//        int posicion3 = texto.indexOf(subcadena,posicion2+1);
//        System.out.println(posicion3);
//
//        veces += 1;
//
//        int posicion4 = texto.indexOf(subcadena,posicion3+1);
//        System.out.println(posicion4);
//
//        System.out.println("El texto aparece " + veces + " veces.");


    }

}
