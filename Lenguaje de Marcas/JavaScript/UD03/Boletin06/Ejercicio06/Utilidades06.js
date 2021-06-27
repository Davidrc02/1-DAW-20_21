function textoVacio(texto){		
	if( texto.length == 0 || /^\s+$/.test(texto) )
		return(true);
		
	else
		return(false);
}

function esCorreo(texto){

	const re_mail=/[\w-\.]{3,}@([\w-]{2,}\.)*([\w-]{2,}\.)[\w-]{2,4}/;
	
	return re_mail.test(String(texto).toLowerCase()); //No debería ser necesario pasarlo a minúsculas.
}


function contrasenaValida(nueva, cnueva){

	const re_password=/(^(?=.*[a-z])(?=.*[A-Z])(?=.*\d){6,20}.+$)/;

	if (re_password.test(nueva)){
		if(nueva==cnueva){
			return true;
		}
		else{
			return false;
			//alert("Las contraseñas no coinciden.");
		}
		
	}
	else{
		//alert("Formato de contraseña incorrecto.");
		return false;	
	}
}

function contrasenaValida2(nueva, cnueva){
	
	const re_password=/(^(?=.*[a-z])(?=.*[A-Z])(?=.*\d){6,20}.+$)/;

	return (re_password.test(nueva) && nueva.equals(cnueva))
}


function esFecha(texto){

	const re_fecha=/^\d{1,2}\/\d{1,2}\/\d{2,4}$/;
	return re_fecha.test(texto);
}

function anade(etiqueta, texto, idpadre,atributoid){
	var elemento = document.createElement(etiqueta);	

	elemento.innerHTML = texto; //no usar con MJ
	elemento.setAttribute("id",atributoid);
	
		
	var aux = document.getElementById(idpadre);
	aux.appendChild(elemento);
}

//anade version MariaJose
function anadeVMJ(etiqueta, texto, idpadre,atributoid){

	var elemento = document.createElement(etiqueta);
	
	elemento.id=atributoid;
	var ntexto=document.createTextNode(texto);
	elemento.appendChild(ntexto);
		
	var aux = document.getElementById(idpadre);
	aux.appendChild(elemento);
}

function borra(idpadre,etiqueta){
	var padre =document.getElementById(idpadre);
	var elementos = padre.getElementsByTagName(etiqueta);
	padre.removeChild(elementos(elementos.length-1));
}