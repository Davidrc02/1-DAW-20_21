window.onload=function(){
    
	document.getElementById("ascendente").onclick=ascendente;
    document.getElementById("descendente").onclick=descendente;
}

function ascendente(){
    
    if(validaCajas()){

        var array = [
            Number(document.getElementById("caja1").value), 
            Number(document.getElementById("caja2").value),
            Number(document.getElementById("caja3").value)
        ];        

        array = bubble(array);         

        document.getElementById("caja1").value=array[0];
        document.getElementById("caja2").value=array[1];
        document.getElementById("caja3").value=array[2];
    }
}

function descendente(){
    
    if(validaCajas()){

        var array = [
            Number(document.getElementById("caja1").value), 
            Number(document.getElementById("caja2").value),
            Number(document.getElementById("caja3").value)
        ];        

        array = bubbleInv(array);         

        document.getElementById("caja1").value=array[0];
        document.getElementById("caja2").value=array[1];
        document.getElementById("caja3").value=array[2];
    }
}



function textoVacio(texto){		
	if( texto.length == 0 || /^\s+$/.test(texto) )
		return(true);
		
	else
		return(false);
}

function esNumero(texto){
	if(textoVacio(texto))
		return(false);
	
	texto=texto.replace(",",".");
	
	if(isNaN(texto))
		return(false);
	
	return(true);	
}

function validaCajas(){
    var caja1 = document.getElementById("caja1").value;
    var caja2 = document.getElementById("caja2").value;
    var caja3 = document.getElementById("caja3").value;
    var bool = true;

    if(!esNumero(caja1)){
        alert("El valor de la caja 1 es incorrecto, introdúzcalo de nuevo.")
        bool=false;
    }
    if(!esNumero(caja2)){
        alert("El valor de la caja 2 es incorrecto, introdúzcalo de nuevo.")
        bool=false;
    }
    if(!esNumero(caja3)){
        alert("El valor de la caja 3 es incorrecto, introdúzcalo de nuevo.")
        bool=false;
    }
    return bool;
}

function bubble(arr) {
	var len = arr.length;
  
	for (var i = 0; i < len ; i++) {
	  for(var j = 0 ; j < len ; j++){ 
	  if (arr[j] > arr[j + 1]) {		
		var temp = arr[j];
		arr[j] = arr[j+1];
		arr[j + 1] = temp;
	  }
	 }
	}
	return arr;
  }

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