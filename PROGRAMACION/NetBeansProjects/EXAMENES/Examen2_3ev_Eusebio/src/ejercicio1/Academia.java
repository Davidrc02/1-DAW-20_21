package ejercicio1;
import java.util.TreeSet;
import gestionficherostexto.GestorFicherosT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
/**
 *
 * @author Eusebio
 */
abstract class Academia implements ICentros,Serializable,Comparable<Academia>{
    //La clase Academia será abstracta puesto que una academia debe ser 
    //obligatoriamente de uno de los dos tipos posibles y su código dependerá de ello
    
    //Atributos
    private int codigo;
    private Character tipo;
    private String nombre;
    private int numAulas;
    //Utilizamos un TreeSet para almacenar los alumnos directamente ordenados por sus apellidos
    private TreeSet<Alumno> alumnos;
    
    //CONSTRUCTOR - Deshabilitamos el warning de método sobreescribible llamado en el constructor porque 
    //compruebaCodigo es final en ambas clases heredadas de Acadamia
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Academia(String nombre, int numAulas, String certificacion, int codigo) throws TipoNoValidoException{
        this.codigo = codigo;
        this.nombre = nombre;
        this.numAulas = numAulas;
        this.alumnos = new TreeSet<>();
        try{          
            this.tipo=compruebaTipo(certificacion);
        }catch(TipoNoValidoException e){
            throw new TipoNoValidoException();           
        }
    }
      
    //GETTER Y SETTER   
    public TreeSet<Alumno> getAlumnos() {
        return alumnos;
    }
    public int getCodigo() {
        return codigo;
    }
    public Character getTipo() {
        return tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumAulas() {
        return numAulas;
    }
    public void setNumAulas(int numAulas) {
        this.numAulas = numAulas;
    }
    
    //Método de Interfaz  
    //El método listadoOrdenadoAlumnos es común para todas las academias, se implementa en la superclase
    @Override
    public TreeSet<Alumno> listadoOrdenadoAlumnos() {
       //Devolvemos directamente el TreeSet que ya está ordenado por apellidos
       return this.alumnos;
    }
    
    //Este método intenta matricular en el centro todos los alumnos que hay en un fichero de texto
    //al que hay que tratar previamente para obtener los datos. Matriculará todos los alumnos que pueda
    //Y si se alcanza el cupo lanzará una excepción propia de cupo alcanzado
    public void matriculaAlumnos(String ubicacion) throws CupoAlcanzadoException{
        ArrayList<String> datosBrutos;
        GestorFicherosT gft=new GestorFicherosT();
        gft.abrirModoLectura(ubicacion);
        //Leemos todas las lineas del fichero
        datosBrutos=gft.leeTodasLineas();
        Iterator it1=datosBrutos.iterator();
        while(it1.hasNext()){
            String linea=(String)it1.next();
            ArrayList<String> datos=descomponeLinea(linea);
            Iterator it2=datos.iterator();
            //Sabemos que cada linea del fichero tiene 5 tokens, no necesitamos un while
            //Simplemente almacenamos los tokens en el orden apropiado
            String apellidos=(String)it2.next()+" "+(String)it2.next();
            //Le quitamos la coma, primero se reemplaza con un espacio, y después se le hace trim
            apellidos=apellidos.replace(',', ' ');
            apellidos=apellidos.trim();
            String nombreAlu=(String)it2.next();
            String dni=(String)it2.next();
            int edad=Integer.parseInt((String)it2.next());
            //Una vez almacenados todos los tokens declaramos el objeto Alumno auxiliar
            Alumno aux=new Alumno(nombreAlu,apellidos,dni,edad);
            //Comprobamos que tenemos hueco en la academia
            if(this.numeroPlazas()<=this.alumnos.size())
                throw new CupoAlcanzadoException();
            //En caso de que queden plazas añadimos el Alumno al TreeSet
            this.alumnos.add(aux);
        }
        //Cerramos el fichero
        gft.cerrarFichero();
    }
    //Este método descomone un String en tokens utilizando la clase StringTokenizer de java y lo devuelve en forma de ArrayList de String
    public ArrayList<String> descomponeLinea(String linea){
        //ArrayList para guardar los datos por separado
        ArrayList<String> datos=new ArrayList<>();
        //Recordamos que si no se especifica nada, el delimitador por defecto es el espacio en blanco
        StringTokenizer st=new StringTokenizer(linea); 
        //StringTokenizer st=new StringTokenizer(datosBrutos," "); //Sería lo mismo
        while (st.hasMoreTokens())
            //Directamente añadimos todos los tokens al ArrayList
            datos.add((String)st.nextToken());
        return datos;
    }
    
    //Métodos abstractos
    abstract void copiaSeguridad();
    abstract Character compruebaTipo(String certificacion) throws TipoNoValidoException;

    @Override
    public String toString() {
        String res="Tipo: " + this.tipo +" Código: "+this.codigo+ " Nombre: " + this.nombre + " Número de aulas: " + this.numAulas+"\nAlumnos: ";
        Iterator it=this.alumnos.iterator();
        while(it.hasNext()){
            Alumno aux=(Alumno)it.next();
            res+="\n"+aux.getApellidos()+" "+aux.getNombre();
        }
        return res;
    }

    //El criterio de igualdad de las Academias será según su codigo.
    @Override
    public int hashCode() {
        return this.codigo;
    }
    @Override
    public boolean equals(Object objeto) {
        final Academia otraAcademia = (Academia) objeto;
        return this.codigo==otraAcademia.getCodigo();
    }
    //El criterio de ordenación de las academias será según su nombre
    public int compareTo(Academia otraAcademia){
        return this.nombre.compareTo(otraAcademia.getNombre());
    }       
}
