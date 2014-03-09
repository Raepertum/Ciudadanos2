package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Contenedorhud {
	
	Stage contenedordeactores;
	Botondeeventos botondeeventos;
	
	public Contenedorhud(){
		init();
	};
	private void init(){
		contenedordeactores = new Stage();
		botondeeventos = new Botondeeventos(contenedordeactores);
		contenedordeactores.addActor(botondeeventos);
	};
	
	public void render(SpriteBatch batch){
		contenedordeactores.act();
		contenedordeactores.draw();
	};
}
