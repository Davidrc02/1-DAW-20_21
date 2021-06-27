package Condicionales;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        final double numkg;
        double numhg, numdag, numg, numdg,numcg, nummg;
        int opc;
        System.out.println("Cuántos Kg desea ingresar?");
        numkg=entrada.nextDouble();
        numhg=numkg*10;
        numdag=numkg*100;
        numg=numkg*1000;
        numdg=numkg*10000;
        numcg=numkg*100000;
        nummg=numkg*1000000;
        
        System.out.println("A que unidad desea pasarlos?"
       +"\n1. A hectogramos"
       +"\n2. A decagramos"
       +"\n3. A gramos"
       +"\n4. A decigramos"
       +"\n5. A centigramos"
       +"\n6. A miligramos"
       +"\n7. Dejarlos en kilogramos");
       opc=entrada.nextInt();
       switch (opc){
           case 1: System.out.println(numkg+" Kg son "+numhg+" hectogramos");
           break;
           case 2:System.out.println(numkg+" Kg son "+numdag+" decagramos");
           break;
           case 3: System.out.println(numkg+" Kg son "+numg+" gramos");
           break;
           case 4:System.out.println(numkg+" Kg son "+numdg+" decigramos");
           break;
           case 5: System.out.println(numkg+" Kg son "+numcg+" centigramos");
           break;
           case 6:System.out.println(numkg+" Kg son "+nummg+" miligramos");
           break;
           case 7:System.out.println(numkg+" Kg son "+numkg+" kg");
           break;
           default: System.out.println("Opción introducida no válida");
       }
    }
}
