package org.example;

import java.util.Scanner;

public class PreMatrices4 {
    public void prematrices4(){

        Scanner entrada = new Scanner(System.in);
        int m;
        boolean primo=false;

        System.out.println("Introduzca el valor de m: ");
        m = entrada.nextInt();

        String primos="";

        for (int i = 1; i < m; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    primo=false;
                    break;
                }else{
                    primo=true;
                }
            }
            if(primo){
                primos=primos.concat(i + " ");
            }
        }

        System.out.println(primos);

    }
}
