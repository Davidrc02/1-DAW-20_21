window.onload = function(){
	alert("entra enfuntion");
	iniciar();
	
}

function iniciar(){
    alert("entra eniniciar");
    var enlaces = document.getElementsByClassName("seguirLeyendo");

    for(var i = 0; i<enlaces.length; i++){
      enlaces[i].onclick = mostrarMas;
    }

   /* enlaces[0].onclick = mostrarMas;
    enlaces[1].onclick = mostrarMas;*/


}

function mostrarMas(){
	//entra cuando hemos clickeado en un enlace
   	var parrafos = document.getElementsByTagName("p");
	var parrafo=this.parentNode;
	alert("entra en mostrarMas");
	var indice;
	for(var i = 0; i<parrafos.length; i++){
     		if (parrafos[i]==parrafo)  indice=i;	
    	}
	
    	switch(indice){
        
       		 case 0:
            
        		//Crear variable con texto a añadir
      			  var texto = document.createTextNode(" de la secuencia principal y clase de luminosidad V que se encuentra en el centro del sistema solar y constituye la mayor fuente de radiación electromagnética de este sistema planetario.​ Es una esfera casi perfecta de plasma, con un movimiento convectivo interno que genera un campo magnético a través de un proceso de dinamo. Cerca de tres cuartas partes de la masa del Sol constan de hidrógeno; el resto es principalmente helio, con cantidades mucho más pequeñas de elementos, incluyendo el oxígeno, carbono, neón y hierro.");

   		   	  //Eliminar el enlace
     		  	 var enlaceArray = parrafos[0].getElementsByClassName("seguirLeyendo");
     			   var enlace = enlaceArray[0];
      		  enlace.parentNode.removeChild(enlace);

      			  //Añadir texto
       			 parrafos[0].appendChild(texto);

      			  break;

       		 case 1:
            
     		   //Crear variable con texto a añadir
       			 var texto = document.createTextNode(", mientras que en cuanto al tamaño proporcional respecto a su planeta es el satélite más grande: un cuarto del diámetro de la Tierra y 1/81 de su masa. Después de Ío, es además el segundo satélite más denso. Se encuentra en relación síncrona con la Tierra, siempre mostrando la misma cara hacia el planeta. El hemisferio visible está marcado con oscuros mares lunares de origen volcánico entre las brillantes montañas antiguas y los destacados astroblemas.");

       			 //Eliminar el enlace
      			  var enlaceArray = parrafos[1].getElementsByClassName("seguirLeyendo");
       			 var enlace = enlaceArray[0];
      			  enlace.parentNode.removeChild(enlace);
	
      			  //Añadir texto
      			  parrafos[1].appendChild(texto);

      			  break;

        default:  break;
    }
}
