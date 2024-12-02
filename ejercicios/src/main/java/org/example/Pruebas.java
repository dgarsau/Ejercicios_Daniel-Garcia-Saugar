package org.example;

import java.util.Random;

public class Pruebas {
    public void pruebas(){

        Random random = new Random();
        int aux;

        do{
            aux= random.nextInt(10,40);
            System.out.println(aux);
        }while(aux<40);

    }
}