package Ciclos;

import java.util.Scanner;

public class Ejercicio16 {

/*
Pide un numero entre 1 y 10 y mostrar 
la tabla de multiplicar de dicho número
*/
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num, resultado;
        System.out.println("Introduzca un número del 1 al 10");
        num=entrada.nextInt();
        if(num>0&&num<11){
            for (int i = 0; i <= 10; i++) {
                resultado=i*num;
                System.out.println(i+"x"+num+" = "+resultado);   
            }
        }else
            System.out.println("El numero introducido es incorrecto");
    } 
}
