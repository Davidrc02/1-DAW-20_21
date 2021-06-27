window.onload = function(){iniciar()}

function iniciar(){
	var p = document.getElementsByTagName("p");

	for(i in p){
		p[i].onmouseover = aumentar;
		p[i].onmouseout = reducir;
	}

}

function aumentar(){
	this.style.fontSize="200%";
}

function reducir(){
	this.style.fontSize="100%";
}
