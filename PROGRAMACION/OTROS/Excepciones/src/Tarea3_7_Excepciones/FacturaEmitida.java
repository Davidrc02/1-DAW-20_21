package Tarea3_7_Excepciones;

import java.util.Scanner;

public class FacturaEmitida extends Factura{
    private String emisor;
    private String cliente;
    
    public FacturaEmitida(String CIF, int numFactura, int total, String emisor, String cliente) {
        super(CIF, numFactura, total);
        this.validarEmisor(emisor);
        this.cliente=cliente; 
    }
    
    public void validarEmisor(String emisor){
        Scanner entrada=new Scanner(System.in);
        boolean ok=false;
        do{
            emisor=emisor.trim();
            try{
                if(emisor.isEmpty()){
                    throw new EmisorEnBlancoException();
                }
                else{
                    this.emisor=emisor;
                    ok=true;
                }
            }catch(EmisorEnBlancoException e){
                System.out.println("");
                System.out.println("");
                emisor=entrada.nextLine();
            }
        }while(!ok);        
    }
    
    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Emisor: " + this.emisor + ", cliente: " + this.cliente;
    }
    
    public void imprimirFactura(){
        System.out.println(this.cliente);
        System.out.println(this.emisor);
        System.out.println(this.getCIF());
        System.out.println(this.getNumFactura());
        System.out.println(this.getTotal());
    }
}
