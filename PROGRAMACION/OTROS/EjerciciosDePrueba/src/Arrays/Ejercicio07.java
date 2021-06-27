package Arrays;

import java.util.Scanner;

public class Ejercicio07 {

/*
Leer por teclado una serie de 10 números enteros.
La aplicación debe indicarnos si los números están
ordenados de forma creciente, decreciente, o si están desordenados.    
*/    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numeros[]= new int[10];
        boolean creciente=false, decreciente=false;
        
        System.out.println("Llena el array");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite el número "+(i+1));
            numeros[i]=entrada.nextInt();
        }
        
        for (int i = 0; i < 9; i++) {
            if(numeros[i]<numeros[i+1]){
                creciente=true;
            }
            if(numeros[i]>numeros[i+1]){
                decreciente=true;
            }  
        }
        if(creciente==true && decreciente==false){
            System.out.println("El array está en forma creciente");
        }
        else if(creciente==false && decreciente==true){
            System.out.println("El array está en forma decreciente");
        }
        else if(creciente==true && decreciente==true){
            System.out.println("El array está desordenado");
        }
        else if(creciente==false && decreciente==false){
            System.out.println("Todos los números del array son iguales");
        }
    }
    
}
