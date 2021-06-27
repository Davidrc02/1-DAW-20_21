package Tarea3_7_Excepciones;

public class Factura {
    private String CIF;
    private int numFactura;
    private int total;
    
    public Factura(String CIF, int numFactura, int total){
        this.CIF=CIF;
        this.numFactura=numFactura;       
    }

    public final void validarTotal(int total) throws ImporteNegException{
        
        if(total<0)
            throw new ImporteNegException();
        else
            this.total=total;
    }
    
    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "CIF: " + this.CIF + ", numFactura: " + this.numFactura + ", total: " + this.total;
    }    
}
