
package probardatosnoprimitivos;

public class ProbarDatosNoPrimitivos {

    public static void main(String[] args) {
        Integer n=new Integer(5);
        Integer n2=new Integer("55");
        int num=5;
        n= num;
        num=n;
        num=Integer.valueOf("22");
        System.out.println(num);
        num+=2;
        num= Integer.parseInt("3333");
        
        Object obj= new Object();
        obj="casa";
        obj=5;
        obj=n;
        
        Character letra= new Character('a');
        float num5=Float.valueOf("3.14");
        System.out.println(num5);
    }
}
