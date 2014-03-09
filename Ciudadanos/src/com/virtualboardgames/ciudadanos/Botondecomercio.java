package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Botondecomercio extends Actor{

		private float posicionx = 775;
		private float posiciony = 575;
		
		private TextureRegion texturabotondecomercio;
		
		public Botondecomercio(Stage stage){
			init();
		};
		private void init(){
			texturabotondecomercio = Texturasysonidos.texturasysonidos.botones.botoncomercio;
			this.setBounds(775, 575, 25, 25);
			
			this.addListener(new InputListener(){
				public boolean touchDown(InputEvent event, float x, float y, int pointer, int actor){
					System.out.println("Dentrodelarea");
					texturabotondecomercio = Texturasysonidos.texturasysonidos.botones.botoncomerciopulsado;
					return true;
				};
				public void enter(InputEvent event, float x, float y, int pointer, Actor actor){
					texturabotondecomercio = Texturasysonidos.texturasysonidos.botones.botoncomerciosobre;
				};
				public void touchUp(InputEvent event, float x, float y, int pointer, int button){
					texturabotondecomercio = Texturasysonidos.texturasysonidos.botones.botoncomercio;
				}
			 	public void exit(InputEvent event, float x, float y, int pointer, Actor actor){
			 		texturabotondecomercio = Texturasysonidos.texturasysonidos.botones.botoncomercio; 
			 	};
			});
		};
		
		public void draw(SpriteBatch batch, float alpha){
	        batch.draw(texturabotondecomercio,posicionx,posiciony);
	}
	};