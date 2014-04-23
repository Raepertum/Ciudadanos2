package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class Registrodeeventos {

	public static final Registrodeeventos registrodeeventos = new Registrodeeventos();
	
	Evento[] todosloseventos;
	Evento evento1;
	
	public Registrodeeventos(){
	
	//Preparamos el primer evento
	
	evento1 =new Evento("Unos campesinos quieren ocupar uno de tus campos y cultivarlo" +
			". A cambio se comprometen a ofrecerte la mitad de sus cosechas.", 100);
	
	todosloseventos[1] = evento1;
	
	};
	
	//Fin del primer evento
	
	Evento solicitarevento(int numerodeevento){
		return todosloseventos[numerodeevento];
	};
	
	
}




