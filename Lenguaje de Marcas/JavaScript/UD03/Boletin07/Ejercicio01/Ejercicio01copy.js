window.onload = function(){
	document.getElementById("probar").onclick=cambiarTexto;
	document.getElementById("reset").onclick=resetTexto;
}

function cambiarTexto(){
	
	document.getElementById("p1").style.backgroundColor="red";
	document.getElementById("p2").style.fontSize="150%";
	
}

function resetTexto(){
	
	document.getElementById("p1").style.backgroundColor="white";
	document.getElementById("p2").style.fontSize="100%";
	
}
