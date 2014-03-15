package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.Layout;
import com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class MenuAlmacen extends Group{
	
	Actor actordeprueba;
	Image imagedeprueba;
	Table tabledefondo;
	Table tabledeprueba;
	Texture texturadeprueba;
	Texture texturadeprueba2;
	Skin pruebadeskin;
	TextButton botondeprueba;
	Drawable drawabledeprueba;
	NinePatch ninepatchdeprueba;
	TextureRegionDrawable textureregiondrawabledeprueba;
	Label labeldeprueba;
	
	public MenuAlmacen(){
	
	labeldeprueba = new Label("La repanocha", Texturasysonidos.texturasysonidos.estilosyactores.estilolabeldefault);	
	tabledeprueba = new Table();
	
	tabledefondo = new Table();
	tabledefondo.setPosition(60,600);
	tabledeprueba.setPosition(60, 500);
	
	tabledeprueba.top().left();
	
	tabledeprueba.pad(0, 0, 0, 0);
	tabledeprueba.add(labeldeprueba);
	

	
	this.addActor(tabledefondo);
	this.addActor(tabledeprueba);
	
}
	
	
}
