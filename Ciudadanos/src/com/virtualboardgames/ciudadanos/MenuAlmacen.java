package com.virtualboardgames.ciudadanos;

import java.util.List;

import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
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
	
	//Tablas. La table de fondo s�lo contiene la imagen de fondo.
	//La table de texto contiene los nombres y la informaci�n
	//La table de botones (Si es que no se a�aden los botones a la table de texto)
	//contiene los botones
	
	Table tabledefondo;
	Table tabledeinformacion;
	//Para los botones de la table de informacion
	Table tabledebotonesinformacion;
	//Stack para a�adir las sub-tablas
	Stack stacktabledeinformacion;
	Stack stacktabledeinformacion1;
	Stack stacktabledeinformacion2;
	Stack stacktabledeinformacion3;
	Stack stacktabledeinformacion4;
	Stack stacktabledeinformacion5;
	//Alimentos
	Table tabledeinformacion1mes;
	Table tabledeinformacion1ano;
	Table tabledeinformacion1total;
	//Materias primas
	Table tabledeinformacion2mes;
	Table tabledeinformacion2ano;
	Table tabledeinformacion2total;
	//Armas
	Table tabledeinformacion3mes;
	Table tabledeinformacion3ano;
	Table tabledeinformacion3total;
	//Artesan�a
	Table tabledeinformacion4mes;
	Table tabledeinformacion4ano;
	Table tabledeinformacion4total;
	//Bienes de lujo
	Table tabledeinformacion5mes;
	Table tabledeinformacion5ano;
	Table tabledeinformacion5total;
	
	//Y las arrays que contendr�n las tablas de arriba, para la funcionalidad
	//del bot�n mes/a�o/total
	Table[] arraytabledeinformacion1;
	Table[] arraytabledeinformacion2;
	Table[] arraytabledeinformacion3;
	Table[] arraytabledeinformacion4;
	Table[] arraytabledeinformacion5;
	
	Table tabledealmacenes;
	Table tabledescrollpanealmacenes;
	
	Table tabledebotones;
	
	Table tabledeordenes;
	
	//Instancias de las im�genes (Una para el fondo, el resto para los iconos)	
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
	
	//Botones de la table de informaci�n
	TextButton Alimentos;
	TextButton MatPrimas;
	TextButton Armas;
	TextButton Artesania;
	TextButton BienesLujo;
	TextButton BotonPlazo;	
	
	//Botones de la table de �rdenes
	TextButton Ordenesbasicas;
	TextButton Ordenesavanzadas;
	TextButton Ordenesmaestras;
	
	//Scrollpane de la tabla de almacenes
	ScrollPane scrollpanealmacenes;
	
	//Ancho columnas y espacio entre filas
	int anchocolumnassubtabla1 = 120;
	int anchocolumnassubtabla2 = 160;
	int espacioentrefilastablainformacion = 37;
	int anchoprimeracolumna = 100;
	
	//La int para cambiar el plazo
	int plazo;
	
	public MenuAlmacen(){
		
	
	//Creamos las nuevas tables	
	tabledefondo = new Table();
	
	tabledeinformacion = new Table();
	
	arraytabledeinformacion1 = new Table[3];
	arraytabledeinformacion1[0] = tabledeinformacion1mes =  new Table();
	arraytabledeinformacion1[1] = tabledeinformacion1ano =  new Table();
	arraytabledeinformacion1[2] = tabledeinformacion1total =  new Table();
	arraytabledeinformacion2 = new Table[3];
	arraytabledeinformacion2[0] = tabledeinformacion2mes =  new Table();
	arraytabledeinformacion2[1] = tabledeinformacion2ano =  new Table();
	arraytabledeinformacion2[2] = tabledeinformacion2total =  new Table();
	arraytabledeinformacion3 = new Table[3];
	arraytabledeinformacion3[0] = tabledeinformacion3mes =  new Table();
	arraytabledeinformacion3[1] = tabledeinformacion3ano =  new Table();
	arraytabledeinformacion3[2] = tabledeinformacion3total =  new Table();
	arraytabledeinformacion4 = new Table[3];
	arraytabledeinformacion4[0] = tabledeinformacion4mes =  new Table();
	arraytabledeinformacion4[1] = tabledeinformacion4ano =  new Table();
	arraytabledeinformacion4[2] = tabledeinformacion4total =  new Table();
	arraytabledeinformacion5 = new Table[3];
	arraytabledeinformacion5[0] = tabledeinformacion5mes =  new Table();
	arraytabledeinformacion5[1] = tabledeinformacion5ano =  new Table();
	arraytabledeinformacion5[2] = tabledeinformacion5total =  new Table();
	tabledebotonesinformacion = new Table();
	
	tabledealmacenes = new Table();
	tabledescrollpanealmacenes = new Table();
	
	tabledebotones = new Table();
	
	tabledeordenes = new Table();
		
	//Y los Stacks
	stacktabledeinformacion = new Stack();
	stacktabledeinformacion1 = new Stack();
	stacktabledeinformacion2 = new Stack();
	stacktabledeinformacion3 = new Stack();
	stacktabledeinformacion4 = new Stack();
	stacktabledeinformacion5 = new Stack();
	
	//Posicionamos y definimos el tama�o del stack primario
	this.setPosition(30,30);
	this.setSize(740, 540);
	
	//A�adimos las tables en el orden correcto
	this.add(tabledefondo);
	this.add(tabledeinformacion);
	this.add(tabledealmacenes);
	this.add(tabledebotones);
	this.add(tabledeordenes);
	
	//A�adimos las sub-tablas en el orden correcto
	tabledeinformacion.add(stacktabledeinformacion);
	stacktabledeinformacion.add(tabledebotonesinformacion);
   	stacktabledeinformacion.add(stacktabledeinformacion1);
    stacktabledeinformacion.add(stacktabledeinformacion2);
    stacktabledeinformacion.add(stacktabledeinformacion3);
    stacktabledeinformacion.add(stacktabledeinformacion4);
    stacktabledeinformacion.add(stacktabledeinformacion5);
    
    //Ocultamos todas los stacks menos el primero
    stacktabledeinformacion1.setVisible(true);
    stacktabledeinformacion2.setVisible(false);
    stacktabledeinformacion3.setVisible(false);
    stacktabledeinformacion4.setVisible(false);
    stacktabledeinformacion5.setVisible(false);
    
    //Ocultamos todas las tablas menos la primera
    tabledeinformacion1mes.setVisible(true);
    tabledeinformacion1ano.setVisible(false);
    tabledeinformacion1total.setVisible(false);
    tabledeinformacion2mes.setVisible(true);
    tabledeinformacion2ano.setVisible(false);
    tabledeinformacion2total.setVisible(false);
    tabledeinformacion3mes.setVisible(true);
    tabledeinformacion3ano.setVisible(false);
    tabledeinformacion3total.setVisible(false);
    tabledeinformacion4mes.setVisible(true);
    tabledeinformacion4ano.setVisible(false);
    tabledeinformacion4total.setVisible(false);
    tabledeinformacion5mes.setVisible(true);
    tabledeinformacion5ano.setVisible(false);
    tabledeinformacion5total.setVisible(false);
    
    
	//Vamos instanciando y a�adiendo los objetos (Puede que m�s tarde, por razones de rendimiento
    //se pasen todos a la clase de texturasysonidos)
	
	//El fondo
	fondomenualmacen = new Image(Texturasysonidos.texturasysonidos.estilosyactores.fondoMenuAlmacen);
	
    //Im�genes que se ponen dentro de los men�s
    iconoalmacen = new Image(Texturasysonidos.texturasysonidos.estilosyactores.edificioalmacenmenu);
    
    //Los estilos
    estilolabel = Texturasysonidos.texturasysonidos.estilosyactores.estilolabeldefault;
    estilobotontexto = Texturasysonidos.texturasysonidos.estilosyactores.estilobotondefault;
    estiloscrollpane = Texturasysonidos.texturasysonidos.estilosyactores.estiloscrollpanedefault;
    
    //Para dejar espacios
   	Label espacioenblanco = new Label(Variablesdejuego.variablesdejuego.espacioenblanco,estilolabel);
   	
    //El t�tulo
   	Label titulo = new Label(Variablesdejuego.variablesdejuego.almacen.titulo,estilolabel);
   	
    //Creamos los botones para la table de botones
  	Informacion = new TextButton("Informaci�n", estilobotontexto);
  	Almacenes = new TextButton("Almacenes", estilobotontexto);
  	Ordenes = new TextButton("�rdenes", estilobotontexto);
  	
  	//Creamos el bot�n para alternar entre Mes\A�o\Total
  	BotonPlazo = new TextButton("Mes", estilobotontexto);
  	
  	//Plazo (0=mes, 1=a�o, 2=resto)
  	int plazo = 0;
  	
  	//Creamos los botones para la table de informacion
  	Alimentos = new TextButton("Alimentos", estilobotontexto);
	MatPrimas = new TextButton("Materias Primas", estilobotontexto);
	Armas = new TextButton("Armas", estilobotontexto);
	Artesania = new TextButton("Artesan�a", estilobotontexto);
	BienesLujo = new TextButton("Bienes de lujo", estilobotontexto);
    
  	//Creamos los botones para la table de �rdenes
  	Ordenesbasicas = new TextButton("�rdenes B�sicas", estilobotontexto);
  	Ordenesavanzadas = new TextButton("�rdenes Avanzadas", estilobotontexto);
  	Ordenesmaestras = new TextButton("�rdenes Maestras", estilobotontexto);
  	
  	//Creamos el scroll pane para la tabla de almacenes
  	scrollpanealmacenes = new ScrollPane(tabledescrollpanealmacenes, estiloscrollpane);
  	
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
   	
   	//Table de botones informaci�n
    tabledebotonesinformacion.left().top();
   	tabledebotonesinformacion.padTop(65);
   	
   	//Tabla de almacenes
   	tabledealmacenes.left().top();
   	tabledealmacenes.padLeft(20);
   	tabledealmacenes.padTop(20);
   	tabledealmacenes.setVisible(false);
   	
   	//Tabla de �rdenes
   	tabledeordenes.center();
   	tabledeordenes.padLeft(20);
   	tabledeordenes.padTop(20);
   	tabledeordenes.setVisible(false);
   	
   	//Tabla de t�tulo y botones
   	tabledebotones.left().top();
   	tabledebotones.padLeft(60);
   	tabledebotones.padTop(60);
   	
   	//Subtablas de informaci�n
   	tabledeinformacion1mes.left().top().padLeft(0).padTop(90);
   	tabledeinformacion1ano.left().top().padLeft(0).padTop(90);
   	tabledeinformacion1total.left().top().padLeft(0).padTop(90);
   	tabledeinformacion2mes.left().top().padLeft(0).padTop(90);
   	tabledeinformacion2ano.left().top().padLeft(0).padTop(90);
   	tabledeinformacion2total.left().top().padLeft(0).padTop(90);
   	tabledeinformacion3mes.left().top().padLeft(0).padTop(90);
   	tabledeinformacion3ano.left().top().padLeft(0).padTop(90);
   	tabledeinformacion3total.left().top().padLeft(0).padTop(90);
   	tabledeinformacion4mes.left().top().padLeft(0).padTop(90);
   	tabledeinformacion4ano.left().top().padLeft(0).padTop(90);
   	tabledeinformacion4total.left().top().padLeft(0).padTop(90);
   	tabledeinformacion5mes.left().top().padLeft(0).padTop(90);
   	tabledeinformacion5ano.left().top().padLeft(0).padTop(90);
   	tabledeinformacion5total.left().top().padLeft(0).padTop(90);
   	 	
   	//A�adimos el fondo
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
    
    //Las funciones del bot�n que cambia el plazo
    BotonPlazo.addCaptureListener(new InputListener(){
    	public boolean touchDown(InputEvent event, float x, float y, int pointer, int actor){
			cambiarplazo();
			return true;
		}
    });
    
   
    
    //La tabla de informacion
    
    //Empezamos por la izquierda
   	tabledeinformacion.left();
   	
   	//Los botones de la table de Informaci�n
   	tabledebotonesinformacion.left();
   	tabledebotonesinformacion.add(BotonPlazo).padLeft(20);
   	tabledebotonesinformacion.add(Alimentos).padLeft(60);
   	tabledebotonesinformacion.add(MatPrimas).padLeft(20);
   	tabledebotonesinformacion.add(Armas).padLeft(20);
   	tabledebotonesinformacion.add(Artesania).padLeft(20);
   	tabledebotonesinformacion.add(BienesLujo).padLeft(20);
   	tabledebotonesinformacion.row();
   	
   	//Las subtablas de cada tabla de informaci�n
   	stacktabledeinformacion1.add(tabledeinformacion1mes);
   	stacktabledeinformacion1.add(tabledeinformacion1ano);
   	stacktabledeinformacion1.add(tabledeinformacion1total);
   	stacktabledeinformacion2.add(tabledeinformacion2mes);
   	stacktabledeinformacion2.add(tabledeinformacion2ano);
   	stacktabledeinformacion2.add(tabledeinformacion2total);
   	stacktabledeinformacion3.add(tabledeinformacion3mes);
   	stacktabledeinformacion3.add(tabledeinformacion3ano);
   	stacktabledeinformacion3.add(tabledeinformacion3total);
   	stacktabledeinformacion4.add(tabledeinformacion4mes);
   	stacktabledeinformacion4.add(tabledeinformacion4ano);
   	stacktabledeinformacion4.add(tabledeinformacion4total);
   	stacktabledeinformacion5.add(tabledeinformacion5mes);
   	stacktabledeinformacion5.add(tabledeinformacion5ano);
   	stacktabledeinformacion5.add(tabledeinformacion5total);
   	
   	//Las funciones de los botones de la table de informaci�n
   	
   	Alimentos.addListener(new ClickListener() {
        public void clicked(InputEvent event, float x, float y) {
            stacktabledeinformacion1.setVisible(true);
            stacktabledeinformacion2.setVisible(false); 
            stacktabledeinformacion3.setVisible(false); 
            stacktabledeinformacion4.setVisible(false); 
            stacktabledeinformacion5.setVisible(false); 
        };
  		});
    MatPrimas.addListener(new ClickListener(){
    	public void clicked(InputEvent event, float x, float y){
            stacktabledeinformacion1.setVisible(false);
            stacktabledeinformacion2.setVisible(true); 
            stacktabledeinformacion3.setVisible(false); 
            stacktabledeinformacion4.setVisible(false); 
            stacktabledeinformacion5.setVisible(false); 
    	}
    });
    Armas.addListener(new ClickListener(){
    	public void clicked(InputEvent event, float x, float y){
            stacktabledeinformacion1.setVisible(false);
            stacktabledeinformacion2.setVisible(false); 
            stacktabledeinformacion3.setVisible(true); 
            stacktabledeinformacion4.setVisible(false); 
            stacktabledeinformacion5.setVisible(false);  
    	}
    });
    Artesania.addListener(new ClickListener(){
    	public void clicked(InputEvent event, float x, float y){
            stacktabledeinformacion1.setVisible(false);
            stacktabledeinformacion2.setVisible(false); 
            stacktabledeinformacion3.setVisible(false); 
            stacktabledeinformacion4.setVisible(true); 
            stacktabledeinformacion5.setVisible(false); 
    	}
    });
    BienesLujo.addListener(new ClickListener(){
    	public void clicked(InputEvent event, float x, float y){
            stacktabledeinformacion1.setVisible(false);
            stacktabledeinformacion2.setVisible(false); 
            stacktabledeinformacion3.setVisible(false); 
            stacktabledeinformacion4.setVisible(false); 
            stacktabledeinformacion5.setVisible(true); 
    	}
    });
    
   	
    //Los labels de la tabla de informaci�n   
    
    //Las tablas de informaci�n de Alimentos
    //MES
    tabledeinformacion1mes.row();
    tabledeinformacion1mes.add(espacioenblanco).height(37);
    //Nombres de las columnas
   	escribirFilaTabla(tabledeinformacion1mes, Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacencaducables,
   			0,5,null,0,0,null,anchocolumnassubtabla1,anchoprimeracolumna, estilolabel, 
   			espacioentrefilastablainformacion);
   	//Los alimentos
   	crearTabla(tabledeinformacion1mes, Variablesdejuego.variablesdejuego.almacen.stringsdealmacenalimentos,
   			Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentos, 6, 6,
   			null, anchocolumnassubtabla1, anchoprimeracolumna,estilolabel, 
   			espacioentrefilastablainformacion);
   	//A�O
    tabledeinformacion1ano.row();
    tabledeinformacion1ano.add(espacioenblanco).height(37);
    //Nombres de las columnas
   	escribirFilaTabla(tabledeinformacion1ano, Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacencaducables,
   			5,10,null,0,0,null,anchocolumnassubtabla1,anchoprimeracolumna, estilolabel, 
   			espacioentrefilastablainformacion);
   	//Los alimentos
   	crearTabla(tabledeinformacion1ano, Variablesdejuego.variablesdejuego.almacen.stringsdealmacenalimentos,
   			Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentos, 6, 6,
   			null, anchocolumnassubtabla1, anchoprimeracolumna,estilolabel, 
   			espacioentrefilastablainformacion);
   	//TOTAL
    tabledeinformacion1total.row();
    tabledeinformacion1total.add(espacioenblanco).height(37);
    //Nombres de las columnas
   	escribirFilaTabla(tabledeinformacion1total, Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacencaducables,
   			10,15,null,0,0,null,anchocolumnassubtabla1,anchoprimeracolumna, estilolabel, 
   			espacioentrefilastablainformacion);
   	//Los alimentos
   	crearTabla(tabledeinformacion1total, Variablesdejuego.variablesdejuego.almacen.stringsdealmacenalimentos,
   			Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentos, 6, 6,
   			null, anchocolumnassubtabla1, anchoprimeracolumna,estilolabel, 
   			espacioentrefilastablainformacion);
   	
    
    //Las tablas de informaci�n de Materias Primas
    //MES
    tabledeinformacion2mes.row();
   	tabledeinformacion2mes.add(espacioenblanco).height(37);
   	
   	//Nombres de las columnas
   	
   	escribirFilaTabla(tabledeinformacion2mes, Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
   			0,4,null,0,0,null,anchocolumnassubtabla2,anchoprimeracolumna,estilolabel, 
   			espacioentrefilastablainformacion);
   	
   	//Las materias primas
   	crearTabla(tabledeinformacion2mes, Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas,
   			Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimas, 10, 6,
   			null, anchocolumnassubtabla1, anchoprimeracolumna,estilolabel, 
   			espacioentrefilastablainformacion);
    //A�O
   	tabledeinformacion2ano.row();
   	tabledeinformacion2ano.add(espacioenblanco).height(37);
   	
   	//Nombres de las columnas
   	
   	escribirFilaTabla(tabledeinformacion2ano, Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
   			0,4,null,0,0,null,anchocolumnassubtabla2,anchoprimeracolumna,estilolabel, 
   			espacioentrefilastablainformacion);
   	
   	//Las materias primas
   	crearTabla(tabledeinformacion2ano, Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas,
   			Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimas, 10, 6,
   			null, anchocolumnassubtabla1, anchoprimeracolumna,estilolabel, 
   			espacioentrefilastablainformacion);
   	//TOTAL
   	tabledeinformacion2total.row();
   	tabledeinformacion2total.add(espacioenblanco).height(37);
   	
   	//Nombres de las columnas
   	
   	escribirFilaTabla(tabledeinformacion2total, Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
   			0,4,null,0,0,null,anchocolumnassubtabla2,anchoprimeracolumna,estilolabel, 
   			espacioentrefilastablainformacion);
   	
   	//Las materias primas
   	crearTabla(tabledeinformacion2total, Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas,
   			Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimas, 10, 6,
   			null, anchocolumnassubtabla1, anchoprimeracolumna,estilolabel, 
   			espacioentrefilastablainformacion);
   	
   	//Las tablas de informaci�n de Armas
   	//MES
    
    //Las tablas de informaci�n de Artesan�a
    //Las tablas de informaci�n de Bienes de lujo
    
   
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
    
   
    
    //La tabla de �rdenes
    
    tabledeordenes.add(espacioenblanco).row().height(20).padTop(20).size(600,40);
    tabledeordenes.add(Ordenesbasicas).row().height(20).padTop(20).size(600,40);
    tabledeordenes.add(Ordenesavanzadas).row().height(20).padTop(20).size(600,40);
    tabledeordenes.add(Ordenesmaestras).row().height(20).padTop(20).size(600,40);
    
    
    
    
 }  

protected void cambiarplazo(){

//Si el plazo es el total, cambiamos a plazo mensual	
if (plazo==2){
plazo=0;
}
//De otro modo, avanzamos el plazo, de mensual a anual, de anual a total
else{plazo++;
};
//Si el plazo es mensual
if (plazo==0)
{BotonPlazo.setText("Mes");}
//Si el plazo es anual
else if (plazo==1){BotonPlazo.setText("A�o");}
//Si el plazo es total
else if (plazo==2){BotonPlazo.setText("Total");};
}
	

public void act(float deltatime){
	scrollpanealmacenes.act(deltatime);
}
	
}
