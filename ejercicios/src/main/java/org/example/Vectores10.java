package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Vectores10 {
    public void vectores10(){

        Scanner entrada = new Scanner(System.in);
        String string;
        Character letra;

        String vector1[]={"lorem","ipsum","bibendum","id", "euismod"};

        System.out.println(Arrays.toString(vector1));

        System.out.println("¿Qué letra quieres buscar?");
        string = entrada.next();
        string = string.toLowerCase();
        letra = string.charAt(0);

        for(int i=0 ; i<vector1.length ; i++){
            if(vector1[i].charAt(0)==letra){
                System.out.println(vector1[i]);
            }
        }
    }
}
