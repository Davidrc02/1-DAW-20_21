
/*Creo una función que compruebe el estado del check. Si es true permite el acceso a la caja
  de texto eliminando el atributo 'readonly' y si es falso vuelve a incorpora dicho atributo. 
  Como setAttribute necesita dos parámetros para funcionar, mientras reciba un valor cualquiera diferente 
  a 'false' en un atributo booleano, lo considerará true. Aún así le paso 'true' para facilitar la 
  comprensión del cógido. Aunque hubiera funcionado con una cadena vacía, por ejemplo. */

function bloqueador(){
    if(document.getElementById("repe").checked == true)
        document.getElementById("asigRepe").removeAttribute("readonly");

    if(document.getElementById("repe").checked == false)
        document.getElementById("asigRepe").setAttribute("readonly","true");
}