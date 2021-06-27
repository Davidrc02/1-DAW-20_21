package Arrays;

import java.util.Scanner;

public class Ejercicio03 {

/*
Leer 5 números por teclado, almacenarlos en un arreglo
y a continuación realizar la media de los números positivos,
la media de los negativos y conteo el número de ceros.    
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int[] numeros= new int[5];
        int sumanumpos=0,sumanumneg=0, contnumpos=0, contnumneg=0, cont=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca el dígito "+(i+1));
            numeros[i]=entrada.nextInt();
            if(numeros[i]>0){
            sumanumpos=sumanumpos+numeros[i];
            contnumpos++;
            }
            else if(numeros[i]<0){
                sumanumneg=sumanumneg+numeros[i];
                contnumneg++;
            }
            else if(numeros[i]==0){
                cont++;
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
        System.out.println("La cantidad de 0 es de: "+(cont));
        }
        else{
            System.out.println("La media de numeros positivos es: "+(sumanumpos/contnumpos));
            System.out.println("La media de numeros negativos es: "+(sumanumneg/contnumneg));
            System.out.println("La cantidad de 0 es de: "+cont);
        }
    }
}
