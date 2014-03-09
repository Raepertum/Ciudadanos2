package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Botonsocial extends Actor{


	private float posicionx = 725;
	private float posiciony = 550;
	
	
	private TextureRegion texturabotonsocial;
	
	
	public Botonsocial(Stage stage){
		init();
	};
	private void init(){
		texturabotonsocial = Texturasysonidos.texturasysonidos.botones.botonsocial;
		this.setBounds(725, 550, 25, 25);
		
		this.addListener(new InputListener(){
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int actor){
				System.out.println("Dentrodelarea");
				texturabotonsocial = Texturasysonidos.texturasysonidos.botones.botonsocialpulsado;
				return true;
			};
			public void enter(InputEvent event, float x, float y, int pointer, Actor actor){
				texturabotonsocial = Texturasysonidos.texturasysonidos.botones.botonsocialsobre;
			};
			public void touchUp(InputEvent event, float x, float y, int pointer, int button){
				texturabotonsocial = Texturasysonidos.texturasysonidos.botones.botonsocial;
			}
		 	public void exit(InputEvent event, float x, float y, int pointer, Actor actor){
		 		texturabotonsocial = Texturasysonidos.texturasysonidos.botones.botonsocial; 
		 	};
		});
	};
	
	public void draw(SpriteBatch batch, float alpha){
        batch.draw(texturabotonsocial,posicionx,posiciony);
}
};

