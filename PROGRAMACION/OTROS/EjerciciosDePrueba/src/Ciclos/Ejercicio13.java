package Ciclos;
import java.util.Scanner;
public class Ejercicio13 {

/*
Pedir 10 números. Mostrar la media de los números positivos,
la media de los números negativos y la cantidad de ceros.
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num, sumanumpos=0,sumanumneg=0, contnumpos=0, contnumneg=0, cont=0;
        float mediapos, medianeg;
        System.out.println("Introduzca un número");
        num=entrada.nextInt();
        for (int i = 1; i <= 10; i++){
            if(num>0){
            sumanumpos=sumanumpos+num;
            contnumpos++;
            System.out.println("Introduzca otro numero");
            num=entrada.nextInt();
            }
                else if(num<0){
                    sumanumneg=sumanumneg+num;
                    contnumneg++;
                    System.out.println("Introduzca otro numero");
                    num=entrada.nextInt();
                }
                else if(num==0){
                    cont++;
                    System.out.println("Introduzca otro numero");
                    num=entrada.nextInt();
                }
        }
        
        if ((contnumneg==0)&&(contnumpos>0)){
            System.out.println("La media de numeros positivos es: "+(sumanumpos/contnumpos));
            System.out.println("La cantidad de 0 es de: "+(cont+1));
        }
        else if ((contnumpos==0)&&(contnumneg>0)){
            System.out.println("La media de numeros negativos es: "+(sumanumneg/contnumneg));
            System.out.println("La cantidad de 0 es de: "+cont);
        }
        else if ((contnumneg==0)&&(contnumpos==0)){
        System.out.println("La cantidad de 0 es de: "+(cont+1));
        }
        else{
            System.out.println("La media de numeros positivos es: "+(sumanumpos/contnumpos));
            System.out.println("La media de numeros negativos es: "+(sumanumneg/contnumneg));
            System.out.println("La cantidad de 0 es de: "+cont);
        }
    }  
}
