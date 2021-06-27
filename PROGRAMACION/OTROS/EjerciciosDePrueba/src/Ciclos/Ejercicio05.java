package Ciclos;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio05 {

/*Realizar un juego para adivinar un número.
Para ello generar un número aleatorio entre 
0-100, y luego ir pidiendo números indicando
“es mayor” o “es menor” según sea mayor o menor
con respecto a N. El proceso termina cuando el
usuario acierta y mostrar el número de intentos.*/
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num, cont=0, numAleat;
        //Random rnd= new Random();
        //numAleat=(int)(rnd.nextDouble() * 101 + 0);
        numAleat= (int)(Math.random()*100);
        
        do{
            System.out.println("Introduzca un numero: ");
            num=entrada.nextInt();
            if(numAleat>num){
                System.out.println("Digite un numero mayor");
            } 
            else {
                System.out.println("Digite un número menor");
            }
            cont++;
        }while(num!=numAleat) ;
        System.out.println("Te ha costao ehh ;)");
    }  
}
