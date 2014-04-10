package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Stack;
import com.badlogic.gdx.scenes.scene2d.ui.Table;


public class Evento extends Stack {
	
	Table tabledebase;
	Table tabledeevento;
	Stage contexto;
	//El fondo para el evento
	Image fondoevento;
	
	
	
	public Evento(Opcion[] arraydeopciones, Stage contexto){
		//Crear el evento
		//El contexto
		this.contexto = contexto;
		//Table
		tabledeevento = new Table();
		this.setSize(740, 540);
		this.setPosition(30, 30);
		this.add(tabledeevento);
		tabledeevento.padTop(30);
		
		//Propiedades
		
		
		//Fondo que incluye el dibujo
		fondoevento = new Image(Texturasysonidos.texturasysonidos.estilosyactores.fondoEvento);
		
		//Probamos a añadir el fondo a la table de evento
		tabledeevento.addActor(fondoevento);
		//Opciones (Botones creados a partir de las opciones)
		for(int i=0;i<arraydeopciones.length;i++){
			//tabledeevento.add(arraydeopciones[i]);
		};
				
		
	};
	
	public void ejecutarevento(){
		
		
		System.out.println("Añadimos la tabla del evento");
		
		//Mostrar evento en pantalla, añadiéndolo a la stage
		contexto.addActor(this);
		
		//Subir el contador de eventos
		
		
	}

}
