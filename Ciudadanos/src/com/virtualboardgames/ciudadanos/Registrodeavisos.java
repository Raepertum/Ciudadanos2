package com.virtualboardgames.ciudadanos;

public class Registrodeavisos {

Aviso aviso1evento1, aviso2evento1, aviso3evento1, aviso4evento1, aviso5evento1;
Aviso[] avisosevento1;

public Registrodeavisos(){
	
	aviso1evento1 = new Aviso("Has pulsado la opcion A");
	aviso2evento1 = new Aviso("Has pulsado la opcion B");
	aviso3evento1 = new Aviso("Has pulsado la opcion C");
	aviso4evento1 = new Aviso("Has pulsado la opcion D");
	aviso5evento1 = new Aviso("Has pulsado la opcion E");
	
	avisosevento1 = new Aviso[]{aviso1evento1,aviso2evento1,aviso3evento1,aviso4evento1,aviso5evento1};
	
}

public Aviso devolveraviso(int codigo, int numerodeopcion){

	switch(codigo){
	//Evento 1
	case 100:switch (numerodeopcion){
	case 0: return aviso1evento1;
	case 1: return aviso2evento1;
	case 2: return aviso3evento1;
	case 3: return aviso4evento1;
	case 4: return aviso5evento1;
	}
	
	
	}
	
	return null;
	
}

public Aviso[] devolverarrayavisos(int codigo){
	 switch (codigo) {
     case 100:  return avisosevento1;
     default: return null;
   }
	
}

};