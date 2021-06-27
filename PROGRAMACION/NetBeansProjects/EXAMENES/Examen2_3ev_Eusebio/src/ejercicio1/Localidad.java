package ejercicio1;
import java.util.HashSet;
import java.util.Iterator;
import gestionficherosbinarios.GestorFicherosB;
import java.util.HashMap;
import java.util.TreeSet;
/**
 *
 * @author Eusebio
 */
public class Localidad {
    //Utilizamos un HashSet porque no necesitamos almacenas las academias en orden.
    private final HashSet<Academia> academias;
    private final String nombre;

    public Localidad(String nombre){
        this.nombre = nombre;
        this.academias=new HashSet<>();
    }
    
    //Método para insertas academias.
    public void insertaAcademia(Academia ac){
        this.academias.add(ac);
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }  
    public HashSet<Academia> getAcademias() {
        return academias;
    }
    
    
    //Este método guarda una copia de seguridad de todas las academias
    //Guardará las AcademiaB en un fichero y las AcademiaC en otro fichero
    public void guardaAcademias(){
        //Primero hay que borrar la copia previa de academias
        GestorFicherosB gfb=new GestorFicherosB();
        gfb.abrirModoEscritura("AcademiasB", false);
        gfb.escribeObjeto(null, false);
        gfb.cerrarFichero();
        gfb.abrirModoEscritura("AcademiasC", false);
        gfb.escribeObjeto(null, false);
        gfb.cerrarFichero();
        //Ahora recorremos las academias y las guardamos todas
        Iterator it=this.academias.iterator();
        while(it.hasNext()){
            Object aux=it.next();
            if(aux instanceof AcademiaB)
                ((AcademiaB) aux).copiaSeguridad();
            else
                ((AcademiaC) aux).copiaSeguridad();
        }            
    }
    
    //Este método crea un HasMap en el que la clave es un objeto Academia y el valor es un TreeSet de alumnos ordenados por edad
    public HashMap mapaAlumnosEdad(){
        HashMap<Academia,TreeSet<Alumno>> alumnosEdad=new HashMap<>();
        //Utilizaremos un Hashmap ya que no nos especifican que tenga que tener nigún orden
        //Los alumnos los alacenaremos en un TreeSet en el que especificaremos que el orden escogido 
        //No sea el orden por defecto sino el del Comparator de la clase Alumno ComparadorEdad
        
        Iterator it=this.academias.iterator();
        while(it.hasNext()){
            //Para este caso podemos instanciarlo como Academia simple
            Academia ac=(Academia)it.next();
            //Creamos un TreeSet de alumnos utilizando como criterio de ordenación el Comparator ComparadorEdad
            TreeSet<Alumno> alumnosPorEdad=new TreeSet<>(new ComparadorEdad());
            //Iteramos todos los alumnos de la academia en cuestión
            Iterator it2=ac.getAlumnos().iterator();
            while(it2.hasNext())
                //Añadimos los alumons al TreeSet que los alacena ordenados por edad
                alumnosPorEdad.add((Alumno)it2.next());
            //Una vez tenemos la información recopilada y ordenada añadimos el mapeo al mapa
            alumnosEdad.put(ac, alumnosPorEdad);
        }       
        return alumnosEdad;
    }
    
    //Método que muestra los datos de un alumno buscando por DNI.
    //IMORTANTE: PUESTO QUE HEMOS DEFINITO UN TREESET PARA LOS ALUMNOS NO PODEMOS USAR CONTAINS CON UN OBJETO ALUMNO CREADO A PARTIR DE UN DNI
    //El contains de la clase TreeSet utiliza el criterio del compareTo y además reemplaza el objeto
    public void muestraAlumno(String dni) throws AlumnoNoMatriculadoException{        
        boolean encontrado=false;
        Iterator it=this.academias.iterator();
        while(it.hasNext()&&!encontrado){
            //Podemos almacenar la Academia como Academia sin necesidad de instanciarla
            //en ninguna de las clases herederas puesto que el objeto ya existe
            Academia ac=(Academia)it.next();
            //Declaramos un iterador para recorrer los alumnos de la academia
            Iterator it2=ac.getAlumnos().iterator();
            while(it2.hasNext()&&!encontrado){
                //guardamos el alumno en un objeto auxiliar
                Alumno aux=(Alumno)it2.next();
                //si el DNI concuerda mostramos sus datos y salimos del bucle
                if(aux.getDni().equals(dni)){
                    System.out.println("Alumno: "+aux+"\nCódigo de la academia en la que está matriculado: "+ac.getCodigo());
                    System.out.println("\nNombre de la academia en la que está matriculado: "+ac.getNombre());
                    encontrado=true;
                }                    
            }            
        }
        if(!encontrado)
            throw new AlumnoNoMatriculadoException();
    }
}
