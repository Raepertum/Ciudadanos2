package com.virtualboardgames.ciudadanos;

public class Registrodefunciones {

	public static final Registrodefunciones registrodefunciones = new Registrodefunciones();
	
	private Registrodefunciones(){
		
	}
	
	public void distribuidordefunciones(int codigo, int numerodeopcion){
		switch(codigo){
		//Evento 1
		case 100:switch (numerodeopcion){
		//Se instalan diez individuos, de la clase aldeanos, de las cuales tres son hombres adultos, tres son mujeres adultas, un anciano, 
		//una anciana, un niño y una niña, con lealtad 100 y miedo 20, sin habilidad
		case 0: instalaciondenuevosciudadanos("aldeanos",3,3,1,1,1,1,100,20,0);
		
		}
		
		}
	};
	
	
	private void instalaciondenuevosciudadanos(String tipodeciudadanos, int numerodeadultosh, int numerodeadultosm, int numerodeancianos,
			int numerodeancianas, int numerodeninos, int numerodeninas, int lealtad, int miedo, int habilidad){
		
	}
	
}
