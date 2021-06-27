/* 
- Primero creo un array con todos los elementos de la lista que sean input. 
- Después declaro una variable que trataré como booleana y la inicializo en false. 
- Entro en el for y lo recorro empezando desde la posición 1 en lugar de la 0 porque el ejercicio 
nos pide que el primer checkbox no sea tenido en cuenta. 
- En el momento en el que se encuentra un elemento marcado, como solo necesito validar 1 para 
devolver true por los requisitos, actualiza la variable booleana y fuerzo la 
interrupción del bucle en vez de con un return alterando el valor de i.
- Finalmente imprimo el booleano.
*/

function elementoSeleccionado(lista){
	var elementos = document.getElementById(lista).getElementsByTagName("input");
	var bool = false;

	for(var i=1; i<elementos.length;i++){
		if(elementos[i].checked == true){
			bool = true;
			i=5; 
		}		
	}

	alert(bool);
}

