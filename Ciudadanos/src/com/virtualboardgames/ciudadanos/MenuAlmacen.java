package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
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
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle;
import com.badlogic.gdx.scenes.scene2d.utils.Layout;

public class MenuAlmacen extends Group{
	
	Actor actordeprueba;
	Image imagedeprueba;
	Table tabledeprueba;
	Texture texturadeprueba;
	Skin pruebadeskin;
	TextButton botondeprueba;
	
	int posicionx=0;
	int posiciony=0;

	public MenuAlmacen(){
	
	pruebadeskin = new Skin();
	
	//Mañana hay que probar con otro tipo de Drawable
	
	pruebadeskin.add("texturadeprueba",
			
			//Texturasysonidos.texturasysonidos.botones.botonalmacen.getTexture());
	

			
			new Texture(Gdx.files.internal("data/rock.jpg")));
	
	
	pruebadeskin.add("default", new BitmapFont());
	
	
	
	tabledeprueba = new Table();
	imagedeprueba = new Image(Texturasysonidos.texturasysonidos.fondos.fondomenualmacen);	
	//tabledeprueba.addActor(imagedeprueba);
	imagedeprueba.setPosition(30, 30);
	
	TextButtonStyle textButtonStyle = new TextButtonStyle();
	textButtonStyle.up = pruebadeskin.newDrawable("texturadeprueba", Color.DARK_GRAY);
	textButtonStyle.down = pruebadeskin.newDrawable("texturadeprueba", Color.DARK_GRAY);
	textButtonStyle.checked = pruebadeskin.newDrawable("texturadeprueba", Color.BLUE);
	textButtonStyle.over = pruebadeskin.newDrawable("texturadeprueba", Color.LIGHT_GRAY);
	textButtonStyle.font = pruebadeskin.getFont("default");
	pruebadeskin.add("default", textButtonStyle);

	
	// Create a button with the "default" TextButtonStyle. A 3rd parameter can be used to specify a name other than "default".
	final TextButton button = new TextButton("Click me!", pruebadeskin);
	
	tabledeprueba.add(button);
	button.setPosition(100,150);
	button.setScale(2000);
	this.addActor(tabledeprueba);
	
	
	tabledeprueba.row();
	
	tabledeprueba.row();
	
	
			
		
	}
	
	public void draw(SpriteBatch batch, float parentAlpha){
		
		tabledeprueba.draw(batch, parentAlpha);
		Texturasysonidos.texturasysonidos.fuentes.Arial15.draw(batch, "Prueba", 20, 40);
		Texturasysonidos.texturasysonidos.fuentes.Arial15.draw(batch,"Penes", 220, 280);
		
		
}
	
}
