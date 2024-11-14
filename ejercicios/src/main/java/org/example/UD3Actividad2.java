package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class UD3Actividad2 {
    public void UD3actividad2() {

        Random random = new Random();

        int[] vector = {4, 8, 9, 1, 2, 2, 1, 3};

        Arrays.sort(vector);

        // Eliminar duplicados usando un array auxiliar y copiando elementos a array nuevo.
//        int j=0;
//        int[] vector2 = new int[vector.length];
//
//        for(int i =0; i<vector.length-1 ; i++){
//
//            if(vector[i]!=vector[i+1]){
//                vector2[j]=vector[i];
//                j++; //Esto es para dejar los 0 al final
//            }
//        }

        // Eliminar duplicados modificando en directo el mismo array copiando elementos a array nuevo.

//        int aux;
//        int aux2=0;
//
//        for (int i = 0; i < vector.length - 1; i++) {
//
//            if (vector[i] == vector[i + 1]) {
//                aux = vector[vector.length -1 -aux2];
//                vector[vector.length - 1 - i] = vector[i+1];
//                vector[i+1]=aux;
//                aux2++;
//            }
//        }
//
//        int[] vector2 = new int[vector.length-1 -aux2];
//        for (int i = 0; i < vector2.length; i++){
//            vector2[i]=vector[i];
//        }
//
//        Arrays.sort(vector2);
//        System.out.println(Arrays.toString(vector2));

        //Volver a recalcular el valor duplicado aleatoriamente.

        int aux=1;

        for (int i = 0; i < vector.length - 1; i++) {

            do{
                aux = random.nextInt(10)+1;
            }while(Arrays.asList(vector).contains(aux));

            if (vector[i] == vector[i + 1]) {
                vector[i + 1] = aux;
            }
            Arrays.sort(vector);

        }

        System.out.println(Arrays.toString(vector));




    }
}

