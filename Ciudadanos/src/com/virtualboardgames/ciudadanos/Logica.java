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
	
	//Objetos
	public Torre torre;
    public Array <Tierra> tierras;
	public Contenedorhud contenedorhud;
	
	
	
	
	//Para crear el reloj
	long tiempoinicial;
	long tiempotranscurrido;
	long ultimotiempo;
	int tiempoentreestaciones = 10;
	int agno=1;
	
	String estacion="primavera";
	
	
	public Logica(){
		iniciarclase();
		
	};
	
	private void iniciarclase(){
		
		Gdx.input.setInputProcessor(this);
		
		//Creamos el objeto
		//La torre	
		torre = new Torre();
		
		//Las tierras
		tierras = new Array<Tierra>();
		for(int i=0;i<22;i++){
		for(int j=0;j<8;j++){
		Tierra tierra = new Tierra();
		tierra.posicionX+=i*1.0f-10;
		tierra.posicionY-=j*1.0f;
		tierras.add(tierra);
		};
		
		//El contenedor hud
		contenedorhud = new Contenedorhud();
		
		//El reloj
		tiempoinicial=TimeUtils.millis();
		
		ultimotiempo=tiempotranscurrido=(TimeUtils.millis()-tiempoinicial)/1000;
		}	
	};
	
	public void actualizar(float delta){
		
		recogereventosdeteclado();
		tiempotranscurrido=(TimeUtils.millis()-tiempoinicial)/1000;
		actualizarestaciones();
		actualizarcamposdecultivo();
	};
	
	public void actualizarestaciones(){
		
		if((int)((tiempotranscurrido-ultimotiempo)/tiempoentreestaciones)==0){
			estacion="primavera";
		}
		else if((int)((tiempotranscurrido-ultimotiempo)/tiempoentreestaciones)==1){
			estacion="verano";
		}
		else if((int)((tiempotranscurrido-ultimotiempo)/tiempoentreestaciones)==2){
			estacion="otoño";
		}
		else if((int)((tiempotranscurrido-ultimotiempo)/tiempoentreestaciones)==3){
			estacion="invierno";
		}
		else if((int)((tiempotranscurrido-ultimotiempo)/tiempoentreestaciones)>3){
			ultimotiempo=tiempotranscurrido;
			agno+=1;
		}
		
	};
	
	public void actualizarcamposdecultivo(){
		for(Tierra tierra:tierras){
			tierra.actualizarestacion(estacion);
		};
	};
	
	
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
