package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.loader.G3dModelLoader;
import com.badlogic.gdx.graphics.g3d.utils.AnimationController;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.UBJsonReader;

public class Logica extends InputAdapter implements InputProcessor{
	
	
	//Teclas
	boolean pulsandoA,pulsandoW,pulsandoS,pulsandoD;
	int zoomcamara;
	
	//Para crear el reloj
	long tiempoinicial;
	long tiempotranscurrido;
	long ultimotiempo;
	
	
	public Logica(){
		iniciarclase();
		
	};
	
	private void iniciarclase(){
		
		Gdx.input.setInputProcessor(this);
		tiempoinicial=TimeUtils.millis();
		ultimotiempo=tiempotranscurrido=(TimeUtils.millis()-tiempoinicial)/1000;
		
	};
	
	public void actualizar(float delta){
		
		recogereventosdeteclado();
		tiempotranscurrido=(TimeUtils.millis()-tiempoinicial)/1000;
		if(tiempotranscurrido>=ultimotiempo+1){
		ultimotiempo=tiempotranscurrido;	
		System.out.println(tiempotranscurrido);
		};
	};
	
	//Mi código
	
	
	//Métodos para capturar teclas
	public void recogereventosdeteclado(){
		pulsandoW=Gdx.input.isKeyPressed(Keys.W);
		pulsandoS=Gdx.input.isKeyPressed(Keys.S);
		pulsandoA=Gdx.input.isKeyPressed(Keys.A);
		pulsandoD=Gdx.input.isKeyPressed(Keys.D);
}
	public boolean scrolled(int scroll){
		zoomcamara=scroll;
		return false;
	}
	

}
