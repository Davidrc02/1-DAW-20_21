package practicarmapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PracticarMapas01 {

    public static void main(String[] args) {
        //Declaro el mapa, tambien se puede usar:
        //Map<String, String> agenda= new HashMap<>();
        HashMap<String, String> agenda= new HashMap<>();
        //TreeMap<String, String> agenda = new TreeMap<>();
        
        //Agregar pares "clave"-"valor" al (Hash/Tree)Map
        //-------------Insertar mapa-------------
        agenda.put("Doctor","(+52) -4000 -5000");
        agenda.put("Casa","(888) 5000-3000");
        //Mostramos el mapa
        mostrarMapa(agenda);
    }
    
    //Metodo para mostrar mapa versión 1
    public static void mostrarMapa(Map agenda){
        System.out.println("Agenda con "+agenda.size()+ " teléfonos");
        
        //Iniciamos el iterador
        Iterator it= agenda.keySet().iterator();
        while(it.hasNext()){
            String clave= (String)it.next();
            String valor= (String)agenda.get(clave);
            System.out.println(clave+ " : "+ valor);
        }
    }
    //Metodo para mostrar mapa versión 2
    public static void mostrarMapa2 (Map agenda){
        //Motramos el número de telefonos que tiene la agenda
        System.out.println("Agenda con "+agenda.size()+" telefonos.");
        
        //Declaramos el iterador con nuestro mapa dentro para que lo recorra
        Iterator <Map.Entry<String,String>> it = agenda.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, String> e = (Map.Entry<String, String>)it.next();
            //Muestra del iterador la clave y un valor
            System.out.println(e.getKey()+" ---> "+e.getValue());
        }
    }  
}
