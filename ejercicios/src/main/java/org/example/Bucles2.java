package org.example;

import java.util.Scanner;

public class Bucles2 {
    public void bucles2(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num = entrada.nextInt();

        for(int i=num; i>=1; i--){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
