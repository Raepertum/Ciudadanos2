package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Botondeeventos extends Actor {
	
	private float posicionx = 750;
	private float posiciony = 580;
	private Vector2 vectordeposicion = new Vector2(posicionx,posiciony);
	private Stage contexto;
	
	private TextureRegion texturabotondeeventos;
	
	public Botondeeventos(Stage stage){
		this.contexto = stage;
		System.out.println(stage.getHeight());
		System.out.println(this.localToStageCoordinates(vectordeposicion));
		System.out.println(this.getWidth());
	 
		init();
	};
	private void init(){
		texturabotondeeventos = Texturasysonidos.texturasysonidos.torre.base;
	};
	
	public void draw(SpriteBatch batch, float alpha){
        batch.draw(texturabotondeeventos,posicionx,posiciony);
}
};
