package gestionalumno;

public class Alumno {
    
    private String nombre;
    private int nie;
    private double nota;
    
public Alumno(String nombre, int nie, double nota){
    this.nombre=nombre;
    this.nie=nie;
    this.nota=nota;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNie() {
        return nie;
    }

    public void setNie(int nie) {
        this.nie = nie;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
    public int buscaNie(int nie){
    return -1;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", nie: " + nie + ", nota=" + nota + '}';
    }
}




