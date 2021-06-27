package Arrays;

import java.util.Scanner;

public class LlenarUnArray {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int TAM;
        System.out.println("Introduzca el tamaño del array:");
        TAM=entrada.nextInt();
        char[] letras=new char[TAM];
        
        System.out.println("Digite los elementos del array");
        for (int i = 0; i < TAM; i++) {
            System.out.println("Elemento número "+(i+1)+": ");
            letras[i]= entrada.next().charAt(0);
        }
        System.out.println("Los caracteres del array son: ");
        for (int i = 0; i < TAM; i++) {
            System.out.println(letras[i]);
        }
    }
}
