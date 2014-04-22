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

//Es una table que a�adimos debajo de la imagen y el texto del evento
public class Opcion extends TextButton{
	
	String textodeopcion;
	int codigodeefecto;
  
	
	public Opcion(String textodeopcion, TextButtonStyle estilobotontexto, int codigodeefecto, 
		int posicionX, int posicionY){
		
		super(textodeopcion,estilobotontexto);
				
		this.textodeopcion = textodeopcion;
		this.codigodeefecto = codigodeefecto;
			
		
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

	private void suprimirevento(){
		//Habr� que rehacerlo cuando todo se cree en el generador de eventos y se modifique la manera de crearlos
		this.getParent().getParent().remove();
	};
	
	private void generaraviso(){
		
	};
	
	
	
	
}


