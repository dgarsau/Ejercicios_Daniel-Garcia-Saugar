package org.example;

import java.util.Scanner;

public class Bucles5 {
    public void bucles5(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una número:");
        int num = entrada.nextInt();

        for (int i = 1; i <=10 ; i++){

            System.out.println(i + "x" + num + "=" + i*num);

        }




    }

}
