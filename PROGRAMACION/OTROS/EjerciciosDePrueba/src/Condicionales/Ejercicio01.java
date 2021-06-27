package Condicionales;
//import java.util.Scanner;
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un número");
        numero=entrada.nextInt();

        if(numero%10==0){
            System.out.println("Es multiplo de 10");
        }
        else{
            System.out.println("No es multiplo de 10");
        }
    }
}
    
//        int numero;
//        
//        numero= Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
//        
//        if(numero%10==0){
//            JOptionPane.showMessageDialog(null,"Es multiplo de 10");
//        }
//        else{
//            JOptionPane.showMessageDialog(null,"No es multiplo de 10");
//        }
//    }
//}
