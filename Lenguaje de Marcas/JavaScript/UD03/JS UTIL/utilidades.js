// JavaScript Document




/*expresión regular o REGEX o patrón a buscar se enmarca entre /      /
patron.test(cadena) es el método que comprueba si la cadena cumple el patrón
en el ejemplo: cadena que empieza por espacio en blanco (\s) +
(indica que el caracter anterior se repite una o mÃ¡s veces y el $ indica fin de entrada*/
/*/^\s+$/   indica una cadena que contiene solo espacios en blanco*/

/*Crear en un fichero utilidades.js una funcion llamada textoVacio(texto).
 Esta función deberá devolver true si el texto pasado como argumento
 es null, cadena vacía, o tiene solo espacios en blanco o tabuladores. 
  En caso contrario, devolverá false.
 Crear una página que pruebe la función anterior.*/

 function textoVacio(texto){		
	if( texto == null || texto.length == 0 || /^\s+$/.test(texto))
		return(true);
		
	else
		return(false);
}



/*Añadir a utilidades.js una funcion llamada esNumero(texto). 
 * Esta función deberá devolver true
 *  si el texto pasado como argumento es un número válido.
 *   En caso contrario, devolverá false. 
 *   Crear una página que pruebe la función anterior.*/

function esNumero(texto){
	if(textoVacio(texto))
		return(false);
	
	texto=texto.replace(",",".");
	
	if(isNaN(texto))
		return(false);
	
	return(true);	
}

//BURBUJA:

function bubble(arr) {
	var len = arr.length;
  
	for (var i = 0; i < len ; i++) {
	  for(var j = 0 ; j < len - i - 1; j++){ 
	  if (arr[j] > arr[j + 1]) {		
		var temp = arr[j];
		arr[j] = arr[j+1];
		arr[j + 1] = temp;
	  }
	 }
	}
	return arr;
  }

  //BURBUJA INVERTIDA
  function bubbleInv(arr) {
	var len = arr.length;
  
	for (var i = 0; i < len ; i++) {
	  for(var j = 0 ; j < len - i - 1; j++){ 
	  if (arr[j] < arr[j + 1]) {		
		var temp = arr[j];
		arr[j] = arr[j+1];
		arr[j + 1] = temp;
	  }
	 }
	}
	return arr;
  }

 
