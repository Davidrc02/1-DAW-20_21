package Arrays;

import java.util.Scanner;

public class Ejercicio06 {

/*
Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y
mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B,
otros 3 de A, otros 3 de la B, etc    
*/    

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int arreglo1[], arreglo2[];
        arreglo1 = new int [12];
        arreglo2 = new int [12];
        int arreglo3[]= new int [24];
        System.out.println("Ingrese la primera lista de numeros");
        for(int i = 0; i<arreglo1.length ; i++){
            System.out.println("Ingrese el "+(i+1)+"° numero: ");
            arreglo1[i] = leer.nextInt();
        }
        System.out.println("----------");
        System.out.println("Ingrese la segunda lista de numeros");
        for(int i = 0; i<arreglo2.length ; i++){
            System.out.println("Ingrese el "+(i+1)+"° numero: ");
            arreglo2[i] = leer.nextInt();  
        }
        //MEZCLAR ARREGLOS
        int c=0;
        int a1=0;
        int a2=0;
        for(int i = 0 ; i<4; i++){
            for(int a = 0; a<3; a++){
                arreglo3[c]=arreglo1[a1];
                a1++;
                c++;
            }
            for(int b = 0; b<3; b++){
                arreglo3[c]=arreglo2[a2];
                a2++;
                c++;
            }
        }
        System.out.println("-----------------");
        System.out.println("Arreglo ordenado");
        System.out.println("-----------------");
        for(int d: arreglo3){
            System.out.print(d+" ");
        }
    }
}
