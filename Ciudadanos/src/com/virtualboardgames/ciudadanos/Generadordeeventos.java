package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class Generadordeeventos {

	Evento[] arraydeeventos;
	
	public Generadordeeventos(Nivel1 nivel1, Stage contexto){
	
	arraydeeventos = nivel1.solicitareventosdelnivel();
	
	//PRUEBA
	arraydeeventos[0].ejecutarevento(contexto);
	
	
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
