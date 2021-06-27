package Operadores;
import java.util.Scanner;

public class Ejercicio01 {
    //Hacer un programa que sume 3 notas introducidos por teclado y muestre la suma
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float nota1, nota2, nota3, suma;
        System.out.println("Escriba tres notas");
        nota1=entrada.nextFloat();
        nota2=entrada.nextFloat();
        nota3=entrada.nextFloat();
        suma= nota1+nota2+nota3;
        
        System.out.println("La suma de las tres es: "+suma);
    }
    
}
