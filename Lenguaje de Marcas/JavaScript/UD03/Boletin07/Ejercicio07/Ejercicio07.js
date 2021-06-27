/* 
- Primero declaro las variables globales que voy a necesitar y obtengo los valores de los límites.
- Después creo un método booleano para validar la entrada de los números límite, cubriendo las
excepciones y alertando al usuario de los errores.
- Finalmente si la entrada es correcta creo un bucle para insertar los valores en el array, 
transformo el array en un nodo de texto y lo añado al fieldset así como algunos espacios de formateo.
*/

window.onload=function(){
	document.getElementById("secuenciar").onclick=secuenciar;
}

function secuenciar(){
	var inferior = document.getElementById("inferior").value;
	var superior = document.getElementById("superior").value;
	

	if(validarNumeros(superior, inferior) == true){
		var i = Number(inferior)+1;
		var parrafo = document.createElement("p");
		var texto;

		for (i ; i<superior; i++){
			texto = document.createTextNode(" "+i);
            parrafo.appendChild(texto);
		}
		
		
		document.getElementById("general").appendChild(document.createElement("br"));
		document.getElementById("general").appendChild(document.createTextNode("LA SECUENCIA ES:"));
		document.getElementById("general").appendChild(document.createElement("br"));
		document.getElementById("general").appendChild(parrafo);
	}
}

function validarNumeros(superior, inferior){
	var boolean = true;
	if(isNaN(inferior) == true){
		alert("Ha introducido un valor no numérico como inferior.\nNo es posible realizar la secuencia.")
		boolean = false;
		
	}
	if( inferior.length == 0 || /^\s+$/.test(inferior) ){
		alert("Debe introducir un valor como inferior.\nNo es posible realizar la secuencia.")
		boolean = false;

	}
	if(isNaN(superior) == true){
		alert("Ha introducido un valor no numérico como superior.\nNo es posible realizar la secuencia.")
		boolean = false;
	}
	if( superior.length == 0 || /^\s+$/.test(inferior) ){
		alert("Debe introducir un valor como superior.\nNo es posible realizar la secuencia.")
		boolean = false;

	}
	else if(inferior>=superior){
		alert("El límite superior no puede ser menor o igual que el inferior.\nNo es posible realizar la secuencia.")
		boolean = false;
	}

	return boolean;


}



