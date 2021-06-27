/*Nota: En el boletín dice aumentar al 100% pero es una errata, la profesora confirmó en clase
que el aumento fuera del 150%*/


//Opcion 1: funciones separadas
function agranda(element){
	element.style.fontSize="150%";
}

function reduce(element){
	element.style.fontSize="100%";
}

//Opción 2: Una sola función con dos parámetros:

function reSize(element, porcent){
	element.style.fontSize= porcent;
}