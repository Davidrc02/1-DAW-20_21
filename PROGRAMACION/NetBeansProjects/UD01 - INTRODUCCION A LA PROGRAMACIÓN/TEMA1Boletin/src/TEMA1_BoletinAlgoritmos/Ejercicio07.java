package TEMA1_BoletinAlgoritmos;

import java.util.Scanner;

public class Ejercicio07 {

/*
Algoritmo que dado 2 números enteros muestre el doble del primero de ellos y el triple del segundo
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int num, num1, doble, triple;
        System.out.println("Introduzca un número");
        num=entrada.nextInt();
        System.out.println("Introduzca otro número");
        num1=entrada.nextInt();
        doble=2*num;
        triple=3*num1;
        System.out.println("Doble: "+doble+", Triple: "+triple);
    }
}