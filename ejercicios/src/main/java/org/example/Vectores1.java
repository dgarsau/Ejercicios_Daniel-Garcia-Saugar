package org.example;

import java.util.Random;

public class Vectores1 {
    public void vectores1(){

        Random random = new Random();

        int vector[] = new int[8];
        int total=0;
        int sum=0;
        random.nextInt();

        for(int i=0; i<vector.length; i++){
            vector[i] = random.nextInt(501);
            System.out.println(vector[i]);
            total+=vector[i];
        }

        System.out.println("La suma de los 8 números aleatorios es: " + total);

    }
}
