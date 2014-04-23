package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class Generadordeeventos {

	Evento[] arraydeeventos;
	
	public Generadordeeventos(Evento[] arraydeeventos, Stage contexto){
	this.arraydeeventos = arraydeeventos;
	
	
	//PRUEBA
	arraydeeventos[1].ejecutarevento(contexto);
	
	
	}
	
	public void actualizar(int tiempoenminutos){
	
		
		//Si hay un evento y si no hemos llegado al final de la array de eventos
		if(tiempoenminutos<arraydeeventos.length){
		if(arraydeeventos[tiempoenminutos]!=null)
		{
			/*
			System.out.println("SUCEDE ALGO");
			arraydeeventos[tiempoenminutos].ejecutarevento();
			arraydeeventos[tiempoenminutos]=null;
			*/
		}
		}
	};
	
}
