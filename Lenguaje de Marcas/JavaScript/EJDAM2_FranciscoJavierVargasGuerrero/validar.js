window.onload = function(){
	document.getElementById("comprobar").onclick = validarContenido;
	document.getElementById("limpiar").onclick = limpiar;
	document.getElementById("correcto").style.color= "blue";
	document.getElementById("correcto").style.display= "none";
	document.getElementById("incorrecto").style.color= "red";
	document.getElementById("incorrecto").style.display= "block";
}

function validarContenido(){
	var cajaTexto = document.getElementById("cajaTexto").value;
	var seleccion = document.getElementById("seleccion").value;
	var numero = document.getElementById("numero").value;
	var texto = document.getElementById("texto").value;
	
	
	if (!(isNaN(cajaTexto)) && seleccion == numero){
		document.getElementById("correcto").style.display= "block";
		document.getElementById("incorrecto").style.display= "none";
	}else if(isNaN(cajaTexto) && seleccion == texto){
		document.getElementById("correcto").style.display= "block";
		document.getElementById("incorrecto").style.display= "none";
	}else{
		document.getElementById("incorrecto").style.display= "block";
		document.getElementById("correcto").style.display= "none";
	}
}

function limpiar(){
	document.getElementById("correcto").style.display= "none";
	document.getElementById("incorrecto").style.display= "none";
	document.getElementById("cajaTexto").value = "";
}