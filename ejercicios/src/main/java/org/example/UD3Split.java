package org.example;

import java.util.Scanner;

public class UD3Split {
    public void UD3split(){

        Scanner entrada = new Scanner(System.in);

        String navidad = "NAVIDAD", cantidad="";
        String[] palabras = navidad.split("");
        String resultado="";

        System.out.println("¿Cuántas veces quieres cada letra");
        cantidad=entrada.nextLine();
        String[] cantidades = cantidad.split(" ");

        for (int i = 0; i < cantidades.length; i++) {

            for(int j=0; j<Integer.parseInt(cantidades[i]);j++){
                resultado = resultado + palabras[i];
            }

        }
        System.out.println(resultado);







    }
}
