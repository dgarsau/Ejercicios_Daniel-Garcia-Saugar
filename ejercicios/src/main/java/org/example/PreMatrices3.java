package org.example;

public class PreMatrices3 {
    public void prematrices3(){

        for (int i = 1; i <= 10; i++) {

            System.out.println("TABLA DEL " + i);

            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println("_______________________________");
        }

    }
}
