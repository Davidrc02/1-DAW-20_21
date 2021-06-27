package TEMA1_BoletinAlgoritmos;

import java.util.Scanner;

public class Ejercicio01{

/*
Algoritmo que solicite dos números
enteros por teclado, los sume y visualice el resultado    
*/    
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int num, num1, suma;
        System.out.println("Introduzca el primer digito");
        num=entrada.nextInt();
        System.out.println("Introduzca el segundo número");
        num1=entrada.nextInt();
        suma=num+num1;
        System.out.println("La suma es: "+suma);
    }
}
