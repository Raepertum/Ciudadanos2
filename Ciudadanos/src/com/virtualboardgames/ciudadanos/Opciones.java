package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Array;

//Es una table que a�adimos debajo de la imagen y el texto del evento
public class Opciones extends Table {
	
	Array<TextButton> arraydebotonesalosquehayquequitarevento;
	int[] efectos;
	int efectodelboton;
	
	public Opciones(String[] arraydetextosdeopciones, int[] codigodeefectos, Logica contexto){
		
		for(int i= 0; i<arraydetextosdeopciones.length; i++){
		
		BotonOpcion opcion = new BotonOpcion(arraydetextosdeopciones[i],
				Texturasysonidos.texturasysonidos.estilosyactores.estilobotondefault, 
				codigodeefectos[i]);
		opcion.addCaptureListener(new InputListener() {
		public boolean touchDown(InputEvent event, float x, float y, int pointer, int actor){
			System.out.println(actor);
			return false;
		}
        });
		
		
		this.add(opcion);		
		this.row();
		};
		
		
		//Una opci�n puede modificar variables
		//Una opci�n puede generar nuevos eventos
		
		//Siempre se llamar� a una funci�n, con unos c�digos, as� que habr� que crearla 
		//�En l�gica, en Eventosymen� o en una nueva clase?
		
		//Texto de evento
		//Texto de opciones
		//Codigo de efecto
		//logica.efectodeevento(int codigodeefecto);
	}
	
	private void ejecutaropcion(int codigodeefecto){
		if(codigodeefecto==1){
			System.out.println("C�digo 1");
		}
		else if(codigodeefecto==2){
			System.out.println("C�digo 2");
		}
		else if(codigodeefecto==3){
			System.out.println("C�digo 3");
		}
	};

}
