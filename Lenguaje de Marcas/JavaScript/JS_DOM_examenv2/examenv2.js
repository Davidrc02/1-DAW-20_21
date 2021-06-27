window.onload = function(){

    //Inicializo las elecciones a su valor por defecto para que no se queden si se recarga la página:
    document.getElementById("c1").checked=false; 
    document.getElementById("c2").checked=false;  
    document.getElementById("color").value="";
    //Hago la llamada al botón con onclick:
	document.getElementById("boton").onclick=inicio;
}

//La función principal, hace las llamadas a las funciones específicas en función a los valores
//seleccionados por el usuario:

function inicio(){
      
    cambiaFondo(document.getElementById("color").value); //Cambia el color del fondo.

    if(document.getElementById("c1").checked==true ){ //Si están marcados/desmarcados efectuan las funciones.
        aumentaLetra();
    }
    else{
        resetaumentaLetra();
    }
  
    if(document.getElementById("c2").checked==true ){
        colorLetra();
    }
    else{
        resetcolorLetra();
    }
}

function aumentaLetra(){
	document.body.style.fontSize = "200%";	
}

function resetaumentaLetra(){
	document.body.style.fontSize = "100%";	
}

function colorLetra(){
	document.body.style.color = "blue";	
}

function resetcolorLetra(){
	document.body.style.color = "black";	
}

//Version mejorada del código, al darle a cada value directamente el color en el HTML, puedo
//directamente pasárselo a la función para ahorrar las líneas de código individuales:
function cambiaFondo(opcion){
    if(opcion){
        document.body.style.background = opcion;        
    }
    else{
        alert("Debe seleccionar un color en la lista desplegable.");       
    }   

}