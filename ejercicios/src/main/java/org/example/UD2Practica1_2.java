package org.example;

import java.util.Scanner;

public class UD2Practica1_2 {
    public void UD2practica1_2(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):");
        String fecha_nacimiento = entrada.next();

        char caracter1 = fecha_nacimiento.charAt(2);
        char caracter2 = fecha_nacimiento.charAt(5);

        int dia_int = 0;
        int mes_int = 0;
        int anyo_int = 0;
        int sum_1 = 0;


        boolean error = true;

        while (error){

            if (fecha_nacimiento.length()!=10 || caracter1!='/' && caracter2!='/'){
                System.out.println("Formato incorrecto. Vuelve a introducir tu fecha de nacimiento (dd/mm/aaaa):");
                fecha_nacimiento = entrada.next();
                caracter1 = fecha_nacimiento.charAt(2);
                caracter2 = fecha_nacimiento.charAt(5);

            } else{
                error = false;
            }

            String dia = fecha_nacimiento.substring(0, 2);
            String mes = fecha_nacimiento.substring(3, 5);
            String anyo = fecha_nacimiento.substring(6, 10);

            dia_int = Integer.parseInt(dia);
            mes_int = Integer.parseInt(mes);
            anyo_int = Integer.parseInt(anyo);
            sum_1 = dia_int+mes_int+anyo_int;

            if (dia_int>31 || dia_int<0 || mes_int>12 || mes_int<0) {
                System.out.println("Fecha incorrecta. Vuelve a introducir tu fecha de nacimiento (dd/mm/aaaa):");
                fecha_nacimiento = entrada.next();
                error = true;
            }

        }

        System.out.println(dia_int + "+" + mes_int + "+" + anyo_int + "=" + sum_1);

        String sum_string = Integer.toString(sum_1);
        String cifra1 = sum_string.substring(0, 1);
        String cifra2 = sum_string.substring(1, 2);
        String cifra3 = sum_string.substring(2, 3);
        String cifra4 = sum_string.substring(3, 4);

        int cifra1_int = Integer.parseInt(cifra1);
        int cifra2_int = Integer.parseInt(cifra2);
        int cifra3_int = Integer.parseInt(cifra3);
        int cifra4_int = Integer.parseInt(cifra4);

        int sum_2 = cifra1_int+cifra2_int+cifra3_int+cifra4_int;
        System.out.println(cifra1_int + "+" + cifra2_int + "+" + cifra3_int + "+" + cifra4_int + "=" + sum_2);


    }

}

