package org.example;

import java.util.Scanner;

public class case_ejemplo2 {

    public void ejemplo2(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número (1-7)");
        String num = entrada.next();

        switch (num){
            case "1":
                System.out.println("1-Lunes");
                break;
            case "2":
                System.out.println("2-Martes");
                break;
            case "3":
                System.out.println("3-Miercoles");
                break;
            case "4":
                System.out.println("4-Jueves");
                break;
            case "5":
                System.out.println("5-Viernes");
                break;
            case "6":
                System.out.println("6-Sábado");
                break;
            case "7":
                System.out.println("7-Domingo");
                break;
            default:
                System.out.println("Error. Tiene que ser un num entre 1 y 7");

        }
    }
}
