package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class Registrodeeventos {

	Evento[] todosloseventos;
	Evento evento1;
	
	public Registrodeeventos(Stage contexto){
	
	//Preparamos el primer evento
	String textoEvento1 = "Unos campesinos quieren ocupar uno de tus campos y cultivarlo" +
				". A cambio se comprometen a ofrecerte la mitad de sus cosechas.";
	
	Opcion[] arraydeopcionesevento1 = new Opcion[5];
	Aviso[] arraydeavisosevento1 = new Aviso[5];
	
	Opcion opcion1evento1 = new Opcion("a) En un acto de infinita gracia, les concedes lo que piden sin" +
	" exigirles nada a cambio.", Texturasysonidos.texturasysonidos.estilosyactores.estilobotondefault,
	0,100,50);
			
	Opcion opcion2evento1 = new Opcion("b) Con la cuarta parte bastará, pero que no olviden tu magnanimidad.",
	Texturasysonidos.texturasysonidos.estilosyactores.estilobotondefault,10,100,50); 
			
	Opcion opcion3evento1 =new Opcion("c) La mitad de las cosechas te parece justo, les dejas pasar.", 
	Texturasysonidos.texturasysonidos.estilosyactores.estilobotondefault,20,100,50);
			
	Opcion opcion4evento1 =new Opcion("d) La mitad no basta. Exiges las tres cuartas partes de lo que" +
	"produzcan.", Texturasysonidos.texturasysonidos.estilosyactores.estilobotondefault,30,100,50);
			
	Opcion opcion5evento1 = new Opcion("e) Tres cuartas partes de la cosecha y el sacrificio anual de un niño " +
	"o lo pagarán caro.", Texturasysonidos.texturasysonidos.estilosyactores.estilobotondefault,40,100,50);

	arraydeopcionesevento1[0] = opcion1evento1;
	arraydeopcionesevento1[1] = opcion2evento1;
	arraydeopcionesevento1[2] = opcion3evento1;
	arraydeopcionesevento1[3] = opcion4evento1;
	arraydeopcionesevento1[4] = opcion5evento1;
	
	Aviso avisoopcion1evento1 = new Aviso("Has pulsado la opcion A");
	Aviso avisoopcion2evento1 = new Aviso("Has pulsado la opcion B");
	Aviso avisoopcion3evento1 = new Aviso("Has pulsado la opcion C");
	Aviso avisoopcion4evento1 = new Aviso("Has pulsado la opcion D");
	Aviso avisoopcion5evento1 = new Aviso("Has pulsado la opcion E");
	
	arraydeavisosevento1[0] = avisoopcion1evento1;
	arraydeavisosevento1[1] = avisoopcion2evento1;
	arraydeavisosevento1[2] = avisoopcion3evento1;
	arraydeavisosevento1[3] = avisoopcion4evento1;
	arraydeavisosevento1[4] = avisoopcion5evento1;
	
	evento1 =new Evento(textoEvento1, arraydeopcionesevento1, arraydeavisosevento1, contexto);
	
	todosloseventos[1] = evento1;
	
	};
	
	//Fin del primer evento
	
	Evento solicitarevento(int numerodeevento){
		return todosloseventos[numerodeevento];
	};
	
	
}




