package com.virtualboardgames.ciudadanos;

public class Registrodefunciones {

	public static final Registrodefunciones registrodefunciones = new Registrodefunciones();
	
	private Registrodefunciones(){
		
	//Registro de funciones usa clases accesibles desde cualquier sitio:
	//Variablesdejuego, registro de individuos, registro de granjas...
		
		
	}
	
	public void distribuidordefunciones(int codigo, int numerodeopcion){
		switch(codigo){
		//Evento 1: "Unos campesinos quieren ocupar uno de tus campos y cultivarlo." +
		//" A cambio se comprometen a ofrecerte la mitad de sus cosechas."
		case 100:switch (numerodeopcion){
		//Se instala una familia de aldeanos, cuyo miedo y lealtad base depende de las opciones escogidas
		case 0: instalaciondenuevosciudadanos("aldeanos",100,20,0);
		anadiralaproducciondetrigo(0);
		case 1: instalaciondenuevosciudadanos("aldeanos",80,30,0);
		anadiralaproducciondetrigo(0);
		case 2: instalaciondenuevosciudadanos("aldeanos",70,50,0);
		anadiralaproducciondetrigo(0);
		case 3: instalaciondenuevosciudadanos("aldeanos",60,60,0);
		anadiralaproducciondetrigo(0);
		case 4: instalaciondenuevosciudadanos("aldeanos",50,80,0);
		anadiralaproducciondetrigo(0);
		}
		
		}
	};
	
	
	private void instalaciondenuevosciudadanos(String tipodeciudadanos, int lealtadbase, int miedobase, int habilidadbase){
		
		//Esta llamada nos va a crear una familia de seis miembros
		if(tipodeciudadanos=="aldeanos"){
		Registrodefamilias.registrodefamilias.crearfamiliadealdeanos(lealtadbase, miedobase, habilidadbase);
		}
		
		
	};
	
	private void anadiralaproducciondetrigo(int produccion){
		
	};
	
}
