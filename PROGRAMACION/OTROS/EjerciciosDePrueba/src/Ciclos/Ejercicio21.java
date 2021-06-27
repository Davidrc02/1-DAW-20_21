package Ciclos;

import java.util.Scanner;

public class Ejercicio21 {

/*
Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
*/
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num;
        boolean hayneg=false;
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduzca el número "+(i+1));
            num=entrada.nextInt();
            if(num<0){
                hayneg=true;
            }
        }
        if(hayneg==true){
        System.out.println("Hay al menos un número negativo");
        }
        else
            System.out.println("No hay negativos");
    }  
}
