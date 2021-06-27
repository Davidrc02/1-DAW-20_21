package Ciclos;

import java.util.Scanner;

public class Ejercicio18 {

/*
Hacer unas modificaciones al ejercicio anterior suponiendo que no se
introduce el precio por litro. Solo existen tres productos con precios:
1.- 0,6$/litro.
2.- 3$/litro.
3.- 1,25$/litro
*/
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double codart, cantlit, precioart=0, factotal=0;
        int contfac600=0, tipoprod;
        for (int i = 0; i < 1; i++) {
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
            System.out.println("Introduzca el producto que desea usar como desinfectante "+(i+1)+": ");
            tipoprod=entrada.nextInt();
            switch(tipoprod){
                case 1:
                    precioart+=0.6*cantlit;
                    break;
                case 2:
                    precioart+=3.0*cantlit;
                    break;
                case 3:
                    precioart+=1.25*cantlit;
                    break;
                default:
                    System.out.println("Opción introducida no válida");
                    return;
            }
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