package org.example;

import java.util.Scanner;

public class Bucles7 {
    public void bucles7(){

        Scanner entrada= new Scanner(System.in);
        int num = 0;

        System.out.println("Introduce un número");
        num = entrada.nextInt();

        for (int i = num-1; i >= 1 ; i--){
            num*=i;
        }

        System.out.println(num);
    }
}
