package Ej2;

public class Alumno {
    private String nombre;
    private String dni;
    private Asignatura asig1;
    private Asignatura asig2;

    public Alumno() {
    }

    public Alumno(String nombre, String dni, Asignatura asig1, Asignatura asig2) {
        this.nombre = nombre;
        this.dni = dni;
        this.asig1 = asig1;
        this.asig2 = asig2;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Asignatura getAsig1() {
        return this.asig1;
    }

    public void setAsig1(Asignatura asig1) {
        this.asig1 = asig1;
    }

    public Asignatura getAsig2() {
        return this.asig2;
    }

    public void setAsig2(Asignatura asig2) {
        this.asig2 = asig2;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDNI: " + dni + "\nAsignatura 1:" + asig1 + "\nAsignatura 2:" + asig2;
    }
    
    public float mediaAsig(){
        float media;
        media=(asig1.getNota()+asig2.getNota())/2;
        return media;
    }
    
    public int asigSuspensas(){
        int cont;
        
        if (asig1.getNota()<5 && asig2.getNota()<5)
            cont=2;
            else if ((asig1.getNota()<5 && asig2.getNota()>5) || (asig1.getNota()>5 && asig2.getNota()<5))
                cont=1;
                else
                    cont=0;
        
        return cont;
    }
}
