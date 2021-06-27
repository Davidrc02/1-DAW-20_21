package Condicionales;
import java.util.Scanner;
import javax.swing.JOptionPane;
//import java.util.Scanner;
public class Ejercicio03 {

    /*Programa que lea un carácter por teclado 
    y compruebe si es una letra mayúscula.
    */
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        char letra;
        System.out.println("Introduzca una letra: ");
        letra=entrada.next().charAt(0);
        
        if(Character.isUpperCase(letra)){
            System.out.println("Es una letra mayúscula");
        } 
        else if(Character.isLowerCase(letra)){
            System.out.println("Es una letra minúscula");
        }
        else{
            System.out.println("No es una letra");
        }
    }
}
    
//        char letra;
//        
//        letra= JOptionPane.showInputDialog("Introduzca una letra: ").charAt(0);
//        
//        if(Character.isUpperCase(letra)){
//            JOptionPane.showMessageDialog(null, "Es una letra mayúscula");
//        } 
//        else if(Character.isLowerCase(letra)){
//            JOptionPane.showMessageDialog(null, "Es una letra minúscula");
//        }
//    else {
//            JOptionPane.showMessageDialog(null, "No es una letra");
//        }
//    }
//}
        
