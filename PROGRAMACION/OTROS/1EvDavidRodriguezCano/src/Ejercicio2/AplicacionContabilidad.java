package Ejercicio2;

import java.util.Scanner;

public class AplicacionContabilidad {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String[] vector1= new String[2];
        cargarVector(vector1);
        mostrarVector(vector1);
    }
    
    public static void cargarVector(String[] vector1){
             Scanner entrada = new Scanner(System.in);
             Vecino vec;
             for(int i=0; i<2; i++){
             vec=cargarVecino();
             }
    }
    
public static Vecino cargarVecino(){
        Scanner entrada = new Scanner (System.in);
        String nombre, planta;
        char puerta;
        int ncu;
        
        System.out.println("Introduzca el nombre:");
        nombre=entrada.next();
        System.out.println("Introduzca la planta:");
        planta=entrada.next();
        System.out.println("Introduzca la puerta");
        puerta=entrada.next().charAt(0);
        do{
            System.out.println("Introduzca el numero de cuotas:");
            ncu=entrada.nextInt();
            ncu=ncu*30;
        }while(ncu<0&&ncu>=12);
        
        
        Vecino miVecino = new Vecino(nombre, planta, puerta, ncu);
        
        return miVecino;
    }
         
public static void mostrarVector(String[] vector1){
        for(int i=0; i<vector1.length; i++)
        System.out.println(vector1[i]); 
    }
}


