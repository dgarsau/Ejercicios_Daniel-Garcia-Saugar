package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Vectores6 {
    public void vectores6(){

        Scanner entrada = new Scanner(System.in);
        boolean simetrico=false;

        System.out.println("De cuántos dígitos quieres el array:");
        int vector[]= new int[entrada.nextInt()];

        System.out.println("Introduce los números del array:");
        for(int i=0; i< vector.length; i++){
            vector[i]=entrada.nextInt();
        }

        System.out.println(Arrays.toString(vector));

        for(int i=0; i< vector.length; i++){

            if(vector[i]!=vector[vector.length-1-i]) {
                System.out.println("Es simétrico: NO");
                simetrico=false;
                break;
            }else{
                simetrico=true;
            }
        }
        if(simetrico){
            System.out.println("Es simétrico: SI");
        }
    }
}
