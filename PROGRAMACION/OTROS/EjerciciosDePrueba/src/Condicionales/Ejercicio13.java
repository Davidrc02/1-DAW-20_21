package Condicionales;
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        final double dineroInicial=1000;
        int opc;
        double ingreso, dineroActual, retiro;
        
        System.out.println("Bienvenido a su cajero automático.\n"
            + "Elija una de las opciones que se le muestran a continuación:"
            + "\n1. Ingresar dinero a la cuenta.\n2. Retirar dinero de la cuenta.\n3. Salir.");
        
        opc=entrada.nextInt();
        switch (opc){
            case 1: System.out.println("Que cantidad de dinero desea ingresar");
            ingreso=entrada.nextDouble();
            dineroActual= dineroInicial+ingreso;
                System.out.println("El dinero actual de la cuenta es de: "+dineroActual);
                break;
            case 2: System.out.println("Que cantidad de dinero desea retirar");
            retiro=entrada.nextDouble();
            if(retiro>dineroInicial)
                    System.out.println("No dispone de ese dinero para retirar");
            else{
            dineroActual= dineroInicial-retiro;
                System.out.println("El dinero actual de la cuenta es de: "+dineroActual);
            }
                break;
            case 3: System.out.println("Ha salido exitósamente del cajero");
                break;
            default: System.out.println("Opción introducida no válida");
        }
    }
}
