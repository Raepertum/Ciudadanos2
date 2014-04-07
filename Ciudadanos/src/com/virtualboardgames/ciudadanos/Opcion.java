package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Array;

//Es una table que añadimos debajo de la imagen y el texto del evento
public class Opcion extends Actor{
	
	String textodeopcion;
	int codigodeefecto;
	
	public Opcion(String textodeopcion, int codigodeefecto){
		
		this.textodeopcion = textodeopcion;
		this.codigodeefecto = codigodeefecto;
		this.setBounds(0, 0, 25, 25);
		
		this.addListener(new InputListener(){
			
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int actor){
			    System.out.println("Pulsando");
				imprimirtextoenconsola();
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
	
	
	public void draw(SpriteBatch batch, float alpha){
        batch.draw(Texturasysonidos.texturasysonidos.botones.botonalmacen,0+codigodeefecto*10,0);
    }
	
	
}


