package Arrays;

import java.util.Scanner;

public class Ejercicio04 {

/*
Leer 10 números enteros, guardarlos en un arreglo. Debemos
mostrarlos en el siguiente orden, el primero, el último, el segundo, el penúltimo, el tercero, etc.
*/    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        int p = 0; 
        int u = 9;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite un número: ");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[p]);
            System.out.println(numeros[u]);
          p+=1; 
          u-=1;
        }
    }
    
}
