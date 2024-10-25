package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PEejercicio7 {
    public void peejercicio7(){

        Scanner entrada = new Scanner(System.in);

        int cantidad=0;
        boolean error=true;
        int num1=0;
        int num2=1;
        int total=0;
        String secuencia = "Secuencia de Números: 0";

        while(error){

            try{
            System.out.println("¿Cuántos números quieres?");
            cantidad = entrada.nextInt();
            error=false;

            if(cantidad<=0){
                System.out.println("ERROR. La entrada no puede ser negativa o 0.");
                error=true;
            }

            }catch (InputMismatchException e){
            System.out.println("ERROR. La entrada no es válida.");
            entrada.nextLine();
            }
        }

        for(int i=1 ; i<cantidad ; i++){
            secuencia=secuencia.concat(String.valueOf(", " + num2));
            total=num1+num2;
            num1=num2;
            num2=total;

        }

        System.out.println(secuencia);
    }
}
