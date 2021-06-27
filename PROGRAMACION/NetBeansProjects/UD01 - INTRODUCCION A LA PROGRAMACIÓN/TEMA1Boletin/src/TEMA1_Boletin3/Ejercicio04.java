package TEMA1_Boletin3;

import java.util.Scanner;

public class Ejercicio04 {

/*
Escribe un programa que imprima los cinco primeros números
enteros positivos y  calcule su suma y  su multiplicación.    
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int suma=0, producto=1;
        for (int i = 0; i < 5; i++) {
            suma=suma+i;
            producto=producto*i;
        }
        System.out.println("La suma de los 5 primeros números enteros positivos es: "+suma
                +" y su producto es: "+producto);
    } 
}
