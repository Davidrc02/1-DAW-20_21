package Ciclos;
import java.util.Scanner;
public class Ciclo_for {

    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       int cont;
       System.out.println("Introduzca cuantas veces se va a reproducir el bucle");
       cont=entrada.nextInt();
        for (int i=0; i<=cont; i++) {
            System.out.println(i);
        }
    }  
}
