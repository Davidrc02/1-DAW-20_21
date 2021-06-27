/*
- Asignatura con las siguientes propiedades: código (de tipo entero), nombre 
(de tipo cadena), duración (de tipo entero que debe tomar un valor mayor que 
cero) y nota (de tipo float y con valores comprendidos entre 0 y el 10).
- Alumno caracterizada por un nombre, el dni y 2 atributos más correspondientes 
a las asignaturas en las que dicho alumno se encuentra matriculado (son 4 
atributos en total).

Se pide:
- Diseñar las clases con al menos 2 métodos constructores y el resto de métodos 
que consideres necesarios.
- Crear un método para Alumno que devuelva la media de sus dos asignaturas.
- Crear un método para Alumno que devuelva el número de asignaturas  que tiene 
suspensas (puede ser 0, 1 o 2 como máximo).
- Crear en la clase principal, una pequeña aplicación que cargue los valores de 
10 alumnos y me muestre en pantalla cuántos alumnos han aprobado todo, cuántos 
tienen 1 asignatura suspensa y cuántos tienen 2 suspensos.
(6.5 puntos)
 */

package Ej2;

public class Asignatura {
    private int codigo;
    private String nombre;
    private int duracion;
    private float nota;

    public Asignatura() {
    }

    public Asignatura(int codigo, String nombre, int duracion, float nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nota = nota;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public float getNota() {
        return this.nota;
    }

    @Override
    public String toString() {
        return "Código: " + this.codigo + "\nNombre: " + this.nombre + "\nDuración: " + this.duracion + "\nNota: " + this.nota;
    }
    
    
    
}
