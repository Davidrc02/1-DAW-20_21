package Condicionales;
import java.util.Scanner;
public class Ejercicio06 {

/*
Hacer un programa que tome dos números y diga si ambos son pares o impares   
*/
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num,num1;
        System.out.println("Introduzca el primer número");
        num=entrada.nextInt();
        System.out.println("Introduzca el primer número");
        num1=entrada.nextInt();
        if(num%2 == 0 && num1%2 == 0){
            System.out.println("Son pares");
        } else if((num%2==1)&&(num1%2==1)){
            System.out.println("Son impares");
        }else
            System.out.println("Uno es impar y el otro par");
            
    }  
}
