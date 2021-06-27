package TEMA1_Boletin1;

public class Ejercicio03 {

/*
Calcula la distancia que recorre la luz en un año a 300000 Km por segundo
*/
    public static void main(String[] args) {
        double velocidad, tiempo, distancia;
        velocidad=300000;
        tiempo=365*24*60*60;
        distancia=tiempo*velocidad;
        System.out.println("La distancia que recorre es de "+distancia);
    }
}
