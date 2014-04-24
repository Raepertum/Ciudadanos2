package com.virtualboardgames.ciudadanos;


public class Registrodeeventos {

	Evento evento1;	
	Evento[] todosloseventos;
	
	
	public Registrodeeventos(Registrodeopciones registrodeopciones){
	
	todosloseventos = new Evento[2];
		
	//Creamos cada evento
	evento1 = new Evento("Éste es el texto del primer evento", registrodeopciones.devolverarrayopciones(100));
	
	todosloseventos[0] = evento1;
	
	};
	


public Evento devolverevento(int codigo){

return todosloseventos[codigo];
	
}


};



