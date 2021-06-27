package ejercicio2;
import ejercicio2.Coche.Color;
import ejercicio2.Coche.Marca;
import java.util.Scanner;

/**
 *
 * @author Eusebio
 */
public class MatrizCoches {
    private final Coche[][] coches;
    private final int FILAS;
    private final int COLUMNAS;

    //Constructor
    public MatrizCoches(int filas,int columnas) {
        this.FILAS=filas;
        this.COLUMNAS=columnas;
        this.coches = new Coche[this.FILAS][this.COLUMNAS];
    }

    //getter para la matriz
    public Coche[][] getCoches() {
        return coches;
    }
    
    public void cargaTododosCoches(){
        for(int i=0;i<this.coches.length;i++){
            for(int j=0;j<this.coches[i].length;j++){
                this.coches[i][j]=recogeDatosCoche();
            }
        }
    }
    
    public Coche recogeDatosCoche(){
        Scanner sc=new Scanner(System.in);
        String matricula=null;
        String marca,color;
        Marca mar=null;
        Color col=null;
        boolean continuar=true;       
        while(continuar){
            System.out.println("Introduzca la matrícula");
            matricula=sc.next();
            if(this.validaMatricula(matricula))
                continuar=false;
        }
        continuar=true;
        while(continuar){
            System.out.println("Introduzca la marca: 1.Renault 2.Ford 3.Toyota");
            marca=sc.next();
            if(marca.length()==1&&this.esNumero(marca.charAt(0))&&(Integer.parseInt(marca)>=1||Integer.parseInt(marca)<=3)){
                continuar=false;
                switch(Integer.parseInt(marca)-1){
                    case 0:
                        mar=Marca.RENAULT;
                        break;
                    case 1:
                        mar=Marca.FORD;
                        break;
                    case 2:
                        mar=Marca.TOYOTA;
                        break;
                }
            }            
        }
        continuar=true;
        while(continuar){
            System.out.println("Introduzca el color: 1.Rojo 2.Blanco 3.Azul 4.Gris");
            color=sc.next();
            if(color.length()==1&&this.esNumero(color.charAt(0))&&(Integer.parseInt(color)>=1||Integer.parseInt(color)<=4)){
                continuar=false;
                switch(Integer.parseInt(color)-1){
                    case 0:
                        col=Color.ROJO;
                        break;
                    case 1:
                        col=Color.BLANCO;
                        break;
                    case 2:
                        col=Color.AZUL;
                        break;
                    case 3:
                        col=Color.GRIS;
                        break;
                }
            }            
        }
        return new Coche(matricula,mar,col);
    }
    
    public boolean validaMatricula(String matricula){
        //Una matricula sera valida si esta compuesta por 7 caracteres siendo 
        //los 4 primeros números y los otros 3 letras
        
        //Si el tamaño es distinto a 7 es inválida
        if(matricula.length()!=7)
            return false;
        //Si entre los 4 primeros caracteres hay algo que no es un número es inválida
        for(int i=0;i<4;i++)
            if(!this.esNumero(matricula.charAt(i)))
                return false;
        //Si entre los 3 últimos caracteres hay algo que no es una letra es inválida
        for(int i=4;i<7;i++)
            if(!this.esLetra(matricula.charAt(i)))
                return false;
        //Si no se ha metido en ninguno de los if alteriores es válida
        return true;        
    }
    
    public boolean esNumero(char n){       
        return (n>='0'||n<='9');
    }
    public boolean esLetra(char a){
        String aux=a+"";
        aux=aux.toLowerCase();
        char n=aux.charAt(0);
        return (n>='a'||n<='z');
    }
    
}
