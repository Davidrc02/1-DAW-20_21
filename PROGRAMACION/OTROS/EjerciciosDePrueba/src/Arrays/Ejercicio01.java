package Arrays;

import java.util.Scanner;

public class Ejercicio01 {

/*
Ejercicio 1: Leer 5 numeros, guardarlos en un array 
y mostrarlos en el mismo orden introducido.
*/
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int[] numeros= new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca el digito "+(i+1)+": ");
            numeros[i]=entrada.nextInt();
        }
        System.out.println("Los numeros introducidos son: ");
        for (int i:numeros) {
            System.out.println(i);
        }
    }   
}
