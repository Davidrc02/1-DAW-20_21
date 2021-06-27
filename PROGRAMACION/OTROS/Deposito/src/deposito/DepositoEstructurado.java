package deposito;

public class DepositoEstructurado extends Deposito {
    private int capitalampliado;
    private double tipointeresampliado;

    public DepositoEstructurado(String titular, int capital, int plazo, double tipointeres, int capitalampliado, double tipointeresampliado) {
        super(titular, capital, plazo, tipointeres);
        this.capitalampliado=capitalampliado;
        this.tipointeresampliado=tipointeresampliado;
    }
    
    public DepositoEstructurado(String titular){
        super(titular);
    }

    public int getCapitalampliado() {
        return capitalampliado;
    }

    public void setCapitalampliado(int capitalampliado) {
        this.capitalampliado = capitalampliado;
    }

    public double getTipointeresampliado() {
        return tipointeresampliado;
    }

    public void setTipointeresampliado(double tipointeresampliado) {
        this.tipointeresampliado = tipointeresampliado;
    }

    @Override
    public String toString() {
        return "Titular: "+ this.titular+ "\nCapital: "+this.capital + "\nPlazo:" + this.plazo + "\nTipointeres:" + this.tipointeres+"\nCapital ampliado: "+ this.capitalampliado+ "\nTipo interes ampliado:" + this.tipointeresampliado;
    }
}
