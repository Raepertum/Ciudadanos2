package com.virtualboardgames.ciudadanos;

import java.util.List;

import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Stack;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.esotericsoftware.tablelayout.Cell;

public class MenuComercio extends MenuAbstracto{
	
	//Tablas. La table de fondo s�lo contiene la imagen de fondo.
	//La table de texto contiene los nombres y la informaci�n
	//La table de botones (Si es que no se a�aden los botones a la table de texto)
	//contiene los botones
	
	Table tabledefondo;
	Table tabledeinformacion;
	Table tabledecomercio;
	//La table de dentro del scrollpane
	Table tabledescrollpanecomercio;
	Table tabledebotones;
	Table tabledeordenes;
	
	//Instancias de las im�genes (Una para el fondo, el resto para los iconos)	
	Image fondomenucomercio;
	Image iconocomercio;
	
	
	//Arrays de labels que contienen texto
	Label[] arraydelabelsstring;
	
	//Array de labels que contienen variables
	Label[] arraydelabelsvars;
		
	//Estilos: Para no tener que estar escribiendo desde el principio
	LabelStyle estilolabel;
	TextButtonStyle estilobotontexto;
	ScrollPaneStyle estiloscrollpane;
	
	//Botones de la table de botones
	TextButton Informacion;
	TextButton Edificios;
	TextButton Ordenes;
	
	//Botones de la table de �rdenes
	TextButton Ordenesbasicas;
	TextButton Ordenesavanzadas;
	TextButton Ordenesmaestras;
	
	//Scrollpane de la tabla de almacenes
	ScrollPane scrollpanecomercio;
	
	//Ancho columnas
	int anchocolumnas = 70;
		
