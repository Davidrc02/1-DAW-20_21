
window.onload = function(){
	
	document.getElementById('enlace1').onclick = seguirLeyendo;
	document.getElementById('enlace2').onclick = seguirLeyendo;
}




function seguirLeyendo(){
    
   this.className= "oculto";
   var span=this.parentNode.getElementsByTagName('span');
   span[0].className="visible";	
 
}
