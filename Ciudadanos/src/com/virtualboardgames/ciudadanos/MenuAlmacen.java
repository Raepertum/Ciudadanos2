package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Stack;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

public class MenuAlmacen extends Stack{
	
	//Tablas. La table de fondo sólo contiene la imagen de fondo.
	//La table de texto contiene los nombres y la información
	//La table de botones (Si es que no se añaden los botones a la table de texto)
	//contiene los botones
	
	Table tabledefondo;
	Table tabledetexto;
	
	
	//Instancias de las imágenes (Una para el fondo, el resto para los iconos)	
	Image fondomenualmacen;
	
	//Instancias de los textos, todos dentro de un label
	Label titulo;
	Label espacio;
	Label cantidadentrames;
	Label cantidadsalemes;
	Label resultadocantidadmes;
	Label cantidadentraano;
	Label cantidadsaleano;
	Label resultadocantidadano;
	Label cantidadalmacenada;
	Label cantidadexpirames;
	Label trigo;
	Label fruta;
	Label carne;
	Label carneensalazon;
	Label pescado;
	Label miel;
	
	//Estilos: Para no tener que estar escribiendo desde el principio
	LabelStyle estilolabel;
	
	//Ancho columnas
	int anchocolumnas = 80;
		
	public MenuAlmacen(){

	//Creamos las nuevas tables	
	tabledefondo = new Table();
	tabledetexto = new Table();
	
	//Posicionamos y definimos el tamaño del stack
	this.setPosition(30,30);
	this.setSize(740, 540);
	
	//Añadimos las tables en el orden correcto
	this.add(tabledefondo);
    this.add(tabledetexto);
	
	//Vamos instanciando y añadiendo los objetos (Puede que más tarde, por razones de rendimiento
    //se pasen todos a la clase de texturasysonidos)
	//El fondo
    fondomenualmacen = new Image(Texturasysonidos.texturasysonidos.estilosyactores.fondoMenuAlmacen);
	
    //Los estilos
    estilolabel = Texturasysonidos.texturasysonidos.estilosyactores.estilolabeldefault;
    
    //Los labels    
    titulo = new Label("ALMACÉN", estilolabel);
    espacio = new Label("", estilolabel);
	cantidadentrames = new Label("Prod/Mes", estilolabel);
	cantidadsalemes = new Label("Gasto/Mes", estilolabel);
	resultadocantidadmes = new Label("Neto mes", estilolabel);
	cantidadentraano = new Label("Prod/Año", estilolabel);
	cantidadsaleano = new Label("Gasto/Año", estilolabel);
	resultadocantidadano = new Label("Neto año", estilolabel);
	cantidadalmacenada = new Label("Reservas", estilolabel);
	cantidadexpirames = new Label("Cad. Próx.", estilolabel);
	trigo = new Label("Trigo", estilolabel);
	fruta = new Label("Fruta", estilolabel);
	carne = new Label("Carne", estilolabel);
	carneensalazon = new Label("Carne sal.", estilolabel);
	pescado = new Label("Pescado", estilolabel);
	miel = new Label("Miel", estilolabel);
	
    //Empezamos por arriba a la izquierda, y establecemos los márgenes
	tabledetexto.left().top();
	tabledetexto.padLeft(20);
	tabledetexto.padTop(20);
	
	//Añadimos el fondo
	tabledefondo.add(fondomenualmacen);
	
	//Añadimos el label (Alternamos con row)
	tabledetexto.left();
	tabledetexto.add(titulo).width(anchocolumnas);
	tabledetexto.row().height(80);
	tabledetexto.add(espacio).width(anchocolumnas);
	tabledetexto.add(cantidadentrames).width(anchocolumnas);
	tabledetexto.add(cantidadsalemes).width(anchocolumnas);
	tabledetexto.add(resultadocantidadmes).width(anchocolumnas);
	tabledetexto.add(cantidadentraano).width(anchocolumnas);
	tabledetexto.add(cantidadsaleano).width(anchocolumnas);
	tabledetexto.add(resultadocantidadano).width(anchocolumnas);
	tabledetexto.add(cantidadalmacenada).width(anchocolumnas);
	tabledetexto.add(cantidadexpirames).width(anchocolumnas);
	tabledetexto.row();
	tabledetexto.add(trigo).width(anchocolumnas);
	tabledetexto.row();
	tabledetexto.add(fruta).width(anchocolumnas);
	tabledetexto.row();
	tabledetexto.add(carne).width(anchocolumnas);
	tabledetexto.row();
	tabledetexto.add(carneensalazon).width(anchocolumnas);
	tabledetexto.row();
	tabledetexto.add(pescado).width(anchocolumnas);
	tabledetexto.row();
	tabledetexto.add(miel).width(anchocolumnas);

	
}
	
}
