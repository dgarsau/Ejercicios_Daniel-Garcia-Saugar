package org.example;

import java.util.Scanner;

public class PEejercicio4 {
    public void peejercicio4(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la nota");
        String nota = entrada.next();


        switch(nota){
            case "0","1","2","3","4":
                System.out.println("Insuficiente");
                break;

            case "5":
                System.out.println("Suficiente");
                break;

            case "6":
                System.out.println("Bien");
                break;

            case "7","8":
                System.out.println("Notable");
                break;

            case "9","10":
                System.out.println("Sobresaliente");
                break;

            default:
                System.out.println("No válido");

        }




    }
}
