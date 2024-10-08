package org.example;

import java.util.Scanner;

public class UD2Ejercicio3 {


    public void UD2ejercicio3(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num = entrada.nextInt();

        String cadena = Integer.toString(num);

        System.out.println("¿Cuántas cifras quieres quitar?");
        int cifras = entrada.nextInt();

        int longitud = cadena.length();
        int quitar = longitud-cifras;

        String trozo = cadena.substring(0,quitar);
        System.out.println("El número es = " + trozo);



    }
}

