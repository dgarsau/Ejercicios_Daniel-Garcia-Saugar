package org.example;

import java.util.Arrays;

public class Vectores9 {
    public void vectores9(){

        String vector1[]={"a","aa","aaaaa","aaaa"};
        System.out.println(Arrays.toString(vector1));
        String aux= "";
        int largo;

        for(int i=0; i<vector1.length; i++){
            largo=vector1[i].length();
            if(aux.length()<largo){
                aux=vector1[i];
            }
        }
        System.out.println("La palabra más larga es: " + aux);
    }
}
