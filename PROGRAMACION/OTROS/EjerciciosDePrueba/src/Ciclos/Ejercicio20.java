package Ciclos;

import java.util.Scanner;

/*
Pedir un numero N, introducir N sueldos y mostrar el sueldo máximo.
*/

public class Ejercicio20 {

    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        int N, sueldo, sueldomax=0;
        System.out.println("Introduzca N: ");
        N=entrada.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Introduzca el sueldo número "+(i+1));
            sueldo=entrada.nextInt();
            if(sueldo>sueldomax){
                sueldomax=sueldo;
            }
        }
        System.out.println("El sueldo máximo es de "+sueldomax+"$.");
    }
}
