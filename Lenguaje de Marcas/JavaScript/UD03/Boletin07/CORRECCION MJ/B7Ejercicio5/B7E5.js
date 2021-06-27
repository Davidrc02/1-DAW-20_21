window.onload = iniciar;

function iniciar() {

    //Deshabilitar el área de texto por defecto
    var area = document.getElementById("asignaturas");
    area.readOnly = true;

    //Obtener el checkbox
    var repetidor = document.getElementById("repite");

    //Desmarcar el checkbox por defecto (para que no se guarde si se actualiza la página)
    repetidor.checked = false;

    //Acción al hacer click
    repetidor.onclick = habilitar;
}

function habilitar(){

    var area = document.getElementById("asignaturas");

    if (this.checked){
        //Habilitar el área de texto
        area.readOnly = false;
        area.placeholder="Introduzca asignaturas";
    }
    else{
        //Si se desmarca el checkbox, deshabilitar el área de texto
        area.readOnly = true;
        area.value="";
        area.placeholder="";
    }
}
