package Condicionales;
import java.util.Scanner;
public class Ejercicio10 {

/*
Pedir el día, el mes y año de una fecha e indicar si la fecha es correcta.
Con meses de 28, 30 y 31 días. Sin años bisiestos.
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
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(1<=dia&&dia<=31){
                System.out.println("Fecha válida");
                }else 
                    System.out.println("Fecha no válida");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(1<=dia&&dia<=30){
                System.out.println("Fecha válida");
                }else 
                    System.out.println("Fecha no válida");
            break;
            case 2:
                if(1<=dia&&dia<=28){
                System.out.println("Fecha válida");
                }else 
                    System.out.println("Fecha no válida");
            break;
            default: System.out.println("Fecha no válida");
        }     
    }   
}
