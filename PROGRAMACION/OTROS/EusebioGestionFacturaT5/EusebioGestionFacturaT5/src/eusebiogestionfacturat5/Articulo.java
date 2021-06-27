package eusebiogestionfacturat5;
/**
 *
 * @author Eusebio
 */
public class Articulo {
    private int cod;
    private String nom;
    private double pComp;

    public Articulo() {
    }

    public Articulo(int cod, String nom, double pComp) {
        this.setCod(cod);
        this.nom = nom;
        this.setpComp(pComp);
    }

    public int getCod() {
        return this.cod;
    }

    public final void setCod(int cod) {
        if(cod>0&&cod<1000)
            this.cod = cod;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getpComp() {
        return this.pComp;
    }

    public final void setpComp(double pComp) {
        if(pComp>0)
            this.pComp = pComp;
    }

//    @Override
//    public String toString() {
//        return "Articulo{" + "\nCódigo=" + this.cod + "\nNombre=" + this.nom + "\nPrecio de compra=" + this.pComp + "\n}";
//    }
//    
//    @Override
//    public boolean equals(Object o){
//        Articulo art=(Articulo)o;       //Quitamos la envoltura de object y la cambiamor por artículo
//        return art.getCod()==this.cod;
//    }  
//    @Override
//    public int hashCode(){
//        return this.cod;
//    }   
    
    @Override
    public boolean equals(Object o){
        Articulo art=(Articulo)o;
        return (this.nom.equals(art.getNom())&&this.cod==art.getCod());
    }
    
    @Override
    public int hashCode(){
        return this.cod*7+this.nom.hashCode()*17;
    }
    
    @Override
    public String toString(){
        return "Código de artículo: "+this.cod+"\tConcepto: "+this.nom+"\tPrecio de compra: "+this.pComp+"€";
    }
}
