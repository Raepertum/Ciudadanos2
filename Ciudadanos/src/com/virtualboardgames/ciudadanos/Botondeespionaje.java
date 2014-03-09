package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;


public class Botondeespionaje extends Actor {

private float posicionx = 750;
private float posiciony = 550;
		
		
		private TextureRegion texturabotonespionaje;
		
		
		public Botondeespionaje(Stage stage){
			init();
		};
		private void init(){
			texturabotonespionaje = Texturasysonidos.texturasysonidos.botones.botonespionaje;
			this.setBounds(750, 550, 25, 25);
			
			this.addListener(new InputListener(){
				public boolean touchDown(InputEvent event, float x, float y, int pointer, int actor){
					System.out.println("Dentrodelarea");
					texturabotonespionaje = Texturasysonidos.texturasysonidos.botones.botonespionajepulsado;
					return true;
				};
				public void enter(InputEvent event, float x, float y, int pointer, Actor actor){
					texturabotonespionaje = Texturasysonidos.texturasysonidos.botones.botonespionajesobre;
				};
				public void touchUp(InputEvent event, float x, float y, int pointer, int button){
					texturabotonespionaje = Texturasysonidos.texturasysonidos.botones.botonespionaje;
				}
			 	public void exit(InputEvent event, float x, float y, int pointer, Actor actor){
			 		texturabotonespionaje = Texturasysonidos.texturasysonidos.botones.botonespionaje; 
			 	};
			});
		};
		
		public void draw(SpriteBatch batch, float alpha){
	        batch.draw(texturabotonespionaje,posicionx,posiciony);
	}
	};

