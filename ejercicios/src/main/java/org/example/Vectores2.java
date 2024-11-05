package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vectores2 {
    public void vectores2() {

        int vector[] = {1, 2, 3, 4, 5};
        int aux;

        System.out.println(Arrays.toString(vector));

        for (int i = 0; i < vector.length/2; i++) {
            aux = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = aux;
        }

        System.out.println(Arrays.toString(vector));
    }
}
