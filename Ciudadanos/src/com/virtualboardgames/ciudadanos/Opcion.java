package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Array;

//Es una table que añadimos debajo de la imagen y el texto del evento
public class Opcion extends TextButton{
	
	String textodeopcion;
	String textodeconfirmacion;
	Stage contexto;
	int codigodeefecto;
  
	

	public Opcion(String textodeopcion, String textodeconfirmacion, TextButtonStyle estilobotontexto,
		int codigodeefecto, int posicionX, int posicionY, Stage contexto){

		super(textodeopcion,estilobotontexto);
				
		this.textodeopcion = textodeopcion;
		this.codigodeefecto = codigodeefecto;
		this.textodeconfirmacion = textodeconfirmacion;
		this.contexto = contexto;
			
		
		this.addListener(new InputListener(){
			
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int actor){
			    System.out.println("Pulsando");
				imprimirtextoenconsola();
				generaraviso();
				suprimirevento();
				return true;
		}

		
			
		});
	};
		
	public String gettextodeopcion(){
		return this.textodeopcion;
	}
	
	public int getcodigodeefecto(){
		return this.codigodeefecto;
	}
	
	public void imprimirtextoenconsola(){
		System.out.println(this.codigodeefecto);
	};



	

	private void generaraviso(){
		Aviso aviso = new Aviso(textodeconfirmacion, contexto);
		System.out.println("Generando aviso");
	};
	private void suprimirevento(){
		//Habrá que rehacerlo cuando todo se cree en el generador de eventos y se modifique la manera de crearlos
		this.getParent().getParent().remove();

	};
	
	
	
	
}


