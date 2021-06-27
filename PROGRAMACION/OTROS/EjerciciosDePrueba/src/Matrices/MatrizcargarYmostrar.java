package Matrices;

import java.util.Scanner;

public class MatrizcargarYmostrar {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int tam,tam2;
        System.out.println("Introduzca el numero de filas");
        tam=entrada.nextInt();
        System.out.println("Introduzca el numero de columnas");
        tam2=entrada.nextInt();
        int[][] vector=new int[tam][tam2];
        cargarMatriz(vector);
        mostrarMatriz(vector);
    }
    
    public static void cargarMatriz(int[][] vector){
        Scanner entrada=new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                System.out.printf("Posición (%d,%d): ",i+1,j+1);
                vector[i][j]=entrada.nextInt();
            }
        }
    }
    public static void mostrarMatriz(int[][] vector){
        System.out.print("\nMatriz "+"\n{ ");
        for(int i=0;i<vector.length;i++){
            System.out.print("\n");
            for(int j=0;j<vector[0].length;j++){
                System.out.printf("\t%d\t",vector[i][j]);
            }
        }
        System.out.print("\n}\n");
    }
}
