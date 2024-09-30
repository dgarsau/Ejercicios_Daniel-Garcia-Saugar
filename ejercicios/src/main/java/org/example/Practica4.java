package org.example;

import java.util.Scanner;


public class Practica4 {
    public void practica4() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el multiplicando (tres cifras):");
        int mult1 = entrada.nextInt();

//        while (mult1>999 || mult1<100){
//            System.out.println("El número tiene que tener 3 cifras"){
//
//            }
//        }

        System.out.println("Introduce el multiplicador (tres cifras):");
        int mult2 = entrada.nextInt();

        int resultado = mult1 * mult2;

        System.out.println("El producto de la multiplicación es: " + resultado);

        String multC = Integer.toString(mult2);
        String num3S = multC.substring(2,3);
        int cifra3 = Integer.parseInt(num3S);

        String num2S = multC.substring(1,2);
        int cifra2 = Integer.parseInt(num2S);

        String num1S = multC.substring(0,1);
        int cifra1 = Integer.parseInt(num1S);


        System.out.println("El proceso es:");
        System.out.println("  "+ mult1);
        System.out.println("x " +mult2);
        System.out.println("______");

//        if(mult1<0 && mult2>0){
//            mult1=mult1*(-1);
//        }


        int num3 = cifra3*mult1;


        System.out.println("  " +num3);


        int num2 = cifra2*mult1;
        System.out.println(" " +num2);

        int num1 = cifra1*mult1;
        System.out.println("" +num1);

        System.out.println("______");
        System.out.println(resultado);




//        String num2S = mult2C.substring(1,1);
//        int num2 = Integer.parseInt(num2S);
//
//        String num1S = mult2C.substring(0,0);
//        int num1 = Integer.parseInt(num1S);
//
//        System.out.println(num3*mult1);







        System.out.println("El proceso es:");








    }

}