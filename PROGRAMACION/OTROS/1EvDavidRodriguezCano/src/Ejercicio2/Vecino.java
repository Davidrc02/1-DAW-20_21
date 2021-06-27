package Ejercicio2;

import java.util.Arrays;

public class Vecino {
    private String nombre;
    private int ncu;
    private String planta;
    private char puerta;
    

    public Vecino() {
    }

    public Vecino(String nombre, String planta, char puerta, int ncu){
        this.nombre= nombre;
        this.ncu= ncu;
        this.planta=planta;
        this.puerta= puerta;
        
    }
    
    public Vecino(char puerta){
        this.puerta = puerta;
    }

   

    public String getNombre(){
        return this.nombre;
    }

    public String getPlanta(){
        return this.planta;
    }

    public float getPuerta(){
        return this.puerta;
    }

    public int getNcu(){
        return this.ncu;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPlanta(String planta){
        this.planta=planta;
    }
    
    public float cuotaFinal(){
        float cuotaFinal;
        cuotaFinal = this.ncu*30;
        return cuotaFinal;
    }
    
    public boolean mismaCuota(Vecino vec){
        if(vec.nombre.equals(this.nombre))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Vecino{" + "nombre=" + nombre + ", ncu=" + ncu + ", puerta=" + puerta + ", planta=" + planta+  '}';
    }    
}