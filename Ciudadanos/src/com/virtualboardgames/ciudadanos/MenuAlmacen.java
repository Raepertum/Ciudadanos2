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

public class MenuAlmacen extends MenuAbstracto{
	
	//Tablas. La table de fondo sólo contiene la imagen de fondo.
	//La table de texto contiene los nombres y la información
	//La table de botones (Si es que no se añaden los botones a la table de texto)
	//contiene los botones
	
	Table tabledefondo;
	Table tabledeinformacion;
	//Para los botones de la table de informacion
	Table tabledebotonesinformacion;
	//Stack para añadir las sub-tablas
	Stack stacktabledeinformacion;	
	//Alimentos
	Table tabledeinformacion1;
	//Materias primas
	Table tabledeinformacion2;
	//Armas
	Table tabledeinformacion3;
	//Artesanía
	Table tabledeinformacion4;
	//Bienes de lujo
	Table tabledeinformacion5;
	
	Table tabledealmacenes;
	//La table de dentro del scrollpane
	Table tabledescrollpanealmacenes;
	Table tabledebotones;
	Table tabledeordenes;
	
	//Instancias de las imágenes (Una para el fondo, el resto para los iconos)	
	Image fondomenualmacen;
	Image iconoalmacen;
	
	
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
	TextButton Almacenes;
	TextButton Ordenes;
	
	//Botones de la table de información
	TextButton Alimentos;
	TextButton MatPrimas;
	TextButton Armas;
	TextButton Artesania;
	TextButton BienesLujo;
	
	//Botones de la table de órdenes
	TextButton Ordenesbasicas;
	TextButton Ordenesavanzadas;
	TextButton Ordenesmaestras;
	
	//Scrollpane de la tabla de almacenes
	ScrollPane scrollpanealmacenes;
	
	//Ancho columnas
	int anchocolumnas = 80;
		
