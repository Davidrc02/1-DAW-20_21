package ejemplo_examen;

public class Ejemplo_Examen {

    /*
EJEMPLO EXAMEN - ENUNCIADO
Crear un código que cargue un array de 50 números enteros aleatorios comprendidos entre el -5 y el 150
Los números no se pueden repetir.

Crear un método estático que devuelva los 2 valores máximos y los 2 valores mínimos del array
No se permite ordenar el array ni eliminar ninguno de los números

Crear un método estático que devuelva un array con todos los números negativos si los hay
Dicho array no puede contener espacios vacíos.
    */
    
    public static void main(String[] args) {
        cargarArray();
    }
    public static void cargarArray(){
        int[] vector= new int[50];
        int cont=0;
        do{
            int numAleatorio= (int)(Math.random()*(151-(-5))-5);
                if(existeNum(numAleatorio,vector)){ //Le damos al metodo existeNum el número numAleatorio y el array(vacío por ahora) vector 
                    vector[cont]=numAleatorio; //por tanto vector[0] será el primer número aleatorio que se ha ingresado
                    cont++;//sumamos uno al contador
                }
        }
        while (cont < vector.length);
        System.out.println("Array a procesar");
        mostrarArray(vector);
        System.out.println("\n Numeros negativos encontrados");
        numerosNegativos(vector);
        System.out.println("\n Los dos números mas pequeños encontrados");
        numerosMenores(vector);
        System.out.println("\n Los dos números mas grandes encontrados");
        numerosMayores(vector);
        System.out.println("\n");
        
    }
    public static boolean existeNum(int numAleatorio,int[] vector){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numAleatorio) 
//al ser un vector vacío(en la primera pasada) no tendrá ningun 
//valor numérico, por tanto, el metodo da como resultado "return true"
            return false;
        }
        return true;
    }
    
    public static void mostrarArray(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.printf(" %d  ", vector[i]);
        }
    }
    
    public static void numerosNegativos(int[] vector) {
        int[] arrayNegativos = new int[50];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0 )
                   arrayNegativos[i]=vector[i];
            } 
        
        for (int i = 0; i < arrayNegativos.length; i++) {
            if (arrayNegativos[i]!=0) 
                System.out.printf(" %d ", arrayNegativos[i]);
        }
    }
    
    /*
    -Ingresamos el array (63,71,55)
        
    *Primera pasada(63)*
    -Como vector[1]=63 es menor a 152, pasa el primer if,
    por tanto llega al segundo if, donde comprobamos que 
    vector[0]=63 es menor a 151, es así como aux(la cual 
    anteriormente no estaba definida, pasa a ser 151, a continuación,
    arrayMenor[0](que era anteriormente 151) pasa a ser 63, 
    la siguiente linea indica que arrayMenor[1] que era 152, pasa a ser 151.
        
    *Segunda pasada(71)*
    -Ahora, en la segunda pasada(71) vemos que supera el 
    primer if, pero no el segundo ya que no se cumple:
    if (vector[i](71) < arrayMenor[1](151) ){ 
        if (vector[2](71) < arrayMenor[0](63) { 
    por tanto queda la sentencia:
    if (vector[i](71) < arrayMenor[1](151) ){
    else{
        arrayMenor[1](151)=vector[2](71);
    quedando así las tres variables:
        arrayMenor[0]=63
        arrayMenor[1]=71
        aux=71
        
    *Tercera pasada(55)*
    -Ahora, en la tercera pasada(55) vemos que supera los dos ifs,
        quedando:
        aux(71)=arraymenor[0](63) por tanto aux=63
        arraymenor[0](63)=vector[3](55) por tanto arraymenor[0]=55
        arrayMenor[1](71)=aux(63) por tanto arrayMenor[1]=71
    */
    
    public static void numerosMenores(int[] vector){  
    
        int [] arrayMenor = new int[2];
        arrayMenor[0]=151;
        arrayMenor[1]=152;
        int aux;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < arrayMenor[1] ){ 
                if (vector[i] < arrayMenor[0]) { 
                    aux=arrayMenor[0]; 
                    arrayMenor[0]=vector[i];
                    arrayMenor[1]=aux;
                    
                }else{
                    arrayMenor[1]=vector[i];
                }
            }
        }
        mostrarArray(arrayMenor);
    }
    public static void numerosMayores(int[] vector){
        int [] arrayMayor = new int[2];
        arrayMayor[0]=-6;
        arrayMayor[1]=-7;
        int aux;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > arrayMayor[1] ){
                if (vector[i] > arrayMayor[0]) {
                    aux=arrayMayor[0];
                    arrayMayor[0]=vector[i];
                    arrayMayor[1]=aux;
                    
                }else{
                    arrayMayor[1]=vector[i];
                }
            }
        }
        mostrarArray(arrayMayor);
    }
    
}       
            
            

