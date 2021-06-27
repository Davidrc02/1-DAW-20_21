/*
1.- Trabajando con arrays de números enteros, con un tamaño que se le solicita 
al usuario por teclado, resuelve las siguientes operaciones:
- Cargar el array sólo con números positivos (el 0 no se incluye).
- Mostrar el contenido del array.
- Método que reciba como parámetros dos arrays de igual tamaño y devuelva otro 
array  que contenga la suma de las distintas posiciones de los arrays de entrada.
- Método que devuelva (no sirve mostrar en pantalla) todas las posiciones en las 
que se encuentren un determinado número que se recibe como parámetro de entrada.
(3.5 puntos)
 */

package Ej1;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int tam;
        System.out.println("Introduzca el tamaño para el array:");
        tam=entrada.nextInt();
        int[] vector = new int[tam];
        
        cargarArray(vector);
        mostrarArray(vector);
        
        int[] vector2 = new int[tam];
        int[] suma = new int[tam];
        suma=sumaPos(vector, vector2);
        mostrarArray(suma);
        
        int[] rep = new int[tam];
        rep=repNum(vector, 3);
        mostrarArray(rep);
    }
    
    public static void cargarArray(int[] vector){
        Scanner entrada = new Scanner (System.in);
        int numero;
        for (int i=0; i<vector.length; i++) {
            System.out.println("Introduzca número:");
            numero=entrada.nextInt();
            if (numero>0)
                vector[i]=numero;
        }
    }
    
    public static void mostrarArray(int[] vector){
        for (int i=0; i<vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static int[] sumaPos(int[] vector, int[] vector2){
        int[] suma = new int[vector.length];
        for (int i=0; i<vector.length; i++) {
            suma[i]=vector[i]+vector2[i];
        }
        return suma;
    }
    
    public static int[] repNum(int[] vector, int num){
        int[] rep = new int[vector.length];
        int cont=0;
        for (int i = 0; i < 10; i++) {
            if(vector[i]==num)
                rep[cont]=i;
            cont++;
        }
        return rep;
    }
    
}
