package probarenumeracion;

import java.util.Arrays;

public class EnumeracionesEjemplo1 {

    public enum Dia {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
    
    public static void main(String[] args) {
        Dia d;
        d= Dia.LUNES;
        if (d==Dia.DOMINGO || d==Dia.SABADO)
            System.out.println("Estamos en fin de semana");
        else
            System.out.println("Aun no ha llegado fin de semana");
        
        switch (d){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("Aún no ha llegado el fin de semana");
                break;
            default:
                System.out.println("Estamos en fin de semana");      
        }
        Dia[] vector=Dia.values();
        System.out.println(Arrays.toString(vector));
    }
}
