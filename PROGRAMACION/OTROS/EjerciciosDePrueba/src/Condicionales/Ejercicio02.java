package Condicionales;

import javax.swing.JOptionPane;

public class Ejercicio02 {

    public static void main(String[] args) {
        int num1, num2;
        
        num1= Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
        num2= Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro número"));
        
        if(num1==num2){
            JOptionPane.showMessageDialog(null, "Son iguales");
        }
            else if (num1>num2){
                JOptionPane.showMessageDialog(null,
                    (+num1+" es mayor que "+num2));
            }
            else{
                JOptionPane.showMessageDialog(null,
                    (num2+" es mayor que "+num1));
            }        
    }    
}
/*Scanner entrada=new Scanner(System.in);
int num1, num2;
        System.out.println("Introduzca un número"));
        num1=entrada.nextInt();
System.out.println("Introduzca un número"));
        num2=entrada.nextInt();

        if(num1==num2){
            System.out.println("Son iguales");
        }
            else if (num1>num2){
                System.out.println(num1+" es mayor que "+num2));
            }
            else{
                System.out.println(num2+" es mayor que "+num1));
            }
    }
}*/