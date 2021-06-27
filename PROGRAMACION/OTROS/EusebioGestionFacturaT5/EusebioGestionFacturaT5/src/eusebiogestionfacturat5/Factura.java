package eusebiogestionfacturat5;

import java.util.Scanner;

/**
 *
 * @author Eusebio
 */
public class Factura {
    private final String cod;
    private final Articulo[] articulos;                                         //Array estático de ojetos Articulo donde se almzenarán los artículos que coponen una factura
    private int insert; 
    private double importeF;

    public Factura(int tam, String cod) {
        this.articulos = new Articulo[tam];
        this.cod=cod;
        this.importeF=0;
    }
    
    public void insertaArticulo(){
        Scanner sc=new Scanner(System.in);
        int codigo;
        String nom;
        double pComp;  
        if(this.insert==this.articulos.length)
                System.out.println("No caben más artículos en esta factura");
        else{
            System.out.println("Introduzca el código del artículo");
            codigo=sc.nextInt();
            while((codigo<0||codigo>999)&&codArtRepe(codigo)){
                System.out.println("Código no válido "
                        + "(fuera de rango o repetido)");
                System.out.println("Introduzca el código del artículo");
                codigo=sc.nextInt();
            }
            System.out.println("Introduzca el nombre del artículo");
            nom=sc.next();
            System.out.println("Introduzca el precio de compra del artículo");
            pComp=sc.nextDouble();
            while(pComp<0){
                System.out.println("Precio de compra no válido "
                    + "(negativo)");
                System.out.println("Introduzca el precio de compra "
                                + "del artículo");
                pComp=sc.nextDouble();
            }
            this.articulos[insert]=new Articulo(codigo,nom,pComp);
            this.importeF+=pComp;
            this.insert++;     
        }
    }
    
    @Override
    public String toString(){
        String art="Código de factura: "+this.cod+"\n";
        for(int i=0;i<this.insert;i++){
            art+="Artículo "+(i+1)+": {"+this.articulos[i]+"}\n";
        }
        art+="Importe total: "+this.importeF+"€\n";
        return art;
    }
    public boolean codArtRepe(int cod){
        if(this.insert!=0){
            for(int i=(this.insert-1);i>=0;i--){
                if(cod==this.articulos[i].getCod())
                    return true;
            }
            return false;
        }
        else
            return false;
    }
    public double importeTotal(){
        return this.importeF;
    }
    public boolean contienecodArt(int codArt){
        for(Articulo art:this.articulos){
            if(art.getCod()==codArt)
                return true;           
        }
        return false;
    }
    public int getInsert(){
        return this.insert;
    }
    public Articulo getArticulo(int pos){
        return this.articulos[pos];
    }
    public Articulo[] getListaArticulos(){
        return this.articulos;
    }
    public String getCod(){
        return this.cod;
    }
    @Override
    public boolean equals(Object o){
        Factura f=(Factura)o;
        return this.cod.equalsIgnoreCase(f.getCod());
    }

    @Override
    public int hashCode() {        
        return this.cod.hashCode();
    }
}
