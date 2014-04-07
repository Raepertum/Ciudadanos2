package com.virtualboardgames.ciudadanos;

public class Generadordeeventos {

	Evento[] arraydeeventos;
	
	public Generadordeeventos(Contenedorhud contenedorhud, Evento[] arraydeeventos){
	this.arraydeeventos = arraydeeventos;
	}
	
	public void actualizar(int tiempoenminutos){
	
		if(arraydeeventos[tiempoenminutos]!=null){
			System.out.println("SUCEDE ALGO");
			arraydeeventos[tiempoenminutos].ejecutarevento();
			arraydeeventos[tiempoenminutos]=null;
		}
		
	};
	
}
