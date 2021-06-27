window.onload=function(){
	document.getElementById("crear").onclick = validarFormulario;	
}

//VERSION A: MJ VERSION (LOS ID ESTÁN MAL RESPECTO A MI HTML)
function validarFormulario(){

	var formu=document.getElementById("formulario");
	var valido=true;

	if(!esCorreo(formu.email.value)){
		alert("Error correo no válido.")
		valido=false;
	}
	else if(!contrasenaValida(formu.password.value, formu.password2.value)){
		alert("Error contraseñas no validas");
		valido=false;		
	}
	else if(!esFecha(formu.fechanac.value)){
		alert("Error fecha incorrecta");
		valido=false;
	}
	if(valido){
		alert("todo ok")
	}
}