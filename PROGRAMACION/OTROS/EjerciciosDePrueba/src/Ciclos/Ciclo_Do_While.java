package Ciclos;

import java.util.Scanner;
public class Ciclo_Do_While {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int i=0, contador;
        
        System.out.println("Digite la cantidad de números: ");
        contador=entrada.nextInt();
        do{
            System.out.println(i);
            i++;
        }while(i<=contador);
    }
    
}
