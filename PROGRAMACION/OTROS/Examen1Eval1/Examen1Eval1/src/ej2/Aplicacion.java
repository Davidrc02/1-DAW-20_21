/*
2.- Se pide crear una aplicación que realice una gestión específica con las 
facturas de una empresa. De las facturas tenemos que guardar información sobre: 
su código (de tipo cadena), artículo (de tipo cadena), importe (de tipo real 
que debe tomar un valor mayor que cero) e IVA (de tipo entero y con valores 
comprendidos entre 10 y el 20). 

Se pide:
- Diseñar las clases con al menos 3 métodos constructores y el resto de métodos 
que consideres necesarios. 
- Crear un método que devuelva el importe final de una factura tras aplicarle el
% de IVA correspondiente.
- Crear un método para facturas denominado mismoArticulo. Este método booleano 
recibirá una factura como parámetro de entrada y devolverá verdadero si ambas 
facturas son del mismo artículo y falso en caso contrario.
- Crear en la clase principal, una pequeña aplicación que cargue los valores de 
10 facturas y calcule el importe total de todas ellas.
- Crear también en la clase principal, la funcionalidad necesaria para obtener 
un array que contenga sólo los códigos de las 10 facturas.
(6.5 puntos)
 */
package ej2;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Factura f1;
        String[] codigos = new String[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Factura nº "+i);
            f1=cargarFactura();
            System.out.println("El importe total de la factura es: "+f1.importeFinal());
            codigos[i]=f1.getCodigo();
        }
        System.out.println("Los códigos de las facturas son:");
        mostrarArray(codigos);
    }
    
    public static Factura cargarFactura(){
        Scanner entrada = new Scanner (System.in);
        String codigo, articulo;
        float importe;
        int iva;
        
        System.out.println("Introduzca el código:");
        codigo=entrada.next();
        System.out.println("Introduzca el articulo:");
        articulo=entrada.next();
        
        do{
            System.out.println("Introduzca el importe:");
            importe=entrada.nextFloat();
        }while(importe<=0);
        
        do{
        System.out.println("Introduzca el iva:");
        iva=entrada.nextInt();
        }while(iva<10||iva>20);
        
        Factura miFactura = new Factura(codigo, articulo, importe, iva);
        
        return miFactura;
    }
    
    public static void mostrarArray(String[] codigos){
        for (int i = 0; i < codigos.length; i++) {
            System.out.println(codigos[i]);
        }
    }
}
