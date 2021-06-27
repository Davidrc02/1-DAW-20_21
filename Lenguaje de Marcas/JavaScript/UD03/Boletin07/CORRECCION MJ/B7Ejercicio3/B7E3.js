window.onload = iniciar;

function iniciar(){

    //Obtener un array con los párrafos
    var parrafos = document.getElementsByTagName("p");

    //Crear el elemento ol
    var info = document.createElement("ol");

    //Crear el primer li del ol, que indicará el número de enlaces totales
    var numEnlacesTotales = document.createElement("li");

    //Obtener el texto con el número de enlaces totales
    var numEnlacesTexto = document.createTextNode("Enlaces totales: "+document.getElementsByTagName("a").length);
    
    //Añadir el texto como nodo hijo del primer li
    numEnlacesTotales.appendChild(numEnlacesTexto);

    //Añadir el li como nodo hijo del ol
    info.appendChild(numEnlacesTotales);


    //Declarar 2 variables donde se guardarán nuevos li por cada párrafo, y el texto que será su nodo hijo, respectivamente.
    var numEnlacesPLi;
    var textoEnlacesP;
 
    //Bucle que recorre cada párrafo
    for (var i = 0; i<parrafos.length; i++){

        //Obtener el número de enlaces del párrafo.
        textoEnlacesP = document.createTextNode("Enlaces en párrafo "+(i+1)+": "+parrafos[i].getElementsByTagName("a").length);

        //Crear un nuevo li por cada párrafo
        numEnlacesPLi = document.createElement("li");

        //Añadir el texto como nodo hijo del li, y el li como nodo hijo del ol
        numEnlacesPLi.appendChild(textoEnlacesP);
        info.appendChild(numEnlacesPLi);

    }

    //Añadir ol ("info") al principio del body
    document.body.insertBefore(info, document.body.firstChild);





}
