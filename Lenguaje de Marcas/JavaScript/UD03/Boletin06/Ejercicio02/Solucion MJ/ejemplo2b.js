//Manejador de elementos semánticos:

window.onload=function(){
	iniciar();
}
function iniciar(){
	alert('Elige un curso y rellena su nota');
	document.getElementById("ESO1").checked=false;
	document.getElementById("ESO2").checked=false;	
	document.getElementById("ESO3").checked=false;
	document.getElementById("ESO4").checked=false;
	document.getElementById("ESO1").onclick=ESO1_click;
	document.getElementById("ESO2").onclick=ESO2_click;
	document.getElementById("ESO3").onclick=ESO3_click;
	document.getElementById("ESO4").onclick=ESO4_click;
	document.getElementById("notaMedia1ESO").value=0;
	document.getElementById("notaMedia2ESO").value=0;
	document.getElementById("notaMedia3ESO").value=0;
	document.getElementById("notaMedia4ESO").value=0;
	document.getElementById("notaMedia1ESO").readOnly=true;
	document.getElementById("notaMedia2ESO").readOnly=true;
	document.getElementById("notaMedia3ESO").readOnly=true;
	document.getElementById("notaMedia4ESO").readOnly=true;	
}

function ESO1_click(){
	//if(	document.getElementById("ESO1").checked ){
		document.getElementById("notaMedia1ESO").readOnly=false;
		document.getElementById("notaMedia2ESO").readOnly=true;
		document.getElementById("notaMedia3ESO").readOnly=true;
		document.getElementById("notaMedia4ESO").readOnly=true;
	//}	
}

function ESO2_click(){
	if(	document.getElementById("ESO2").checked ){
		document.getElementById("notaMedia1ESO").readOnly=true;
		document.getElementById("notaMedia2ESO").readOnly=false;
		document.getElementById("notaMedia3ESO").readOnly=true;
		document.getElementById("notaMedia4ESO").readOnly=true;
	}	
}

function ESO3_click(){
	if(	document.getElementById("ESO3").checked ){
		document.getElementById("notaMedia1ESO").readOnly=true;
		document.getElementById("notaMedia2ESO").readOnly=true;
		document.getElementById("notaMedia3ESO").readOnly=false;
		document.getElementById("notaMedia4ESO").readOnly=true;
	}	
}

function ESO4_click(){
	if(	document.getElementById("ESO4").checked ){
		document.getElementById("notaMedia1ESO").readOnly=true;
		document.getElementById("notaMedia2ESO").readOnly=true;
		document.getElementById("notaMedia3ESO").readOnly=true;
		document.getElementById("notaMedia4ESO").readOnly=false;
	}	
}
