window.onload=function(){
	document.getElementById("boton_anade").onclick = anade;
	document.getElementById("boton_elimina").onclick = elimina;
}

function anade(){
	
	//1. Creacion...elemento
	
		var elemento = document.createElement("li");
		
	//2. Creacion...texto
		
		var texto = document.createTextNode(document.getElementById("caja").value);
		
	//3.Añadir el nodo TEXT
		
		elemento.appendChild(texto);
		
	//4.Añadir el nodo Elemento a la pagina
		
		var lista = document.getElementById("lista");
		lista.appendChild(elemento);
		
}
	
	//5.Eliminar el nodo Elemento a la pagina
		
		
function elimina(){
	
	//localizamos el padre del elemento a eliminar
	

	var lista = document.getElementById("lista");
	
	//localizao los li de la lista
	
	var elementos = lista.getElementsByTagName("li");///guardo todos los elementos de la lista
	
	//localizo el elemento
	var ultimo =  elementos[elementos.length -1];
	
	///lo borramos
	
	//opcion rebuscada: ultimo.parentNode.removeChild(ultimo);
	if(elementos.length>5){
		lista.removeChild(ultimo);
	}	
		
}