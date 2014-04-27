package com.virtualboardgames.ciudadanos;


public class Registrodeeventos {

	Evento evento1;	
	Evento[] todosloseventos;
	
	
	public Registrodeeventos(Registrodeopciones registrodeopciones){
	
	todosloseventos = new Evento[2];
		
	//Creamos cada evento
	evento1 = new Evento("Unos campesinos quieren ocupar uno de tus campos y cultivarlo." +
			" A cambio se comprometen a ofrecerte la mitad de sus cosechas.", registrodeopciones.devolverarrayopciones(100));
	
	todosloseventos[0] = evento1;
	
	};
	


public Evento devolverevento(int codigo){

return todosloseventos[codigo];
	
}


};



