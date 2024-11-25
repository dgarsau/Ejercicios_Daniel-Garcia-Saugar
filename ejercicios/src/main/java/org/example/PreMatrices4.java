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

        bucle1:
        for (int i = 2; i < m; i++) {

            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    continue bucle1;
                }
            }
            System.out.print(i + " ");
        }


//        for (int i = 2; i < m; i++) {
//            primo = true;
//            for (int j = 2; j < i; j++) {
//                if(i%j==0){
//                    primo=false;
//                    break;
//                }
//            }
//            if(primo){
//                primos=primos.concat(i + " ");
//            }
//        }
//        System.out.println(primos);
    }
}
