window.onload = function(){
	document.getElementById('oculto1').style.display = 'none';
	document.getElementById('oculto2').style.display = 'none';
	document.getElementById('enlace1').onclick = muestra;
	document.getElementById('enlace2').onclick = muestra;
}

function muestra1() {
	document.getElementById('oculto1').style.display = 'inline';
	document.getElementById('enlace1').style.display = 'none';
}

function muestra2() {
	document.getElementById('oculto2').style.display = 'inline';
	document.getElementById('enlace2').style.display = 'none';
}



function muestra() {
	this.style.display = 'none';	
	var arraySpan=this.parentNode.getElementsByTagName("span");

        arraySpan[arraySpan.length-1].style.display = 'inline';
       
}
