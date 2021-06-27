package Operadores;
import java.util.Scanner;

public class Ejercicio02 {
    
    /*Aplicación que calcule el salario semanal de
      un empleado a partir de sus horas semanales
      y de su salario por hora*/
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float salario, cantidadHoras, salarioPorHora;
        System.out.print("Introduzca las horas semanales que trabaja: ");
        cantidadHoras=entrada.nextFloat();
        System.out.print("Introduzca también su salario por hora trabajada: ");
        salarioPorHora=entrada.nextFloat();
        salario= cantidadHoras*salarioPorHora;
        System.out.print("Su salario semanal es de: "+salario+"\n");
    }
}