	public MenuAlmacen(){
		
	
	//Creamos las nuevas tables	
	tabledefondo = new Table();
	tabledeinformacion = new Table();
	tabledebotonesinformacion = new Table();
	          //Y el Stack
	          stacktabledeinformacion = new Stack();   
	tabledeinformacion1 =  new Table();
	tabledeinformacion2 = new Table();
	tabledeinformacion3 = new Table();
	tabledeinformacion4 = new Table();
	tabledeinformacion5 = new Table();
	tabledealmacenes = new Table();
	tabledebotones = new Table();
	tabledeordenes = new Table();
	tabledescrollpanealmacenes = new Table();
	
	//Posicionamos y definimos el tamaño del stack primario
	this.setPosition(30,30);
	this.setSize(740, 540);
	
	//Añadimos las tables en el orden correcto
	this.add(tabledefondo);
	this.add(tabledeinformacion);
	this.add(tabledealmacenes);
	this.add(tabledebotones);
	this.add(tabledeordenes);
	
	//Añadimos las sub-tablas en el orden correcto
	tabledeinformacion.row();
	tabledeinformacion.add(stacktabledeinformacion);
   	stacktabledeinformacion.add(tabledeinformacion1);
    stacktabledeinformacion.add(tabledeinformacion2);
    stacktabledeinformacion.add(tabledeinformacion3);
    stacktabledeinformacion.add(tabledeinformacion4);
    stacktabledeinformacion.add(tabledeinformacion5);
    stacktabledeinformacion.add(tabledebotonesinformacion);
	
	//Vamos instanciando y añadiendo los objetos (Puede que más tarde, por razones de rendimiento
    //se pasen todos a la clase de texturasysonidos)
	
	//El fondo
	fondomenualmacen = new Image(Texturasysonidos.texturasysonidos.estilosyactores.fondoMenuAlmacen);
	
    //Imágenes que se ponen dentro de los menús
    iconoalmacen = new Image(Texturasysonidos.texturasysonidos.estilosyactores.edificioalmacenmenu);
    
    //Los estilos
    estilolabel = Texturasysonidos.texturasysonidos.estilosyactores.estilolabeldefault;
    estilobotontexto = Texturasysonidos.texturasysonidos.estilosyactores.estilobotondefault;
    estiloscrollpane = Texturasysonidos.texturasysonidos.estilosyactores.estiloscrollpanedefault;
    
    //Para dejar espacios
   	Label espacioenblanco = new Label(Variablesdejuego.variablesdejuego.espacioenblanco,estilolabel);
   	
    //El título
   	Label titulo = new Label(Variablesdejuego.variablesdejuego.almacen.titulo,estilolabel);
   	
    //Creamos los botones para la table de botones
  	Informacion = new TextButton("Información", estilobotontexto);
  	Almacenes = new TextButton("Almacenes", estilobotontexto);
  	Ordenes = new TextButton("Órdenes", estilobotontexto);
  	
  	//Creamos los botones para la table de informacion
  	Alimentos = new TextButton("Alimentos", estilobotontexto);
	MatPrimas = new TextButton("Materias Primas", estilobotontexto);
	Armas = new TextButton("Armas", estilobotontexto);
	Artesania = new TextButton("Artesanía", estilobotontexto);
	BienesLujo = new TextButton("Bienes de lujo", estilobotontexto);
    
  	//Creamos los botones para la table de órdenes
  	Ordenesbasicas = new TextButton("Órdenes Básicas", estilobotontexto);
  	Ordenesavanzadas = new TextButton("Órdenes Avanzadas", estilobotontexto);
  	Ordenesmaestras = new TextButton("Órdenes Maestras", estilobotontexto);
  	
  	//Creamos el scroll pane para la tabla de almacenes
  	scrollpanealmacenes = new ScrollPane(tabledescrollpanealmacenes, estiloscrollpane);
  	
    //El array de labels
    arraydelabelsstring = new Label[64];
   
    //Las tablas
    
    //Empezamos por arriba a la izquierda, y establecemos los márgenes
   	
    //Table de fondo
    tabledefondo.left().top();
    tabledefondo.padLeft(20);
    tabledefondo.padTop(20);
    
    //Table de información
    tabledeinformacion.left().top();
   	tabledeinformacion.padLeft(20);
   	tabledeinformacion.padTop(20);
   	
   	//Table de botones información
    tabledebotonesinformacion.left().top();
   	tabledebotonesinformacion.padLeft(80);
   	tabledebotonesinformacion.padTop(65);
   	
   	//Tabla de almacenes
   	tabledealmacenes.left().top();
   	tabledealmacenes.padLeft(20);
   	tabledealmacenes.padTop(20);
   	tabledealmacenes.setVisible(false);
   	
   	//Tabla de órdenes
   	tabledeordenes.center();
   	tabledeordenes.padLeft(20);
   	tabledeordenes.padTop(20);
   	tabledeordenes.setVisible(false);
   	
   	//Tabla de título y botones
   	tabledebotones.left().top();
   	tabledebotones.padLeft(60);
   	tabledebotones.padTop(60);
   	
   	//Subtablas de información
   	tabledeinformacion1.left().top().padLeft(0).padTop(90);
   	tabledeinformacion2.left().top().padLeft(0).padTop(90).setVisible(false);
   	tabledeinformacion3.left().top().padLeft(0).padTop(90).setVisible(false);
   	tabledeinformacion4.left().top().padLeft(0).padTop(90).setVisible(false);
   	tabledeinformacion5.left().top().padLeft(0).padTop(90).setVisible(false);
   	
   	//Añadimos el fondo
   	tabledefondo.add(fondomenualmacen);
   	
   
    //La tabla de botones
    //Los botones de la table de botones
   	tabledebotones.add(titulo);
   	tabledebotones.add(Informacion).padLeft(50);
    tabledebotones.add(Almacenes).padLeft(50);
    tabledebotones.add(Ordenes).padLeft(50);
        
    //Las funciones de los botones de la table de botones
    Informacion.addListener(new ClickListener() {
        public void clicked(InputEvent event, float x, float y) {
            tabledeinformacion.setVisible(true);     
        	tabledealmacenes.setVisible(false);  
        	tabledeordenes.setVisible(false);
        };
  		});
    Almacenes.addListener(new ClickListener(){
    	public void clicked(InputEvent event, float x, float y){
    		tabledeinformacion.setVisible(false);
    		tabledealmacenes.setVisible(true);
    		tabledeordenes.setVisible(false);
    	}
    });
    Ordenes.addListener(new ClickListener(){
    	public void clicked(InputEvent event, float x, float y){
    		tabledeinformacion.setVisible(false);
    		tabledealmacenes.setVisible(false);
    		tabledeordenes.setVisible(true);
    	}
    });
    
    //La tabla de informacion
    
    //Empezamos por la izquierda
   	tabledeinformacion.left();
   	
   	//Los botones de la table de Información
   	tabledebotonesinformacion.add(Alimentos).padLeft(20);
   	tabledebotonesinformacion.add(MatPrimas).padLeft(20);
   	tabledebotonesinformacion.add(Armas).padLeft(20);
   	tabledebotonesinformacion.add(Artesania).padLeft(20);
   	tabledebotonesinformacion.add(BienesLujo).padLeft(20);
    
   	//Las funciones de los botones de la table de información
   	
   	Alimentos.addListener(new ClickListener() {
        public void clicked(InputEvent event, float x, float y) {
            tabledeinformacion1.setVisible(true);     
            tabledeinformacion2.setVisible(false); 
            tabledeinformacion3.setVisible(false); 
            tabledeinformacion4.setVisible(false); 
            tabledeinformacion5.setVisible(false); 
        };
  		});
    MatPrimas.addListener(new ClickListener(){
    	public void clicked(InputEvent event, float x, float y){
    		tabledeinformacion1.setVisible(false);     
            tabledeinformacion2.setVisible(true); 
            tabledeinformacion3.setVisible(false); 
            tabledeinformacion4.setVisible(false); 
            tabledeinformacion5.setVisible(false); 
    	}
    });
    Armas.addListener(new ClickListener(){
    	public void clicked(InputEvent event, float x, float y){
    		tabledeinformacion1.setVisible(false);     
            tabledeinformacion2.setVisible(false); 
            tabledeinformacion3.setVisible(true); 
            tabledeinformacion4.setVisible(false); 
            tabledeinformacion5.setVisible(false); 
    	}
    });
    Artesania.addListener(new ClickListener(){
    	public void clicked(InputEvent event, float x, float y){
    		tabledeinformacion1.setVisible(false);     
            tabledeinformacion2.setVisible(false); 
            tabledeinformacion3.setVisible(false); 
            tabledeinformacion4.setVisible(true); 
            tabledeinformacion5.setVisible(false); 
    	}
    });
    BienesLujo.addListener(new ClickListener(){
    	public void clicked(InputEvent event, float x, float y){
    		tabledeinformacion1.setVisible(false);     
            tabledeinformacion2.setVisible(false); 
            tabledeinformacion3.setVisible(false); 
            tabledeinformacion4.setVisible(false); 
            tabledeinformacion5.setVisible(true); 
    	}
    });
    
   	
    //Los labels de la tabla de información   
    
    //La tabla de información 1(Alimentos)
    
   	//Los strings y los ints se van alternando
    //!!!!!!!!!!!!!!!
    //¿Se puede crear una función para la creación de labels?
    //!!!!!!!!!!!!!!!
    
   	tabledeinformacion1.row();
   	tabledeinformacion1.add(espacioenblanco).height(40);
   	
   	for(int i=0; i<8; i++){
    Label label = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenalimentos[i],estilolabel);
    label.setAlignment(1);
    tabledeinformacion1.add(label).width(anchocolumnas);
    }
    
