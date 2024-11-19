package org.example;

import java.util.Scanner;

public class PreMatrices2 {
    public void prematrices2(){

        Scanner entrada = new Scanner(System.in);

        int altura;
        String arbol="*";

        System.out.println("Cómo de alto quieres el arbol: ");
        altura = entrada.nextInt();

        for (int i = 1; i <=altura ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


//        for (int i = 1; i <= altura; i++) {
//            System.out.println(arbol);
//            arbol=arbol.concat("*");
//        }

    }
}
