package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputMultiplexer;
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
	
	//Referencias para la recogida de eventos (El gui y la lógica)
	InputMultiplexer marcodeeventos = new InputMultiplexer();
	
	//Teclas
	boolean pulsandoA,pulsandoW,pulsandoS,pulsandoD;
	int zoomcamara;
	
	//Objetos
	public Torre torre;
    public Array <Tierra> tierras;
	public Contenedorhud contenedorhud;
	public Generadordeeventos generadordeeventos;
	
	//Para crear el reloj
	long tiempoinicial;
	long tiempotranscurridoensegundos;
	int tiempotranscurridoenminutos;
	int tiempotranscurridoenhoras;
	long ultimotiempo;
	int tiempoentreestaciones = 100;
	int agno=1;
	
	String estacion="primavera";
	
	
	public Logica(){
		iniciarclase();
		
	};
	
	private void iniciarclase(){
		
		
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
		ultimotiempo=tiempotranscurridoensegundos=(TimeUtils.millis()-tiempoinicial)/1000;
		
		//El generador de eventos (Esta vez lo instanciamos con códigos
		//predefinidos, más adelante los eventos posibles dependerán del nivel
		//Se cargaría el Generador de eventos con una array, extraída de la clase
		//"Colección" de eventos
		
		Evento[] arraydepruebadeeventos = new Evento[2];
		Opcion[] arraydeopciones = new Opcion[3];
		Opcion opcion1 = new Opcion("Opcion 1", 1);
		Opcion opcion2 = new Opcion("Opcion 2", 10);
		Opcion opcion3 = new Opcion("Opcion 3", 100);
		arraydeopciones[0] = opcion1;
		arraydeopciones[1] = opcion2;
		arraydeopciones[2] = opcion3;
		
		Evento evento = new Evento(arraydeopciones, contenedorhud.contenedordeactores);
		arraydepruebadeeventos[1] = evento;
				
		generadordeeventos = new Generadordeeventos(contenedorhud, arraydepruebadeeventos);
		
		//Añadir tanto la stage como la propia lógica al marco de eventos
		marcodeeventos.addProcessor(this);
		marcodeeventos.addProcessor(contenedorhud.contenedordeactores);
		Gdx.input.setInputProcessor(marcodeeventos);
		
		
		}	
	};
	
	public void actualizar(float delta){
		
		recogereventosdeteclado();
		tiempotranscurridoensegundos=(TimeUtils.millis()-tiempoinicial)/1000;
		tiempotranscurridoenminutos=(int)Math.abs((float)tiempotranscurridoensegundos/60);
		tiempotranscurridoenhoras=(int)tiempotranscurridoenminutos/60;
		
		//Provisional
		actualizarvariables(delta);
		actualizarestaciones();
		actualizarcamposdecultivo();
		actualizarmenus(delta);
		actualizargeneradordeeventos();
	};
	
	public void actualizarmenus(float delta){
		contenedorhud.actualizartiempo((int)tiempotranscurridoensegundos,tiempotranscurridoenminutos,tiempotranscurridoenhoras);
		contenedorhud.act(delta);
	};
	public void actualizarvariables(float delta){
		Variablesdejuego.variablesdejuego.actualizar();
	}
	
	public void actualizarestaciones(){
		
		if((int)((tiempotranscurridoensegundos-ultimotiempo)/tiempoentreestaciones)==0){
			estacion="primavera";
		}
		else if((int)((tiempotranscurridoensegundos-ultimotiempo)/tiempoentreestaciones)==1){
			estacion="verano";
		}
		else if((int)((tiempotranscurridoensegundos-ultimotiempo)/tiempoentreestaciones)==2){
			estacion="otoño";
		}
		else if((int)((tiempotranscurridoensegundos-ultimotiempo)/tiempoentreestaciones)==3){
			estacion="invierno";
		}
		else if((int)((tiempotranscurridoensegundos-ultimotiempo)/tiempoentreestaciones)>3){
			ultimotiempo=tiempotranscurridoensegundos;
			agno+=1;
		}
		
	};
	
	public void actualizargeneradordeeventos(){
		
		generadordeeventos.actualizar(tiempotranscurridoenminutos);
		
	}
	
	public void actualizarcamposdecultivo(){
		for(Tierra tierra:tierras){
			if ((MathUtils.random(0, 30)==0)){
			tierra.actualizarestacion(estacion);
			}
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
