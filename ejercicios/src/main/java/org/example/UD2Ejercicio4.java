package org.example;

public class UD2Ejercicio4 {
    public void UD2ejercicio4(){

        String texto = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
        String subcadena = "Mundo";




//        while () {
//            int posicion = texto.indexOf(subcadena);
//            System.out.println(posicion);
//
//        }

        int posicion = texto.indexOf(subcadena);
        System.out.println(posicion);

        int posicion2 = texto.indexOf(subcadena,posicion+1);
        System.out.println(posicion2);

        int posicion3 = texto.indexOf(subcadena,posicion2+1);
        System.out.println(posicion3);

        int posicion4 = texto.indexOf(subcadena,posicion3+1);
        System.out.println(posicion4);


    }

}
