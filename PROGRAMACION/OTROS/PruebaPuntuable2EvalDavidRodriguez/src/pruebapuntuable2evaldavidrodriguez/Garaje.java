package pruebapuntuable2evaldavidrodriguez;

import java.util.ArrayList;

public class Garaje {
    private int numPlazasGaraje;
    private double cuotaMensual;
    
    ArrayList<Moto> motos=new ArrayList<>();
    ArrayList<Coche> coches=new ArrayList<>();
    
    public Garaje(int numPlazasGaraje, double cuotaMensual) {
        this.numPlazasGaraje = numPlazasGaraje;
        this.cuotaMensual = cuotaMensual;
    }

    public Garaje() {
    }

    public int getNumPlazasGaraje() {
        return numPlazasGaraje;
    }

    public void setNumPlazasGaraje(int numPlazasGaraje) {
        this.numPlazasGaraje = numPlazasGaraje;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }
    

    @Override
    public String toString() {
        return "Numero de Plazas del Garaje=" + numPlazasGaraje + ", cuotaMensual:" + cuotaMensual;
    }
    
    
    
    
    
}
