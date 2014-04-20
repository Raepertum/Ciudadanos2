package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Stack;
import com.badlogic.gdx.scenes.scene2d.ui.Table;


public class Evento extends Stack {
	
	Table tabledebase;
	Table tabledebotones;
	Stage contexto;
	//El fondo para el evento
	Image fondoevento;
	//El texto del evento
	Label textoevento;
	LabelStyle estilolabel;
	
	
	public Evento(String textoEvento, Opcion[] arraydeopciones, Stage contexto){
		
		//Fondo que incluye el dibujo
		fondoevento = new Image(Texturasysonidos.texturasysonidos.estilosyactores.fondoEvento);
				
		//Crear el evento
		
		//Las propiedades del stack (this=
		this.setSize(740, 540);
		this.setPosition(30, 30);
		
		//El contexto
		this.contexto = contexto;
		
		//Table de base (Comprende el fondo)
		tabledebase = new Table();
		tabledebase.padTop(20);
		this.add(tabledebase);
		
		//Table de botones (Donde se añaden las opciones)
		tabledebotones = new Table();
		tabledebotones.padTop(20);
		this.add(tabledebotones);
		
		
		//Propiedades
		
		
		
		//Probamos a añadir el fondo a la table de evento
		tabledebase.add(fondoevento);
		//El texto del evento
		estilolabel = Texturasysonidos.texturasysonidos.estilosyactores.estilolabeldefault;
		
		textoevento = new Label(textoEvento,estilolabel);
		textoevento.setAlignment(1);
		textoevento.setWrap(true);
		tabledebotones.top().row().width(600);
		tabledebotones.add(textoevento);
		
		//Opciones (Botones creados a partir de las opciones)
		for(int i=0;i<arraydeopciones.length;i++){
			tabledebotones.row().width(600).padTop(20);
			tabledebotones.add(arraydeopciones[i]);
		
		};
				
		
	};
	
	public void ejecutarevento(){
		
		//Mostrar evento en pantalla, añadiéndolo a la stage
		contexto.addActor(this);
		
		//Subir el contador de eventos
		
		
	}

}
