package deposito;

public class Deposito {
protected String titular;
protected int capital;
protected int plazo;
protected double tipointeres;

    public Deposito(String titular, int capital, int plazo, double tipointeres){
        this.titular=titular;
        this.capital=capital;
        this.plazo=plazo;
        this.tipointeres=tipointeres;
    }
    
    public Deposito(String titular){
        this.titular=titular;
    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getTipointeres() {
        return tipointeres;
    }

    public void setTipointeres(double tipointeres) {
        this.tipointeres = tipointeres;
    }

    @Override
    public String toString() {
        return "titular: "+ this.titular+ ", capital: "+this.capital + ", plazo:" + this.plazo + ", tipointeres:" + this.tipointeres;
    }
    
    
    
}
