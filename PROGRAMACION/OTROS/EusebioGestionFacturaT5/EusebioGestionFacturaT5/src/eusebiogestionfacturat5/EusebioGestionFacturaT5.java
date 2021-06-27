/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eusebiogestionfacturat5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eusebio
 */
public class EusebioGestionFacturaT5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicio de la aplicación");
        procesaOpcion();
        System.out.println("Fin de la aplicación");
    }
    public static int menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("MENU - Inserte una opción");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("1.- Insertar factura");
        System.out.println("2.- Obtener importe total de las facturas almacenadas");
        System.out.println("3.- Listado de facturas ordenado por códigos.");
        System.out.println("4.- Datos de una factura por código");
        System.out.println("5.- Listado de todos los artículos comprados a proveedores.");
        System.out.println("6.- Borrar una factura.");
        System.out.println("7.- Listado de facturas ordenado decrecientemente por importe.");
        System.out.println("8.- Listado de todas las facturas que contienen un determinado artículo.");
        System.out.println("9.- Listado de facturas ordenado por el número de artículos que contienen.");
        System.out.println("10.- Salir");
        System.out.println("-----------------------------------------------------------------------------");        
        return sc.nextInt();
    }
    public static void procesaOpcion(){
        Scanner sc=new Scanner(System.in);
        GestionFacturas g=new GestionFacturas();
        while(true){
            switch (menu()){
                case 1:
                    g.insertaFactura();
                    break;
                case 2:   
                    if(g.getFacturas().isEmpty())
                        System.out.println("Aun no ha insertado facturas");
                    else{
                        System.out.println("El importe total de las facturas almacenadas es: "+g.importeTotalFacturas()+"€");
                    }
                    break;
                case 3:   
                    if(g.getFacturas().isEmpty())
                        System.out.println("Aun no ha insertado facturas");
                    else{
                        Factura[] f1=g.listaFactCodigos();
                        for(Factura fact:f1)
                            System.out.println(fact);
                    }
                    break;
                case 4:
                    if(g.getFacturas().isEmpty())
                        System.out.println("Aun no ha insertado facturas");
                    else{
                        System.out.println("Introduzca el código de la factura que desea ver: ");
                        g.muestraFacturaCodF(sc.next());
                    }
                    break;
                case 5:
                    ArrayList<Articulo> arts=g.listadoArticulos();
                    if(arts.isEmpty())
                        System.out.println("No hay nigun artículo");
                    else{
                        for(Articulo art:arts)
                            System.out.println(art);
                    }
                    break;
                case 6:
                    if(g.getFacturas().isEmpty())
                        System.out.println("Aun no ha insertado facturas");
                    else{
                        System.out.println("Introduzca el código de la factura que desea borrar: ");
                        g.borraFacturaCodF(sc.next());
                    }
                    break;
                case 7:
                    if(g.getFacturas().isEmpty())
                        System.out.println("Aun no ha insertado facturas");
                    else{
                        Factura[] f2=g.listaFactImportes();
                        for(Factura fact:f2)
                            System.out.println(fact);
                    }
                    break;
                case 8:
                    if(g.getFacturas().isEmpty())
                        System.out.println("Aun no ha insertado facturas");
                    else{
                        System.out.println("Introduzca el código del artículo que desea buscar");
                        ArrayList<Factura> facts=g.listaFacturasContieneArt(sc.nextInt());
                        if(facts.isEmpty())
                            System.out.println("Ninguna factura contiene este artículo");
                        else{
                            for(Factura fac:facts)
                                System.out.println(fac);
                        }
                    }
                    break;
                case 9:
                    if(g.getFacturas().isEmpty())
                        System.out.println("Aun no ha insertado facturas");
                    else{
                        Factura[] f3=g.listaFactNumArt();
                        for(Factura fact:f3)
                            System.out.println(fact);
                    }
                    break;
                case 10:
                    return;
                default:  
                    break;
            }
        }
    }
}
 