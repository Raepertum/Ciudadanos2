package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetErrorListener;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.utils.Disposable;

public class Texturasysonidos implements Disposable, AssetErrorListener{

	//Para gestionar los archivos y recoger errores y excepciones
	private AssetManager assetmanager;
	public static final Texturasysonidos texturasysonidos = new Texturasysonidos();
	
	//Para que sólo se pueda instanciar una vez
	private Texturasysonidos(){};
		
	//La Torre
	public TorreGrafica torre;
	//La tierra (Y el campo más adelante)
	public TierraGrafica tierra;
	
	
	public void init(AssetManager assetmanager){
		this.assetmanager = assetmanager;
		assetmanager.setErrorListener(this);
		assetmanager.load(Constantes.TEXTURE_ATLAS, TextureAtlas.class);
		assetmanager.finishLoading();
	
	
	TextureAtlas atlasdetodaslastexturas = assetmanager.get(Constantes.TEXTURE_ATLAS);
	for (Texture t : atlasdetodaslastexturas.getTextures())
		t.setFilter(TextureFilter.Linear, TextureFilter.Linear);
	
	//Cada vez que creemos un nuevo objeto, hay que registrar aquí los gráficos
	
	torre = new TorreGrafica(atlasdetodaslastexturas);
	tierra = new TierraGrafica(atlasdetodaslastexturas);
	}
	
	@Override
	public void error(AssetDescriptor arg0, Throwable arg1) {
		System.out.println("No se ha podido cargar la textura");
	}

	@Override
	public void dispose() {
		assetmanager.dispose();
		
	}
	
	
	public class TorreGrafica{
		public final AtlasRegion base;
		public final AtlasRegion medio;
		public final AtlasRegion copa;
		
		public TorreGrafica(TextureAtlas atlas){
			base = atlas.findRegion("Base");
			copa = atlas.findRegion("Copa");
			medio = atlas.findRegion("Medio");
		}
	}
	public class TierraGrafica{
		public final AtlasRegion tierrasinabonar;
		
		public TierraGrafica(TextureAtlas atlas){
			tierrasinabonar = atlas.findRegion("tierra");
		}
	}

}
