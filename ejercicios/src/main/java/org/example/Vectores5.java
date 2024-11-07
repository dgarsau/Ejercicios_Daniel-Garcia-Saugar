package org.example;

import java.util.Arrays;

public class Vectores5 {
    public void vectores5(){

        int vector[]={1,2,3,4,5};

        int aux;
        int ultima = vector[vector.length-1];

        System.out.println(Arrays.toString(vector));

        for (int i = vector.length-1; i >= 0; i--) {

            if (i==0){
                vector[i]=ultima;
            }else{
                vector[i]=vector[i-1];
            }
        }

        System.out.println(Arrays.toString(vector));


    }
}
