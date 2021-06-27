function hayTexto(texto){
	
	if (texto == null || texto.length == 0 || /^\s+$/.test(texto))
		return false;
	
	else
		return true;

}

function esNumero(texto){
	
	if(isNaN(texto))
		return false;

	else
		return true;
}

function emailValido(texto){
	
	if(!( /^(.+\@.+\..+)$/.test(texto)))  
		return false;
	
	else
		return true;
}

function validaFecha(texto){
	//Fecha con formato DD/MM/AAAA; DD/MM/AA; D/M/AAAA ó DD/MM/AAAA;
	
	var fechaValida = /^(?:(?:31(\/|-|\.)(?:0?[13578]|1[02]))\1|(?:(?:29|30)(\/|-|\.)(?:0?[1,3-9]|1[0-2])\2))(?:(?:1[6-9]|[2-9]\d)?\d{2})$|^(?:29(\/|-|\.)0?2\3(?:(?:(?:1[6-9]|[2-9]\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\d|2[0-8])(\/|-|\.)(?:(?:0?[1-9])|(?:1[0-2]))\4(?:(?:1[6-9]|[2-9]\d)?\d{2})$/;
	
	if(!(fechaValida.test(texto)))  
		return false;
	
	else
		return true;
	
	/*This expression validates dates in the ITALIAN d/m/y format from 1/1/1600 - 31/12/9999. 
	 *The days are validated for the given month and year. 
	 *Leap years are validated for all 4 digits years from 1600-9999, and all 2 digits years except 00 since it could be any century (1900, 2000, 2100). 
	 *Days and months must be 1 or 2 digits and may have leading zeros. 
	 *Years must be 2 or 4 digit years. 
	 *4 digit years must be between 1600 and 9999. 
	 *Date separator may be a slash (/), dash (-), or period (.) 
	 *
	 *Author: Marco Storti */
}

function validaCodPost(texto){
	if(!(/^\d{5}$/.test(texto)))  
		return false;
	
	else
		return true;
	
}

function passSeguro(texto){
	var pass_seguro = /(^(?=.*[a-z])(?=.*[A-Z])(?=.*\d){6,20}.+$)/;
		
	if (!pass_seguro.test(texto))
		return false;
	
	else
		return true;
}

function elementoSeleccionado(lista){
	var seleccionado = false;

	//Inicicialización a 1 para ignorar el primer elemento
	for(var i = 1; i<lista.length; i++){
		if (lista[i].checked == true){
			seleccionado = true;
			break;
		}
	}

	return seleccionado;

}
