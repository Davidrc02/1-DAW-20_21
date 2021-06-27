window.onload=function(){
	anadeTotales();
	anadeEnlacesPorParrafo();
}

// Primero creo una función que reciba un tipo de etiqueta y devuelva el número 
// de veces que se encuentra en el documento:

function contador(tagName){
	var numElements = document.getElementsByTagName(tagName).length;
	return numElements;
	
}

// Después creo un método que usa esa función para añadir el total de elemenos a la lista:
function anadeTotales(){

	
	//Creo los nodos de texto para los totales:
	var textoP = document.createTextNode(contador("P"));
	var textoL = document.createTextNode(contador("A"));

	//Y los añado a su posición de la lista:	
	var listaP = document.getElementById("lParrafos");
	var listaL = document.getElementById("lEnlaces");
	listaP.appendChild(textoP);
	listaL.appendChild(textoL);
		
}

//Creo una función para generar y añadir a la lista los enlaces específicos por párrafo:

function anadeEnlacesPorParrafo(){	

	var arrayP = document.getElementsByTagName("P")
	
	
	for(var i =0; i < arrayP.length; i++){
		
		var numEl = arrayP[i].getElementsByTagName("A").length;
		

		var elemento = document.createElement("li");
		var texto = document.createTextNode("Número de enlaces en el párrafo "+(i+1)+": "+arrayP[i].getElementsByTagName("A").length);
		elemento.appendChild(texto);
		var lista = document.getElementById("lista");
		lista.appendChild(elemento);
	}


}



		
		
