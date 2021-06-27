package deposito;

import java.util.Scanner;
import java.util.ArrayList;

public class MainDeposito {
    
/*
Ejercicio 3_1 de Depósitos tema 6 (herencia de clases)  
*/
    
    public static void main(String[] args) {
        System.out.println("Inicio de la aplicación.");
        procesaOpcion();
        System.out.println("Fin de la aplicación");
    }
    
    public static void procesaOpcion(){
        Scanner sc =new Scanner(System.in);
        GestionDeposito d=new GestionDeposito();
        while(true){
            switch (menu()){
                case 1:
                    d.InsertarDeposito();
                    break;
                case 2:
                    if(d.getDepositos().isEmpty())
                        System.out.println("Aun no ha insertado depósitos");
                    else{
                        System.out.println("Introduzca el titular del deposito que desea ver: ");
                        d.muestraDepositoTitular(sc.next());
                    }
                    break;
                case 3: return;
                default: System.out.println("El número introducido no es válido");
            }
        }
    }
    public static int menu(){
    Scanner entrada=new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("1.- Crear un Depósito");
        System.out.println("2.- Mostrar un depósito");
        System.out.println("3.- Salir de la aplicación");
        System.out.println("--------------------------");
        System.out.println("Introduzca el número correspondiente a la acción que desea realizar");
        return entrada.nextInt();
    }
}
