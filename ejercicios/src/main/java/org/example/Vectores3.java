package org.example;

import java.util.Random;
import java.util.Scanner;

public class Vectores3 {
    public void vectores3(){

        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int vector[] = new int[25];
        int numero;
        int veces=0;


        for(int i=0; i<vector.length; i++) {
            vector[i] = random.nextInt(0,100);
        }

        System.out.println("Ingresa un número para buscar [0,100]");
        numero= entrada.nextInt();

        for(int i=0; i<vector.length; i++){
            if(vector[i]==numero){
                veces++;
            }
        }

        System.out.println("El número " + numero + " aparece " + veces + " en el array.");
    }
}
