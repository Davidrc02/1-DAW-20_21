package Ciclos;

import java.util.Scanner;

public class Ejercicio02 {
    /*Leer un número e indicar si es positivo o
    negativo. El proceso se repetirá hasta que 
    se introduzca un 0.
    */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num;
        System.out.println("Introduzca un número :");
        num=entrada.nextInt();
        while(num!=0){
            if(num>0){
                System.out.println("Es positivo");
            }
            else{
                System.out.println("Es negativo");
            }
            System.out.println("Introduzca otro número: ");
            num=entrada.nextInt();
        }
        System.out.println("El número que ha introducido es "+num);
        System.out.println("Fin del ejercicio");
    }  
}
