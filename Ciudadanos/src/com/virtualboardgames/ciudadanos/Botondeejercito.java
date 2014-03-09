package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;


public class Botondeejercito extends Actor {

private float posicionx = 775;
private float posiciony = 550;
		
		
		private TextureRegion texturabotonejercito;
		
		
		public Botondeejercito(Stage stage){
			init();
		};
		private void init(){
			texturabotonejercito = Texturasysonidos.texturasysonidos.botones.botonejercito;
			this.setBounds(775, 550, 25, 25);
			
			this.addListener(new InputListener(){
					public boolean touchDown(InputEvent event, float x, float y, int pointer, int actor){
						System.out.println("Dentrodelarea");
						texturabotonejercito = Texturasysonidos.texturasysonidos.botones.botonejercitopulsado;
						return true;
					};
					public void enter(InputEvent event, float x, float y, int pointer, Actor actor){
						texturabotonejercito = Texturasysonidos.texturasysonidos.botones.botonejercitosobre;
					};
					public void touchUp(InputEvent event, float x, float y, int pointer, int button){
						texturabotonejercito = Texturasysonidos.texturasysonidos.botones.botonejercito;
					}
				 	public void exit(InputEvent event, float x, float y, int pointer, Actor actor){
				 		texturabotonejercito = Texturasysonidos.texturasysonidos.botones.botonejercito; 
				 	};
			});
		};
		
		public void draw(SpriteBatch batch, float alpha){
	        batch.draw(texturabotonejercito,posicionx,posiciony);
	}
			
	};