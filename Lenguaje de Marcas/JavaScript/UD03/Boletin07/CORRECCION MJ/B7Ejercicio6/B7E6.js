//Código para probar la función elementoSeleccionado()

window.onload = iniciar;

function iniciar(){
    document.getElementById("elemento1").onclick = resultado;
    document.getElementById("elemento2").onclick = resultado;
    document.getElementById("elemento3").onclick = resultado;
    document.getElementById("elemento4").onclick = resultado;
    document.getElementById("elemento5").onclick = resultado;

}

function resultado(){

    //Obtener el listado
    var lista = document.getElementById("listado");

    //Llamar a la función pasando el listado por parámetro, y guardando el valor en una variable
    var mensaje = elementoSeleccionado(lista);

    //Mostrar el valor que devuelve el método
    alert(mensaje);

}
