window.onload = iniciar;

function iniciar(){
    var boton = document.getElementById("mostrarIntervalo");

    boton.onclick = mostrar;
}

function mostrar(){

    //Obtener los valores introducidos en inferior y superior
    var min = document.getElementById("inferior").value;
    var max = document.getElementById("superior").value;

    //Validar que son números
    if (esNumero(min) && esNumero(max)){
        
        //Crear un elemento párrafo
        var parrafo = document.createElement("p");
        
        var num

        //Añadir al párrafo nodos de texto con los valores del intervalo
        for (var i = ++min; i < max; i++){
            num = document.createTextNode(" "+i);
            parrafo.appendChild(num);
        }
        
        //Añadir el párrafo al documento
        document.body.appendChild(parrafo);
    }

    else
        alert("Los valores introducidos no son números")
}
