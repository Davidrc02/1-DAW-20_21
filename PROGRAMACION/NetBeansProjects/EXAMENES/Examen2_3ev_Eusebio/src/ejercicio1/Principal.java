package ejercicio1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
/**
 *
 * @author Eusebio
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicio de la aplicación");
        //Creamos una localidad
        Localidad sevilla= new Localidad("Sevilla");
        //Creamos dos academias
        try{
            Academia a1=new AcademiaB("Academia las Rosas",5,"B2",1);
            Academia a2=new AcademiaC("Academia London",4,"C1",2);
            sevilla.insertaAcademia(a1);
            sevilla.insertaAcademia(a2);
        }catch(TipoNoValidoException e){
            System.err.println(e.getMessage()+" "+e.getClass().getName());
        }        
        //Ahora vamos a introducir los alumnos del fichero de texto alumnos.txt en la academia a1 y vamos a introducir los del
        //fichero de texto alumnos2.txt inventado por mi y con el mismo formato del del enunciado en la academia a2
        Iterator it=sevilla.getAcademias().iterator();
        try{
            ((Academia)it.next()).matriculaAlumnos("alumnos.txt");
            ((Academia)it.next()).matriculaAlumnos("alumnos2.txt");
        }catch(CupoAlcanzadoException e){
            System.err.println(e.getMessage()+" "+e.getClass().getName());
        }
        //vamos a probar el mapa
        HashMap<Academia,TreeSet<Alumno>> alumnosEdad=sevilla.mapaAlumnosEdad();
        //Mostramos el mapa
        it=alumnosEdad.keySet().iterator();
        while(it.hasNext()){
            Academia ac=(Academia)it.next();
            System.out.println("Clave\n"+ac);
            System.out.println("Valor\n");
            TreeSet<Alumno> alumnos=alumnosEdad.get(ac);
            Iterator it2=alumnos.iterator();
            while(it2.hasNext())
                System.out.println(it2.next());
            System.out.println();
        }
        //Vamos a buscar al alumno cuyo DNI es el siguiente
        String dni="13131313C";
        try{           
            System.out.println("\nResultado de la busqueda de \""+dni+"\":");
            sevilla.muestraAlumno(dni); //Alumno: Baena Baena, José 13131313C 17
        }catch(AlumnoNoMatriculadoException e){
            System.err.println(e.getMessage()+" "+e.getClass().getName());
        }
        //Hacemos otra búsqueda con otro DNI
        dni="34343434G";
        try{           
            System.out.println("\nResultado de la busqueda de \""+dni+"\":");
            sevilla.muestraAlumno(dni); //Alumno: Baena Baena, José 13131313C 17
        }catch(AlumnoNoMatriculadoException e){
            System.err.println(e.getMessage()+" "+e.getClass().getName());
        }       
        //creamos una copia de seguridad de las academias
        sevilla.guardaAcademias();        
        System.out.println("Fin de la aplicación");
    }   
}
