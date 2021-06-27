package Ejercicio1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int TAM;
        System.out.println("Introduzca el tamaño del array");
        TAM=entrada.nextInt();
        int[] vector1= new int[TAM];
        cargarVector(vector1);
        mostrarVector(vector1);
    }
    
    public static void cargarVector(int[] numeros){
             Scanner entrada = new Scanner(System.in);
             for(int i=0; i<numeros.length; i++){
             System.out.println("Introduzca el valor de la posicion " + (i+1));
             numeros[i] = entrada.nextInt();
             }
         }
         
        public static void mostrarVector(int[] numeros2){
            for(int i=0; i<numeros2.length; i++)
            System.out.println(numeros2[i]); 
        }
}
