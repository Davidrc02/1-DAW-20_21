package interface0probar;

public class Persona implements Comparable<Persona>{
    private String dni;
    private int edad;
    private String apellidos;
    private String nombre;
    
    public Persona(String dni, int edad, String apellidos, String nombre){
        this.dni=dni;
        this.edad=edad;
        this.apellidos=apellidos;
        this.nombre=nombre;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Dni: " + this.dni + ", Edad: " + this.edad + ", Apellidos: " + this.apellidos + ", Nombre:" + this.nombre + '}';
    }

//    @Override
//    public int compareTo(Persona p2) {
//        if(this.apellidos.compareTo(p2.apellidos)!=0)
//            return this.apellidos.compareTo(p2.apellidos);
//        else{
//            return this.nombre.compareTo(p2.nombre);
//        }
//    }
    
    @Override
    public int compareTo(Persona p2) {
        return this.edad-p2.edad;
    }
}
