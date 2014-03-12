package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle;
import com.badlogic.gdx.scenes.scene2d.utils.Layout;

public class MenuAlmacen extends Group{
	
	Actor actordeprueba;
	Image imagedeprueba;
	Table tabledeprueba;
	Texture texturadeprueba;
	int posicionx=0;
	int posiciony=0;

	public MenuAlmacen(){
		
	tabledeprueba = new Table();
	imagedeprueba = new Image(Texturasysonidos.texturasysonidos.fondos.fondomenualmacen);	
	tabledeprueba.addActor(imagedeprueba);
	imagedeprueba.setPosition(30, 30);
	
	this.addActor(tabledeprueba);
	
	
		
		
	}
	
	public void draw(SpriteBatch batch, float parentAlpha){
		
		Texturasysonidos.texturasysonidos.fuentes.Arial15.draw(batch,"Penes", 220, 280);
		tabledeprueba.draw(batch, parentAlpha);
		
}
	
}
