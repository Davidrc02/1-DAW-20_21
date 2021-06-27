package Ciclos;
import java.util.Scanner;
public class Ejercicio10 {

/*
Pedir 10 números y escribir la suma total
*/
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num, suma=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca su digito numero "+(i+1));
            num=entrada.nextInt();
            suma=suma+num;
        }
        System.out.println("La suma es "+suma);
    }   
}
