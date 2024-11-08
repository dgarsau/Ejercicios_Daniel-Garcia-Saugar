package org.example;

import java.util.Arrays;

public class Vectores7 {
    public void vectores7() {

        int array1[] = {1, 2, 3};
        int array2[] = {4, 5, 6};
        int array_combinado[] = new int[array1.length + array2.length];

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array_combinado.length; i++) {
            if (i < array_combinado.length / 2) {
                array_combinado[i] = array1[i];
            } else {
                array_combinado[i] = array2[i - array_combinado.length / 2];
            }
        }
        System.out.println(Arrays.toString(array_combinado));
    }
}