	public MenuComercio(){
		
	
	//Creamos las nuevas tables	
	tabledefondo = new Table();
	tabledeinformacion = new Table();
	tabledecomercio = new Table();
	tabledebotones = new Table();
	tabledeordenes = new Table();
	tabledescrollpanecomercio = new Table();
	
	//Posicionamos y definimos el tama�o del stack
	this.setPosition(30,30);
	this.setSize(740, 540);
	
	//A�adimos las tables en el orden correcto
	this.add(tabledefondo);
	this.add(tabledeinformacion);
	this.add(tabledecomercio);
	this.add(tabledebotones);
	this.add(tabledeordenes);
	
	//Vamos instanciando y a�adiendo los objetos (Puede que m�s tarde, por razones de rendimiento
    //se pasen todos a la clase de texturasysonidos)
	
	//El fondo
	fondomenucomercio = new Image(Texturasysonidos.texturasysonidos.estilosyactores.fondoMenuAlmacen);
	
    //Im�genes que se ponen dentro de los men�s
    iconocomercio = new Image(Texturasysonidos.texturasysonidos.estilosyactores.edificioalmacenmenu);
    
    //Los estilos
    estilolabel = Texturasysonidos.texturasysonidos.estilosyactores.estilolabeldefault;
    estilobotontexto = Texturasysonidos.texturasysonidos.estilosyactores.estilobotondefault;
    estiloscrollpane = Texturasysonidos.texturasysonidos.estilosyactores.estiloscrollpanedefault;
    
    //Para dejar espacios
   	Label espacioenblanco = new Label(Variablesdejuego.variablesdejuego.espacioenblanco,estilolabel);
   	
    //El t�tulo
   	Label titulo = new Label(Variablesdejuego.variablesdejuego.comercio.titulo,estilolabel);
   	
    //Creamos los botones para la table de botones
  	Informacion = new TextButton("Informaci�n", estilobotontexto);
  	Edificios = new TextButton("Edificios", estilobotontexto);
  	Ordenes = new TextButton("�rdenes", estilobotontexto);
    
  	//Creamos los botones para la table de �rdenes
  	Ordenesbasicas = new TextButton("�rdenes B�sicas", estilobotontexto);
  	Ordenesavanzadas = new TextButton("�rdenes Avanzadas", estilobotontexto);
  	Ordenesmaestras = new TextButton("�rdenes Maestras", estilobotontexto);
  	
  	//Creamos el scroll pane para la tabla de almacenes
  	scrollpanecomercio = new ScrollPane(tabledescrollpanecomercio, estiloscrollpane);
  	
    //El array de labels
    arraydelabelsstring = new Label[64];
   
    //Las tablas
    
    //Empezamos por arriba a la izquierda, y establecemos los m�rgenes
   	
    //Table de fondo
    tabledefondo.left().top();
    tabledefondo.padLeft(20);
    tabledefondo.padTop(20);
    
    //Table de informaci�n
    tabledeinformacion.left().top();
   	tabledeinformacion.padLeft(20);
   	tabledeinformacion.padTop(20);
   	
   	//Tabla de almacenes
   	tabledecomercio.left().top();
   	tabledecomercio.padLeft(20);
   	tabledecomercio.padTop(20);
   	tabledecomercio.setVisible(false);
   	
   	//Tabla de �rdenes
   	tabledeordenes.center();
   	tabledeordenes.padLeft(20);
   	tabledeordenes.padTop(20);
   	tabledeordenes.setVisible(false);
   	
   	//Tabla de t�tulo y botones
   	tabledebotones.left().top();
   	tabledebotones.padLeft(60);
   	tabledebotones.padTop(60);
   	
   	//A�adimos el fondo
   	tabledefondo.add(fondomenucomercio);
   	
   
    //La tabla de botones
    //Los botones
   	tabledebotones.add(titulo);
   	tabledebotones.add(Informacion).padLeft(50);
    tabledebotones.add(Edificios).padLeft(50);
    tabledebotones.add(Ordenes).padLeft(50);
    
    //Las funciones de los botones
    Informacion.addListener(new ClickListener() {
        public void clicked(InputEvent event, float x, float y) {
            tabledeinformacion.setVisible(true);     
        	tabledecomercio.setVisible(false);  
        	tabledeordenes.setVisible(false);
        };
  		});
    Edificios.addListener(new ClickListener(){
    	public void clicked(InputEvent event, float x, float y){
    		tabledeinformacion.setVisible(false);
    		tabledecomercio.setVisible(true);
    		tabledeordenes.setVisible(false);
    	}
    });
    Ordenes.addListener(new ClickListener(){
    	public void clicked(InputEvent event, float x, float y){
    		tabledeinformacion.setVisible(false);
    		tabledecomercio.setVisible(false);
    		tabledeordenes.setVisible(true);
    	}
    });
  	
   
   	
   	/*
    //Los labels de la tabla de informaci�n   
    
    //Empezamos por la izquierda
   	tabledeinformacion.left();
    
   	//Los strings y los ints se van alternando
    tabledeinformacion.row();
   	for(int i=1; i<11; i++){
    Label label = new Label(Variablesdejuego.variablesdejuego.comercio.stringsdecomercio[i],estilolabel);
    label.setAlignment(1);
    tabledeinformacion.add(label).width(anchocolumnas);
    }
    
	//Trigo
    tabledeinformacion.row().height(60);
    Label label = new Label(Variablesdejuego.variablesdejuego.comercio.stringsdecomercio[11],estilolabel);
    label.setAlignment(1);
    tabledeinformacion.add(label).width(anchocolumnas);
    
    //Las ints del trigo
    for(int i=0; i<9; i++){
    
    Label label2 = new Label(""+Variablesdejuego.variablesdejuego.comercio.intsdecomercio[i],estilolabel);
    label2.setAlignment(1);
    tabledeinformacion.add(label2).width(anchocolumnas);
    }
    
    //Fruta
    tabledeinformacion.row().height(60);
    Label label3 = new Label(Variablesdejuego.variablesdejuego.comercio.stringsdecomercio[12],estilolabel);
    label3.setAlignment(1);
    tabledeinformacion.add(label3).width(anchocolumnas);
    
    //Las ints de la fruta
    for(int i=9; i<18; i++){
    Label label4 = new Label(""+Variablesdejuego.variablesdejuego.comercio.intsdecomercio[i],estilolabel);
    label4.setAlignment(1);
    tabledeinformacion.add(label4).width(anchocolumnas);
    }
    
    //Carne
    tabledeinformacion.row().height(60);
    Label label5 = new Label(Variablesdejuego.variablesdejuego.comercio.stringsdecomercio[13],estilolabel);
    label5.setAlignment(1);
    tabledeinformacion.add(label5).width(anchocolumnas);
    
    //Las ints de la carne
    for(int i=18; i<27; i++){
    Label label6 = new Label(""+Variablesdejuego.variablesdejuego.comercio.intsdecomercio[i],estilolabel);
    label6.setAlignment(1);
    tabledeinformacion.add(label6).width(anchocolumnas);
    }
    
    //Carne salada
    
    tabledeinformacion.row().height(60);
    Label label7 = new Label(Variablesdejuego.variablesdejuego.comercio.stringsdecomercio[14],estilolabel);
    label7.setAlignment(1);
    tabledeinformacion.add(label7).width(anchocolumnas);
   
    
    //Las ints de la carne salada
    
    for(int i=27; i<36; i++){
    Label label8 = new Label(""+Variablesdejuego.variablesdejuego.comercio.intsdecomercio[i],estilolabel);
    label8.setAlignment(1);
    tabledeinformacion.add(label8).width(anchocolumnas);
    
    }
    
    //Pescado
    
    tabledeinformacion.row().height(60);
    Label label9 = new Label(Variablesdejuego.variablesdejuego.comercio.stringsdecomercio[15],estilolabel);
    label9.setAlignment(1);
    tabledeinformacion.add(label9).width(anchocolumnas);
   
    
    //Las ints del pescado
    
    for(int i=36; i<45; i++){
    Label label10 = new Label(""+Variablesdejuego.variablesdejuego.comercio.intsdecomercio[i],estilolabel);
    label10.setAlignment(1);
    tabledeinformacion.add(label10).width(anchocolumnas);
        }
    
    //Miel
    
    tabledeinformacion.row().height(60);
    Label label11 = new Label(Variablesdejuego.variablesdejuego.comercio.stringsdecomercio[16],estilolabel);
    label11.setAlignment(1);
    tabledeinformacion.add(label11).width(anchocolumnas);
   
    
    //Las ints de la miel
    
    for(int i=45; i<54; i++){
    Label label12 = new Label(""+Variablesdejuego.variablesdejuego.comercio.intsdecomercio[i],estilolabel);
    label12.setAlignment(1);
    tabledeinformacion.add(label12).width(anchocolumnas);
    }
    
   
    //La tabla de almacenes
    
   Image iconoalmacen2;
    iconoalmacen2 = new Image(Texturasysonidos.texturasysonidos.estilosyactores.edificioalmacenmenu);
    Image iconoalmacen3;
    iconoalmacen3 = new Image(Texturasysonidos.texturasysonidos.estilosyactores.edificioalmacenmenu);
    Image iconoalmacen4;
    iconoalmacen4 = new Image(Texturasysonidos.texturasysonidos.estilosyactores.edificioalmacenmenu);
    Image iconoalmacen5;
    iconoalmacen5 = new Image(Texturasysonidos.texturasysonidos.estilosyactores.edificioalmacenmenu);
    Image iconoalmacen6;
    iconoalmacen6 = new Image(Texturasysonidos.texturasysonidos.estilosyactores.edificioalmacenmenu);
    Image iconoalmacen7;
    iconoalmacen7 = new Image(Texturasysonidos.texturasysonidos.estilosyactores.edificioalmacenmenu);
    
    tabledescrollpanecomercio.add(iconoalmacen2);
    tabledescrollpanecomercio.row();
    tabledescrollpanecomercio.add(iconoalmacen3);
    tabledescrollpanecomercio.row();
    tabledescrollpanecomercio.add(iconoalmacen4);
    tabledescrollpanecomercio.row();
    tabledescrollpanecomercio.add(iconoalmacen5);
    tabledescrollpanecomercio.row();
    tabledescrollpanecomercio.add(iconoalmacen6);
    tabledescrollpanecomercio.row();
    tabledescrollpanecomercio.add(iconoalmacen7);
    tabledescrollpanecomercio.row();
    tabledescrollpanecomercio.add(iconocomercio);
    tabledescrollpanecomercio.row();
    tabledescrollpanecomercio.add(iconocomercio);
    tabledescrollpanecomercio.row();
    tabledescrollpanecomercio.add(iconocomercio);
    tabledescrollpanecomercio.row();
    tabledescrollpanecomercio.add(iconocomercio);
   
    scrollpanecomercio.size(200, 300);
    scrollpanecomercio.setOverscroll(false, false);
    tabledecomercio.add(scrollpanecomercio);
    
   
    
    //La tabla de �rdenes
    
    tabledeordenes.add(espacioenblanco).row().height(20).padTop(20).size(600,40);
    tabledeordenes.add(Ordenesbasicas).row().height(20).padTop(20).size(600,40);
    tabledeordenes.add(Ordenesavanzadas).row().height(20).padTop(20).size(600,40);
    tabledeordenes.add(Ordenesmaestras).row().height(20).padTop(20).size(600,40);
    
    
    */
    
 }  

public void act(float deltatime){
	scrollpanecomercio.act(deltatime);
}
	
}
