package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Botondeeventos extends Actor {
	
	
	private float posicionx = 750;
	private float posiciony = 580;
	
	
	private TextureRegion texturabotondeeventos;
	
	
	public Botondeeventos(Stage stage){
		init();
	};
	private void init(){
		texturabotondeeventos = Texturasysonidos.texturasysonidos.torre.base;
		this.setBounds(750, 580, 50, 20);
		
		addListener(new InputListener(){
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int actor){
				System.out.println("Dentrodelarea");
				return true;
			};
		});
	};
	
	public void draw(SpriteBatch batch, float alpha){
        batch.draw(texturabotondeeventos,posicionx,posiciony);
}
};
