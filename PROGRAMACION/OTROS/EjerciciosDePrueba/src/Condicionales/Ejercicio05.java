package Condicionales;
import java.util.Scanner;
public class Ejercicio05 {

    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int num1, cifras;
        
        System.out.println("Digite un numero entre 0 y 99,999");
        num1 = entrada.nextInt();
        
        //aqui contamos las cifras de num1
        cifras = String.valueOf(num1).length();
        if(num1 >=0 && num1 <= 99999){
            
            System.out.println("El numero tiene " + cifras + " cifras" );
        
        }else{
            System.out.println("El número está fuera del rango");
        }
    }
}
