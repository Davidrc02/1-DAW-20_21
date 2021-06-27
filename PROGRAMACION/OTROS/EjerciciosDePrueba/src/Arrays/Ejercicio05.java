package Arrays;

import java.util.Scanner;

public class Ejercicio05 {

/*
Leer por teclado dos tablas de 10 números enteros y mezclarlas en una 
tercera de la forma: el 1º de A, el 1ºde B, el 2º de A, el 2º de B, etc.
*/
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerosA[] = new int[10];
        int numerosB[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite el número "+(i+1)+" de la clase A");
            numerosA[i] = entrada.nextInt();
            System.out.println("Digite el número "+(i+1)+" de la clase B");
            numerosB[i] = entrada.nextInt();
        }    
        for (int i = 0; i < 10; i++) {
            System.out.println("El "+(i+1)+"º de A: "+numerosA[i]);
            System.out.println("El "+(i+1)+"º de B: "+numerosB[i]);         
        }
    }   
}
