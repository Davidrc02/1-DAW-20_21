package Ciclos;

import java.util.Scanner;

public class Ejercicio17 {

/*
Una empresa que se dedica a la venta de desinfectantes necesita un programa para 
gestionar las facturas. En cada factura figura: el código del artículo, la cantidad
vendida en litros y el precio por litro.
Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos 
del artículo 1 y cuantas facturas se emitieron de más de $600.
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double codart, cantlit, precioxlit, precioart, factotal=0;
        int contfac600=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca el codigo del articulo "+(i+1)+": ");
            codart=entrada.nextDouble();
            if(codart<0){
                System.out.println("Por favor introduzca un código válido");
                codart=entrada.nextInt();
                if (codart<0){
                    System.out.println("No ha introducido un código válido, por tanto se cierra el programa");
                    return;
                }
            }
            System.out.println("Introduzca la cantidad del articulo "+(i+1)+": ");
            cantlit=entrada.nextDouble();
            if(cantlit<0){
                System.out.println("Por favor introduzca una cantidad válida");
                cantlit=entrada.nextInt();
                if (cantlit<0){
                    System.out.println("No ha introducido una cantidad válida, por tanto se cierra el programa");
                    return;
                }
            }
            System.out.println("Introduzca el precio por litro del articulo "+(i+1)+": ");
            precioxlit=entrada.nextDouble();
            if(precioxlit<=0){
                System.out.println("Por favor introduzca un precio válido");
                precioxlit=entrada.nextInt();
                if (precioxlit<=0){
                    System.out.println("No ha introducido un precio válido, por tanto se cierra el programa");
                    return;
                }
            }
            precioart=precioxlit*cantlit;
            if(precioart>600){
                contfac600++;
            }
            factotal+=precioart;
            if(i==0){
                System.out.println("La cantidad de litros del artículo 1 es de "+cantlit+" litros");
            }   
        }
        System.out.println("La facturación total es de "+factotal);
        System.out.println("Hay "+contfac600+" facturas de más de $600.");
        System.out.println("Fin de la aplicación");
    }
}