	//Trigo
    tabledeinformacion1.row().height(60);
    Label label = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenalimentos[8],estilolabel);
    label.setAlignment(1);
    tabledeinformacion1.add(label).width(anchocolumnas);
    
    //Las ints del trigo
    for(int i=0; i<8; i++){
    
    Label label2 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentos[i],estilolabel);
    label2.setAlignment(1);
    tabledeinformacion1.add(label2).width(anchocolumnas);
    }
    
    //Fruta
    tabledeinformacion1.row().height(60);
    Label label3 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenalimentos[9],estilolabel);
    label3.setAlignment(1);
    tabledeinformacion1.add(label3).width(anchocolumnas);
    
    //Las ints de la fruta
    for(int i=8; i<16; i++){
    Label label4 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentos[i],estilolabel);
    label4.setAlignment(1);
    tabledeinformacion1.add(label4).width(anchocolumnas);
    }
    
    //Carne
    tabledeinformacion1.row().height(60);
    Label label5 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenalimentos[10],estilolabel);
    label5.setAlignment(1);
    tabledeinformacion1.add(label5).width(anchocolumnas);
    
    //Las ints de la carne
    for(int i=16; i<24; i++){
    Label label6 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentos[i],estilolabel);
    label6.setAlignment(1);
    tabledeinformacion1.add(label6).width(anchocolumnas);
    }
    
    //Carne salada
    
    tabledeinformacion1.row().height(60);
    Label label7 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenalimentos[11],estilolabel);
    label7.setAlignment(1);
    tabledeinformacion1.add(label7).width(anchocolumnas);
   
    
    //Las ints de la carne salada
    
    for(int i=24; i<32; i++){
    Label label8 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentos[i],estilolabel);
    label8.setAlignment(1);
    tabledeinformacion1.add(label8).width(anchocolumnas);
    
    }
    
    //Pescado
    
    tabledeinformacion1.row().height(60);
    Label label9 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenalimentos[12],estilolabel);
    label9.setAlignment(1);
    tabledeinformacion1.add(label9).width(anchocolumnas);
   
    
    //Las ints del pescado
    
    for(int i=32; i<40; i++){
    Label label10 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentos[i],estilolabel);
    label10.setAlignment(1);
    tabledeinformacion1.add(label10).width(anchocolumnas);
        }
    
    //Miel
    
    tabledeinformacion1.row().height(60);
    Label label11 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenalimentos[13],estilolabel);
    label11.setAlignment(1);
    tabledeinformacion1.add(label11).width(anchocolumnas);
   
    
    //Las ints de la miel
    
    for(int i=40; i<48; i++){
    Label label12 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentos[i],estilolabel);
    label12.setAlignment(1);
    tabledeinformacion1.add(label12).width(anchocolumnas);
    }
    
    //La tabla de información 2 (Materias Primas)
    
    tabledeinformacion2.row();
   	tabledeinformacion2.add(espacioenblanco).height(37);
   	
   	for(int i=0; i<8; i++){
   	Label label13 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenalimentos[i],estilolabel);
   	label13.setAlignment(1);
   	tabledeinformacion2.add(label13).width(anchocolumnas);
   	}   
   	
    //Sal
    tabledeinformacion2.row().height(37);
    Label label14 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas[0],estilolabel);
    label14.setAlignment(1);
    tabledeinformacion2.add(label14).width(anchocolumnas);
    
    //Los ints de la sal
    
    for(int i=0; i<8; i++){
    
    Label label2 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimas[i],estilolabel);
    label2.setAlignment(1);
    tabledeinformacion2.add(label2).width(anchocolumnas);
    }
    
    //Madera
    
    tabledeinformacion2.row().height(37);
    Label label16 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas[1],estilolabel);
    label16.setAlignment(1);
    tabledeinformacion2.add(label16).width(anchocolumnas);
    
    
    //Los ints de la madera
    
    for(int i=8; i<16; i++){
        
        Label label2 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimas[i],estilolabel);
        label2.setAlignment(1);
        tabledeinformacion2.add(label2).width(anchocolumnas);
        }
    
    //Piedra
    
    tabledeinformacion2.row().height(37);
    Label label18 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas[2],estilolabel);
    label18.setAlignment(1);
    tabledeinformacion2.add(label18).width(anchocolumnas);
    
    
    //Los ints de la piedra
    
    for(int i=16; i<24; i++){
        
        Label label2 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimas[i],estilolabel);
        label2.setAlignment(1);
        tabledeinformacion2.add(label2).width(anchocolumnas);
        }
    
    //Hierro
    
    tabledeinformacion2.row().height(37);
    Label label20 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas[3],estilolabel);
    label20.setAlignment(1);
    tabledeinformacion2.add(label20).width(anchocolumnas);
    
    
    //Los ints del hierro
    
    for(int i=24; i<32; i++){
        
        Label label2 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimas[i],estilolabel);
        label2.setAlignment(1);
        tabledeinformacion2.add(label2).width(anchocolumnas);
        }
    
    //Cobre
    
    tabledeinformacion2.row().height(37);
    Label label22 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas[4],estilolabel);
    label22.setAlignment(1);
    tabledeinformacion2.add(label22).width(anchocolumnas);
    
    
    //Los ints del cobre
    
    for(int i=32; i<40; i++){
        
        Label label2 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimas[i],estilolabel);
        label2.setAlignment(1);
        tabledeinformacion2.add(label2).width(anchocolumnas);
        }
    
    //Estaño
    
    tabledeinformacion2.row().height(37);
    Label label24 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas[5],estilolabel);
    label24.setAlignment(1);
    tabledeinformacion2.add(label24).width(anchocolumnas);
    
    
    //Los ints del estaño
    
    for(int i=40; i<48; i++){
        
        Label label2 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimas[i],estilolabel);
        label2.setAlignment(1);
        tabledeinformacion2.add(label2).width(anchocolumnas);
        }
    
    //Plata
    
    tabledeinformacion2.row().height(37);
    Label label26 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas[6],estilolabel);
    label26.setAlignment(1);
    tabledeinformacion2.add(label26).width(anchocolumnas);
    
    
    //Los ints de la plata
    
    for(int i=48; i<56; i++){
        
        Label label2 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimas[i],estilolabel);
        label2.setAlignment(1);
        tabledeinformacion2.add(label2).width(anchocolumnas);
        }
    
    //Oro
    
    tabledeinformacion2.row().height(37);
    Label label28 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas[7],estilolabel);
    label28.setAlignment(1);
    tabledeinformacion2.add(label28).width(anchocolumnas);
    
    
    //Los ints de oro
    
    for(int i=56; i<64; i++){
        
        Label label2 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimas[i],estilolabel);
        label2.setAlignment(1);
        tabledeinformacion2.add(label2).width(anchocolumnas);
        }
    
    //Mercurio
    
    tabledeinformacion2.row().height(37);
    Label label30 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas[8],estilolabel);
    label30.setAlignment(1);
    tabledeinformacion2.add(label30).width(anchocolumnas);
    
    
    //Los ints del mercurio
    
    for(int i=64; i<72; i++){
        
        Label label2 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimas[i],estilolabel);
        label2.setAlignment(1);
        tabledeinformacion2.add(label2).width(anchocolumnas);
        }
    
    //Azufre
    
    tabledeinformacion2.row().height(37);
    Label label32 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas[9],estilolabel);
    label32.setAlignment(1);
    tabledeinformacion2.add(label32).width(anchocolumnas);
    
    
    //Los ints del azufre
    
    for(int i=72; i<80; i++){
        
        Label label2 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimas[i],estilolabel);
        label2.setAlignment(1);
        tabledeinformacion2.add(label2).width(anchocolumnas);
        }
    
    
    //La tabla de información 3 (Armas)
    //La tabla de información 4 (Artesanía)
    //La tabla de información 5 (Bienes de lujo)
   
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
    
    tabledescrollpanealmacenes.add(iconoalmacen2);
    tabledescrollpanealmacenes.row();
    tabledescrollpanealmacenes.add(iconoalmacen3);
    tabledescrollpanealmacenes.row();
    tabledescrollpanealmacenes.add(iconoalmacen4);
    tabledescrollpanealmacenes.row();
    tabledescrollpanealmacenes.add(iconoalmacen5);
    tabledescrollpanealmacenes.row();
    tabledescrollpanealmacenes.add(iconoalmacen6);
    tabledescrollpanealmacenes.row();
    tabledescrollpanealmacenes.add(iconoalmacen7);
    tabledescrollpanealmacenes.row();
    tabledescrollpanealmacenes.add(iconoalmacen);
    tabledescrollpanealmacenes.row();
    tabledescrollpanealmacenes.add(iconoalmacen);
    tabledescrollpanealmacenes.row();
    tabledescrollpanealmacenes.add(iconoalmacen);
    tabledescrollpanealmacenes.row();
    tabledescrollpanealmacenes.add(iconoalmacen);
   
    scrollpanealmacenes.size(200, 300);
    scrollpanealmacenes.setOverscroll(false, false);
    tabledealmacenes.add(scrollpanealmacenes);
    
   
    
    //La tabla de órdenes
    
    tabledeordenes.add(espacioenblanco).row().height(20).padTop(20).size(600,40);
    tabledeordenes.add(Ordenesbasicas).row().height(20).padTop(20).size(600,40);
    tabledeordenes.add(Ordenesavanzadas).row().height(20).padTop(20).size(600,40);
    tabledeordenes.add(Ordenesmaestras).row().height(20).padTop(20).size(600,40);
    
    
    
    
 }  

public void act(float deltatime){
	scrollpanealmacenes.act(deltatime);
}
	
}
