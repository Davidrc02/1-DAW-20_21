package ejercicio2;
/**
 *
 * @author Eusebio
 */
public class Coche implements Comparable<Coche>{
    //Enumeración para el color
    public enum Color{ROJO,BLANCO,AZUL,GRIS}
    //Enumeración para la marca
    public enum Marca{RENAULT,FORD,TOYOTA}
    
    //Atributos
    private String matricula;
    private Marca marca;
    private Color color;

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public Coche(String matricula, Marca marca, Color color) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Matricula: " + this.matricula + "Marca: " + this.marca + "Color: " + this.color;
    }

    //equals y hashcode: Criteriom de igualdad: matricula
    @Override
    public int hashCode() {
        return this.matricula.hashCode();
    }

    @Override
    public boolean equals(Object objeto) {      
        final Coche otroCoche = (Coche) objeto;
        return this.matricula.equals(otroCoche.getMatricula());
    }
    
    //compareTo: criterio de ordenación por defecto: matricula
    @Override
    public int compareTo(Coche otroCoche) {
        return this.matricula.compareTo(otroCoche.getMatricula());
    }
    
    
}
