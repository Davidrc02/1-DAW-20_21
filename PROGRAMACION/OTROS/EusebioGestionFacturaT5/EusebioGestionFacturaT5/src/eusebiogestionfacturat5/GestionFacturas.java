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
public class GestionFacturas {
    private ArrayList<Factura> f=new ArrayList<>(); 
    
    public GestionFacturas(){        
    }
    public ArrayList<Factura> getFacturas(){
        return this.f;
    }
    public void insertaFactura(){
        Scanner sc=new Scanner(System.in);
        String cod,res;
        Factura fact;
        int tam, cont=0;
        System.out.println("Inserte el código de la nueva factura");
        cod=sc.next();
        System.out.println("Inserte el número máximo de artículos que tendrá esta factura");
        tam=sc.nextInt();
        while(tam<=0){
            System.out.println("No puede introducir un tamaño 0 o inferior");
            System.out.println("Inserte el número máximo de artículos que tendrá esta factura");
            tam=sc.nextInt();
        }
        fact=new Factura(tam,cod);        
        do{
            System.out.println("Inserte los datos del artículo "+(cont+1)+":");
            fact.insertaArticulo();
            cont++;
            System.out.println("¿Desea insertar otro artículo? (S/N)");
            res=sc.next();
            while(!res.equalsIgnoreCase("S")&&!res.equalsIgnoreCase("N")){
                System.out.println("Respuesta fuera de rango");
                System.out.println("¿Desea insertar otro artículo? (S/N)");
                res=sc.next();
            }
        }while(res.equalsIgnoreCase("S"));
        this.f.add(fact);
    }
    public double importeTotalFacturas(){
        double importeTotalFacturas=0;
        for(Factura fact:this.f)
            importeTotalFacturas+=fact.importeTotal();
        return importeTotalFacturas;
    }
    public boolean contiene(String codF){
        for(Factura fact:this.f){
            if(fact.getCod().equalsIgnoreCase(codF))
                return true;           
        }
        return false;
    }
    public int getIndex(String codF){
       for (int i=0;i<this.f.size();i++){
           if(this.f.get(i).getCod().equalsIgnoreCase(codF))
               return i;
       }
       return -1;
    }
    public void muestraFacturaCodF(String codF){
        if(this.contiene(codF))
            System.out.println(this.f.get(getIndex(codF)));
        else
            System.out.println("Factura no encontrada");
    }
    public ArrayList<Articulo> listadoArticulos(){
        ArrayList<Articulo> arts=new ArrayList<>();
        for(Factura fact:this.f){
            for(Articulo art:fact.getListaArticulos())
                arts.add(art);
        }
        return arts;
    }
    public void borraFacturaCodF(String codF){
        if(this.contiene(codF)){
            this.f.remove(getIndex(codF));
            System.out.println("Factura borrada con éxito");
        }
        else
            System.out.println("Factura no encontrada");
    }
    public Factura[] listaFactCodigos(){
        Factura[] listaFactCodigos=new Factura[this.f.size()];
        Factura aux;
        for(int i=0;i<this.f.size();i++)
            listaFactCodigos[i]=this.f.get(i);
        for(int i=0;i<listaFactCodigos.length;i++){
            for(int j=0;j<i;j++){
                if(listaFactCodigos[j].getCod().compareToIgnoreCase(listaFactCodigos[i].getCod())>0){
                    aux=listaFactCodigos[j];
                    listaFactCodigos[j]=listaFactCodigos[i];
                    listaFactCodigos[i]=aux;
                }
            }
        }   
        return listaFactCodigos;
    }
    public Factura[] listaFactImportes(){
        Factura[] listaFactImportes=new Factura[this.f.size()];
        Factura aux;
        for(int i=0;i<this.f.size();i++)
            listaFactImportes[i]=this.f.get(i);
        for(int i=0;i<listaFactImportes.length;i++){
            for(int j=0;j<i;j++){
                if(listaFactImportes[j].importeTotal()<listaFactImportes[i].importeTotal()){
                    aux=listaFactImportes[j];
                    listaFactImportes[j]=listaFactImportes[i];
                    listaFactImportes[i]=aux;
                }
            }
        }
        return listaFactImportes;
    }
    public ArrayList<Factura> listaFacturasContieneArt(int codArt){
        ArrayList<Factura> facts=new ArrayList<>();
        for(Factura fac:this.f){
            if(fac.contienecodArt(codArt))
                facts.add(fac);
        }            
        return facts;
    }
    public Factura[] listaFactNumArt(){
        Factura[] listaFactNumArt=new Factura[this.f.size()];
        Factura aux;
        for(int i=0;i<this.f.size();i++)
            listaFactNumArt[i]=this.f.get(i);
        for(int i=0;i<listaFactNumArt.length;i++){
            for(int j=0;j<i;j++){
                if(listaFactNumArt[j].getInsert()<listaFactNumArt[i].getInsert()){
                    aux=listaFactNumArt[j];
                    listaFactNumArt[j]=listaFactNumArt[i];
                    listaFactNumArt[i]=aux;
                }
            }
        }
        return listaFactNumArt;
    }
}
