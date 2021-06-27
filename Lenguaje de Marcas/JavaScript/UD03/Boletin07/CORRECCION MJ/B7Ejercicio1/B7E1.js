window.onload = function(){
	document.getElementById("cambiar").onclick=modificar
}


function modificar(){
	var parrafos = document.getElementsByTagName("p");
	cambiaFondo(parrafos[0]);
	cambiaLetra(parrafos[1]);

};

function cambiaFondo(elemento){
	elemento.style.backgroundColor = "red";
}

function cambiaLetra(elemento){
	elemento.style.fontSize = "200%";
	elemento.style.fontFamily = "monospace";
	elemento.style.fontStyle = "italic";
}
