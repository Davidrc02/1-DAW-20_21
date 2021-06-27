package cajero;
import java.util.Scanner;

public class CuentaBancaria  {
	private double saldo;
	private double limite;
        private String numCta;
        private String nif;
        private int pin;
	
	//constructores
	public CuentaBancaria (){  
	}
        
	public CuentaBancaria(double saldo, double limite,String numCta, String nif, int pin) {
		this.saldo = saldo;
		this.limite = limite;
                this.numCta= numCta;
                this.nif= nif;
                this.pin=pin;
	}
        
        public CuentaBancaria(double saldo,String numCta, String nif) {
		this.saldo = saldo;
		 this.numCta= numCta;
                this.nif= nif;
	}

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getNumCta() {
        return numCta;
    }

    public void setNumCta(String numCta) {
        this.numCta = numCta;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
    
	public double ingresarDinero(double d) {
            this.saldo += d;
            return this.saldo;	
	}

	public void sacarDinero(double d) {
            if(d <= this.saldo + this.limite)
		this.saldo -= d;
            else
                System.out.println("No tiene disponibilidad suficiente");
	}

        public boolean validarPin(int pin){
            return this.pin==pin;
        }
    
    public void cambiarPin(){
        Scanner entrada = new Scanner(System.in);
        int pin, nuevo;
        System.out.println("Introduzca pin actual");
        pin =entrada.nextInt();
        if(this.validarPin(pin)){
            System.out.println("Introduzca nuevo pin");
            nuevo= entrada.nextInt();
            this.pin=nuevo;
        }
        else
            System.out.println("Operación fallida");
    }

        @Override
        public String toString(){
            return "NumCta: "+this.numCta+ "  Dni: "+this.nif+
                    " Saldo: "+this.saldo+ "  Limite: "+this.limite;
        }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }	
}