package org.example;

import java.util.Arrays;

public class Vectores7 {
    public void vectores7(){

        int array1[]={1,2,3};
        int array2[]={4,5,6};
        int array_combinado[] = new int [array1.length+array2.length];

        for(int i=0; i<array_combinado.length; i++){
            array_combinado[i]=array1[i];
            array_combinado[array1.length-1+i]=array2[i];
        }
        System.out.println(Arrays.toString(array_combinado));

    }
}
