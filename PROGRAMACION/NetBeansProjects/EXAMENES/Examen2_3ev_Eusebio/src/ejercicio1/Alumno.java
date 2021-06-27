package ejercicio1;
import java.io.Serializable;

/**
 *
 * @author Eusebio
 */
public class Alumno implements Comparable<Alumno>,Serializable{
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;

    //CONSTRUCTOR COMPLETO
    public Alumno(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }
    //CONSTRUCTOR SOLO DNI
    public Alumno(String dni) {
        this.dni = dni;
    }
    
    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Apellidos: " + this.apellidos + " DNI: " + this.dni + " Edad: " + this.edad;
    }
    
    //El criterio de igualdad será el DNI
    @Override
    public int hashCode() {
        return this.dni.hashCode();
    }
    @Override
    public boolean equals(Object objeto) {     
        final Alumno otroAlumno = (Alumno) objeto;
        return this.dni.equals(otroAlumno.getDni());
    }
    
    //El criterio de ordenación por defecto serán los apellidos
    @Override
    public int compareTo(Alumno otroAlumno) {
        int result=this.apellidos.compareToIgnoreCase(otroAlumno.getApellidos());
        return result;
    }             
}
