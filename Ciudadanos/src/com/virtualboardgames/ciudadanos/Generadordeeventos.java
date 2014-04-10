package com.virtualboardgames.ciudadanos;

public class Generadordeeventos {

	Evento[] arraydeeventos;
	
	public Generadordeeventos(Contenedorhud contenedorhud, Evento[] arraydeeventos){
	this.arraydeeventos = arraydeeventos;
	}
	
	public void actualizar(int tiempoenminutos){
	
		//Si hay un evento y si no hemos llegado al final de la array de eventos
		if(tiempoenminutos<arraydeeventos.length){
		if(arraydeeventos[tiempoenminutos]!=null)
		{
			System.out.println("SUCEDE ALGO");
			arraydeeventos[tiempoenminutos].ejecutarevento();
			arraydeeventos[tiempoenminutos]=null;
		}
		}
	};
	
}
