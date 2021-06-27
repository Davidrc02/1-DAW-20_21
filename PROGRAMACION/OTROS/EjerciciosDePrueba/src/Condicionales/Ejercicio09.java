package Condicionales;
import java.util.Scanner;
public class Ejercicio09 {

/*
 Pedir el día, mes y año e indicar si la fecha es correcta
 */
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int dia, mes, anio;
        System.out.println("Introduzca el día");
        dia=entrada.nextInt();
        System.out.println("Introduzca el mes");
        mes=entrada.nextInt();
        System.out.println("Introduzca el año");
        anio=entrada.nextInt();
        if(1<=mes&&mes<=12){
            if(1<=dia&&dia<=30){
                System.out.println("Fecha válida");
            }
        }
        else
        System.out.println("Fecha no válida");        
    }
}
