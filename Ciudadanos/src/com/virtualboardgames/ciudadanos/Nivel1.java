package com.virtualboardgames.ciudadanos;

//Deber�a extender un nivel abstracto
public class Nivel1 {
	
	//En un futuro tendr� que incluir m�s cosas (Como los edificios que aparecen construidos de base en
	//cada nivel). Por el momento s�lo har�n las funciones de array de eventos
	
	Evento[] arrayDeEventos;
	
	public Nivel1(Registrodeeventos registrodeeventos){
	
	arrayDeEventos = new Evento[2];
	
	arrayDeEventos[0] = registrodeeventos.devolverevento(0);
	
	
	
	}
	
	public Evento[] solicitareventosdelnivel(){
		
		return arrayDeEventos;
	}

}
