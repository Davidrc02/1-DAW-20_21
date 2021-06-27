window.onload=function(){
	document.getElementById("crear").onclick = validarFormulario;	
}


function validarFormulario(){

	//validacion mail--------------------------------------------------------------

	var mail = document.getElementById("email").value;

	//hacemos la comprobación en un condicional

	if(!esCorreo(mail))
		anade("span","No correcto", "mail","mailfail"); //usar span
		

    //validacion contraseñas------------------------------------------------------------

    var nueva= document.getElementById("password").value;
    var cnueva= document.getElementById("password2").value;

    if(contrasenaValida(nueva, cnueva))
        alert("Contraseñas válidas.")
    else
        alert("Contraseñas no válidas.");

	//validacion de fecha--------------------------------------------------------------

	var fecha = document.getElementById("fechanac").value;

	//hacemos la comprobación en un condicional

	if(esFecha(fecha))
		alert("Fecha correcta");
	
	else
		alert("Fecha incorrecta");


}