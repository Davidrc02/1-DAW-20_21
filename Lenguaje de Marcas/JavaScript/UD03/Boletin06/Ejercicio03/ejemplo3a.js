/**
 * 
 */

function anade(){
	
	//1. Creacion...elemento
	
		var elemento = document.createElement("li");
		
	//2. Creacion...texto
		
		var texto = document.createTextNode("Elemento de prueba");
		
	//3.Añadir el nodo TEXT
		
		elemento.appendChild(texto);
		
	//4.Añadir el nodo Elemento a la pagina
		
		var lista = document.getElementById("lista");
		lista.appendChild(elemento);
	
		
}