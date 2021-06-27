window.onload=function(){
	document.getElementById("btnAceptar").onclick = validarFormulario;	
}

function validarFormulario(){

	//meto texto en una variable el contenido de caja:
	var numero = document.getElementById("numero").value;

	//hacemos la comprobación en un condicional

	if(esNumero(numero))
		document.write("Es numero");
	
	else
	document.write("No es numero");



}

