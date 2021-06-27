package gestionalumno;

import java.util.Scanner;

public class GestionAlumno {
    private Alumno[] clase;
    private int posLibre;  
    
    public GestionAlumno(int tam){
        this.clase=new Alumno[tam];
        this.posLibre=0;
    }
    
public Alumno crearAlumno(){
    Scanner sc=new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);
    System.out.println("Introduzca el nombre");
    String nombre = sc.nextLine();
    System.out.println("Introduzca el nie");
    int nie=sc2.nextInt();
    System.out.println("Introduzca la nota");
    double nota=sc2.nextDouble();       
return new Alumno(nombre, nie, nota);   
}

    public void insertar(){
        if(this.posLibre<this.clase.length){
            this.clase[this.posLibre]=this.crearAlumno();
            this.posLibre++;
            return;
        }
        System.out.println("No hay espacio");
    }
    
     public void borrarAlumno(int pos){
        if(pos<0||pos>=this.posLibre){
            System.out.println("No existe");
            return;
         }
        for (int i = pos; i < this.posLibre-1; i++) 
             this.clase[i]=this.clase[i+1];
        this.posLibre--;
     }
    
    public void BorrarAlumnoV2(int nie){
        int pos= buscaNie(nie);
        borrarAlumno(pos);
    }
    
    public int buscaNie(int nie){
        for (int i = 0; i < this.posLibre; i++) {
            if(this.clase[i].getNie()==nie)
                return i;
        }
        return -1;
    }
    
    public void modificarNota(int nie, double nota){
        int pos=this.buscaNie(nie);
        if(nota>=0&&nota<=10&&pos!=-1){
            this.clase[pos].setNota(nota);
        }
        else
            System.out.println("No es una nota valida");
    }
    
    public void listadoClase(){
        if(this.posLibre==0){
            
            System.out.println("");
            
            return;
        }
        for (int i = 0; i < this.posLibre; i++) {
            System.out.println(this.clase[i]);
        }
    }
    
    public Alumno aMejorNota(){
        double max=0;
        Alumno a=null;
        for (int i = 0; i < this.posLibre; i++) {
            if(this.clase[i].getNota()>=max){
                max=this.clase[i].getNota();
                a=this.clase[i];
            }
        }
        System.out.println(max+" es la mejor nota");
        return a;
    }
    
    public Alumno aPeorNota(){
        double min=10;
        Alumno a=null;
        for (int i = 0; i < this.posLibre; i++) {
            if(this.clase[i].getNota()<=min){
                min=this.clase[i].getNota();
                a=this.clase[i];
            }
        }
        System.out.println(min+" es la peor nota");
        return a;
    }
    
    public double mediaNotas(){
        float media=0;
        for (int i = 0; i <this.posLibre; i++) {
            media+=this.clase[i].getNota();
            return media/this.posLibre;
        }
        return media;
    }
    
    public void estadisticas(){
        int insuf=0, suf=0, bien=0,not=0, sob=0;
        for (int i = 0; i < this.posLibre; i++) {
                if (this.clase[i].getNota()<5) {
                insuf++;
            }
                else if (this.clase[i].getNota()<6) {
                suf++; 
                }
                else if (this.clase[i].getNota()<7) {
                bien++;  
                }
                else if (this.clase[i].getNota()<9) {
                not++;  
                }
                else if (this.clase[i].getNota()<6) {
                sob++;  
        }
        System.out.println("Insuficientes: "+ insuf+ "\nSuficientes: "
        + "\nBien: "+ bien+ "\nNotable: "+not+ "\nSobresaliente: "+sob);
        }
    } 
    public void listaNies(){
        for (int i = 0; i < this.posLibre; i++) {
            System.out.println(this.clase[i].getNie());
        }
    }    
}   