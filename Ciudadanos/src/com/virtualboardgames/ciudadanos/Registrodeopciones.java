package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.Stage;



public class Registrodeopciones {

	
//Opciones de evento 1
Opcion opcion1e1, opcion2e1, opcion3e1, opcion4e1, opcion5e1;
Opcion[] opcionese1;
Stage contexto;


public Registrodeopciones(Registrodeavisos registrodeavisos, Stage contexto){

	this.contexto = contexto;
	
    //Cada opción lleva asociado un aviso
	opcion1e1 = new Opcion("Has pulsado la opcion A", registrodeavisos.devolveraviso(100, 0), contexto);
	opcion2e1 = new Opcion("Has pulsado la opcion B", registrodeavisos.devolveraviso(100, 1), contexto);
	opcion3e1 = new Opcion("Has pulsado la opcion C", registrodeavisos.devolveraviso(100, 2), contexto);
	opcion4e1 = new Opcion("Has pulsado la opcion D", registrodeavisos.devolveraviso(100, 3), contexto);
	opcion5e1 = new Opcion("Has pulsado la opcion E", registrodeavisos.devolveraviso(100, 4), contexto);
	
	opcionese1 = new Opcion[]{opcion1e1,opcion2e1,opcion3e1,opcion4e1,opcion5e1};
	
	
};

public Opcion devolveropcion(int codigo, int numerodeopcion){

	switch(codigo){
	//Evento 1
	case 100:switch (numerodeopcion){
	case 0: return opcion1e1;
	case 1: return opcion2e1;
	case 2: return opcion3e1;
	case 3: return opcion4e1;
	case 4: return opcion5e1;
	}
	
	}
	
	return null;
	
}

public Opcion[] devolverarrayopciones(int codigo){
	 switch (codigo) {
     case 100:    	
     return opcionese1;
     default: return null;
   }
	
}

};