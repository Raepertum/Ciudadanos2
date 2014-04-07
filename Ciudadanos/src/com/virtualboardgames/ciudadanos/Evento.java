package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;


public class Evento {
	
	Table tabledeevento;
	Stage contexto;
	
	public Evento(Opcion[] arraydeopciones, Stage contexto){
		//Crear el evento
		//El contexto
		this.contexto = contexto;
		//Table
		tabledeevento = new Table();
		//Dibujo
		
		//Opciones (Botones creados a partir de las opciones)
		for(int i=0;i<arraydeopciones.length;i++){
			tabledeevento.add(arraydeopciones[i]);
		};
				
		
	};
	
	public void ejecutarevento(){
		
		
		System.out.println("Añadimos la tabla del evento");
		
		//Mostrar evento en pantalla, añadiéndolo a la stage
		contexto.addActor(tabledeevento);
		
		//Subir el contador de eventos
		
		
	}

}
