package ejercicio2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

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
        System.out.println("Las dos matrices serán de 2x2, inserte los datos");
        MatrizCoches m1=new MatrizCoches(2,2);
        m1.cargaTododosCoches();
        MatrizCoches m2=new MatrizCoches(2,2);
        m2.cargaTododosCoches();
        //obtenemos las colecciones
        HashSet<Coche> comunes=cochescomunes(m1.getCoches(),m2.getCoches());
        HashSet<Coche> todos=todosCoches(m1.getCoches(),m2.getCoches());
        //mostramos las colecciones
        Iterator it=comunes.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        it=todos.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        System.out.println("Fib de la aplicación");
    }
    public static HashSet<Coche> cochescomunes(Coche[][] matriz1,Coche[][] matriz2){
        //Creo un HashSet para los coches comunes
        HashSet<Coche> cochesComunes=new HashSet<>();
        //creo Arraylist para los coches de la matriz 1 y la 2 
        ArrayList<Coche> cochesMatriz1=new ArrayList<>();
        ArrayList<Coche> cochesMatriz2=new ArrayList<>();
        //vuelco el contenido de las matrices en los ArrayList
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1[i].length;j++){
                cochesMatriz1.add(matriz1[i][j]);
            }
        }
        for(int i=0;i<matriz2.length;i++){
            for(int j=0;j<matriz2[i].length;j++){
                cochesMatriz2.add(matriz2[i][j]);
            }
        }
        //Recorro el ArrayList de coches 1
        Iterator it=cochesMatriz1.iterator();
        while(it.hasNext()){
            Coche aux=(Coche)it.next();
            //Si el coche que estoy mirando esta en el ArrayList de coches 1 
            //Lo añado a comunes.
            if(cochesMatriz2.contains(aux))
                cochesComunes.add(aux);
        }
        return cochesComunes;
    }
    public static HashSet<Coche> todosCoches(Coche[][] matriz1,Coche[][] matriz2){
        //Creo un HashSet para los todos los coches
        HashSet<Coche> todosCoches=new HashSet<>();
        //vuelco el contenido de las matrices en los todosCoches
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1[i].length;j++){
                todosCoches.add(matriz1[i][j]);
            }
        }
        for(int i=0;i<matriz2.length;i++){
            for(int j=0;j<matriz2[i].length;j++){
                todosCoches.add(matriz2[i][j]);
            }
        }
        return todosCoches;
    }
}
