package TEMA1_BoletinAlgoritmos;

import java.util.Scanner;

public class Ejercicio02 {

/*
Algoritmo que solicite un número y muestre su cuadrado
*/

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num, cuadrado;
        System.out.println("Introduzca un número");
        num=entrada.nextInt();
        cuadrado=num*num;
        System.out.println("El cuadrado de "+num+ " es: "+cuadrado);
    }
    
}
