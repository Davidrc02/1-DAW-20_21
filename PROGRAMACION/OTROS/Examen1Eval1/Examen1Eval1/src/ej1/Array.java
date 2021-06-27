/*
1.- Trabajando con arrays de cadenas, con un tamaño que se le solicita al 
usuario por teclado, resuelve las siguientes operaciones:
- Cargar el array.
- Mostrar el contenido del array.
- Método que reciba como parámetros un array y muestre en pantalla el contenido 
del mismo comprendido entre las posiciones inferior y superior (ambos valores se
les solicitará al usuario por teclado y deben estar correctamente validados).
- Método que reciba como parámetros de entrada 2 arrays del mismo tamaño. El 
método sustituirá en el primer array, todas aquellos valores que se encuentren 
en el segundo, por la cadena “ * ”.
Probar los métodos en el main.
(3.5 puntos)
 */
package ej1;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        final int TAM;
        System.out.println("Introduzca el tamaño del array:");
        TAM=entrada.nextInt();
        
        String[] vector1 = new String[TAM];
        String[] vector2 = new String[TAM];
        
        System.out.println("Cargar primer array:");
        cargarArray(vector1);
        
        System.out.println("Cargar segundo array:");
        cargarArray(vector2);
        
        System.out.println("Mostrar primer array:");
        mostrarArray(vector1);
        System.out.println("Mostrar segundo array:");
        mostrarArray(vector2);
        
        System.out.println("");
        
        System.out.println("Mostrar array según las posiciones dadas:");
        contenidoPos(vector1);
        
        System.out.println("Sustituir:");
        sustituir(vector1, vector2);
        mostrarArray(vector1);
        
        
    }
    
    public static void cargarArray(String[] vector){
        Scanner entrada = new Scanner (System.in);
        String valor;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduzca el valor:");
            valor=entrada.next();
            vector[i]=valor;
        }
    }
    
    public static void mostrarArray(String[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static void contenidoPos(String[] vector){
        Scanner entrada = new Scanner (System.in);
        int valor1, valor2;
        
        do{
        System.out.println("Introduzca el primer valor:");
        valor1=entrada.nextInt();
        }while(valor1<0);
        
        do{
        System.out.println("Introduzca el siguiente valor:");
        valor2=entrada.nextInt();
        }while(valor2>vector.length);
        
        for (int i = valor1; i < valor2; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static void sustituir(String[] vector1, String[] vector2){
        for (int i = 0; i < vector1.length; i++) {
            if(vector1[i].equals(vector2[i]))
                vector1[i]="*";
        }
    }
    
}
