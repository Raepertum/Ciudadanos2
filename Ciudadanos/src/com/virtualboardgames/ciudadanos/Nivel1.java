package com.virtualboardgames.ciudadanos;

//Deber�a extender un nivel abstracto
public class Nivel1 {
	
	//En un futuro tendr� que incluir m�s cosas (Como los edificios que aparecen construidos de base en
	//cada nivel). Por el momento s�lo har�n las funciones de array de eventos
	
	Evento[] arrayDeEventos;
	
	public Nivel1(Logica contexto){
	
		
	arrayDeEventos = new Evento[2];
	
	arrayDeEventos[1] = contexto.solicitaralregistrodeventos(1);
	
	
	}
	
	public Evento[] solicitareventosdelnivel(){
		
		return arrayDeEventos;
	}

}
