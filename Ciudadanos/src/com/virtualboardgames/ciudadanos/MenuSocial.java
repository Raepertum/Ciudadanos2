package com.virtualboardgames.ciudadanos;

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
import com.badlogic.gdx.utils.Array;

public class MenuSocial extends MenuAbstracto{
	
	//Tablas. La table de fondo sólo contiene la imagen de fondo.
	//La table de texto contiene los nombres y la información
	//La table de botones (Si es que no se añaden los botones a la table de texto)
	//contiene los botones
	
	//En this se añade la tabla de fondo, la tabla de información, la tabla de almacenes y la tabla de botones
	//(Que permite seleccionar si mostramos información, almacenes u órdenes)
	Table tabledefondo;
	Table tabledeinformacion;
	Table tabledebotonesinformacion;
	Table tabledetablassocial;
	Stack stacktabledeinformacion;
	Table tablemedia;
	Table tableedadsexo;
	Table tablelealtadmiedo;
	Table tablenivel;
	Table tabledealmacenes;
	Table tabledescrollpanealmacenes;
	Table tabledeordenes;
	Table tabledebotones;
	
	//Array de tables de información (Para almacenar y supongo que luego para actualizar)
	Table[] arraytabledeinformacion;	
	
	//Instancias de las imágenes (Una para el fondo, el resto para los iconos)	
	Image fondomenualmacen;
	Image iconoalmacen;
	
	//Array de labels que contienen variables
	Array <Label> arraydelabelsintssocial;
		
	//Estilos: Para no tener que estar escribiendo desde el principio
	LabelStyle estilolabel;
	TextButtonStyle estilobotontexto;
	ScrollPaneStyle estiloscrollpane;
	
	//Botones de la table de botones
	TextButton Informacion;
	TextButton Almacenes;
	TextButton Ordenes;
	
	//Botones de la table de información
	TextButton BotonTipodeinformacion;	
	
	//Botones de la table de órdenes
	TextButton Ordenesbasicas;
	TextButton Ordenesavanzadas;
	TextButton Ordenesmaestras;
	
	//Scrollpane de la tabla de almacenes
	ScrollPane scrollpanealmacenes;
	
	//Ancho columnas y espacio entre filas
	int anchocolumnasseiscolumnas = 100;
	int anchocolumnascincocolumnas = 120;
	int anchocolumnascuatrocolumnas = 160;
	int espacioentrefilastablainformacion = 37;
	int anchoprimeracolumna = 100;
	int alturaespacioenblanco = 37;
	
	//La int para cambiar el tipo de información
    //Plazo (0=Media, 1=Edad\Sexo, 2=Lealtad\Miedo, 3=Nivel)
  	int tipodeinformacion;
  	
  	public MenuSocial(){
  		
  	//El array de labels
  	arraydelabelsintssocial = new Array<Label>(140);	
		
	//Creamos las nuevas tables	
  		
  	tabledefondo = new Table();
	tabledeinformacion = new Table();
	tabledebotonesinformacion = new Table();
	tabledetablassocial = new Table();
	tablemedia = new Table();
	tableedadsexo = new Table();
	tablelealtadmiedo = new Table();
	tablenivel = new Table();
	tabledealmacenes = new Table();
	tabledescrollpanealmacenes = new Table();
	tabledebotones = new Table();
	tabledeordenes = new Table();
	
	//Tables de información
	
	arraytabledeinformacion = new Table[4];
	arraytabledeinformacion[0] = tablemedia =  new Table();
	arraytabledeinformacion[1] = tableedadsexo =  new Table();
	arraytabledeinformacion[2] = tablelealtadmiedo =  new Table();
	arraytabledeinformacion[3] = tablenivel =  new Table();
	
	//Y los Stacks
	stacktabledeinformacion = new Stack();
	
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
	stacktabledeinformacion.add(tabledebotonesinformacion);
	tabledeinformacion.row();
	tabledeinformacion.add(stacktabledeinformacion);
	stacktabledeinformacion.add(tablemedia);
	stacktabledeinformacion.add(tableedadsexo);
	stacktabledeinformacion.add(tablelealtadmiedo);
	stacktabledeinformacion.add(tablenivel);
	
    //Ocultamos todas las tablas menos la primera
    tablemedia.setVisible(true);
    tableedadsexo.setVisible(false);
    tablelealtadmiedo.setVisible(false);
    tablenivel.setVisible(false);    
    
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
   	Label titulo = new Label(Variablesdejuego.variablesdejuego.social.titulo,estilolabel);
   	
    //Creamos los botones para la table de botones
  	Informacion = new TextButton("Información", estilobotontexto);
  	Almacenes = new TextButton("Almacenes", estilobotontexto);
  	Ordenes = new TextButton("Órdenes", estilobotontexto);
  	
  	//Creamos el botón para alternar entre Mes\Año\Total
  	BotonTipodeinformacion = new TextButton("Media", estilobotontexto);
  	
  	//Creamos los botones para la table de órdenes
  	Ordenesbasicas = new TextButton("Órdenes Básicas", estilobotontexto);
  	Ordenesavanzadas = new TextButton("Órdenes Avanzadas", estilobotontexto);
  	Ordenesmaestras = new TextButton("Órdenes Maestras", estilobotontexto);
  	
  	//Creamos el scroll pane para la tabla de almacenes
  	scrollpanealmacenes = new ScrollPane(tabledescrollpanealmacenes, estiloscrollpane);
  	
    //Las tablas
    
    //Empezamos por arriba a la izquierda, y establecemos los márgenes
   	
    //Table de fondo
    tabledefondo.left().top();
    tabledefondo.padTop(20);
    
    //Table de información
    tabledeinformacion.left().top();
   	tabledeinformacion.padLeft(30);
   	tabledeinformacion.padTop(60);
   	
   	//Table de botones información
    tabledebotonesinformacion.left().top();
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
   	tabledebotones.padTop(20);
   	
   	//Subtablas de información
   	tablemedia.left().top().padLeft(0).padTop(90);
   	tableedadsexo.left().top().padLeft(0).padTop(90);
   	tablelealtadmiedo.left().top().padLeft(0).padTop(90);
   	tablenivel.left().top().padLeft(0).padTop(90);
   	
   	//Añadimos el fondo
   	tabledefondo.add(fondomenualmacen);
   	
   
    //La tabla de botones
    //Los botones de la table de botones
   	tabledebotones.center().top();
   	tabledebotones.add(espacioenblanco);
   	tabledebotones.add(titulo);
   	tabledebotones.row();
   	tabledebotones.add(Informacion);
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
    
    //Las funciones del botón que cambia el tipo de información
    BotonTipodeinformacion.addCaptureListener(new InputListener(){
    	public boolean touchDown(InputEvent event, float x, float y, int pointer, int actor){
			cambiartipodeinformacion();
			return true;
		}
    });
    
   
    
    //La tabla de informacion
    
    //Empezamos por la izquierda
   	tabledeinformacion.left();
   	
   	
   	//Los botones de la table de Información
    tabledebotonesinformacion.add(BotonTipodeinformacion).padLeft(20);
   	tabledebotonesinformacion.row();
   	
    //Las tablas de información Social
   	//Hay que crear la primera fila con los nombres de las columnas 
   	//Y después hay que crear las tablas con los nombres de los tipos de aldeanos
   	
   	
   	escribirFilaTabla(tablemedia, Variablesdejuego.variablesdejuego.social.nombresvaloresmedios,
   			0,5,null,0,0,null, anchocolumnascincocolumnas, anchoprimeracolumna, estilolabel, 
   			espacioentrefilastablainformacion, espacioenblanco);
    
    crearTabla(tablemedia, Variablesdejuego.variablesdejuego.social.nombresclasessociales, 
    		Variablesdejuego.variablesdejuego.social.intsvaloresmedios, 7, 6, arraydelabelsintssocial,
    		anchocolumnascincocolumnas, anchoprimeracolumna, estilolabel, espacioentrefilastablainformacion);
    
   	escribirFilaTabla(tableedadsexo, Variablesdejuego.variablesdejuego.social.nombresedadsexo,
   			0,6,null,0,0,null, anchocolumnasseiscolumnas, anchoprimeracolumna, estilolabel, 
   			espacioentrefilastablainformacion, espacioenblanco);
   	
   	crearTabla(tableedadsexo, Variablesdejuego.variablesdejuego.social.nombresclasessociales, 
    		Variablesdejuego.variablesdejuego.social.intsvaloresedadsexo, 7, 7, arraydelabelsintssocial,
    		anchocolumnasseiscolumnas, anchoprimeracolumna, estilolabel, espacioentrefilastablainformacion);
   
    escribirFilaTabla(tablelealtadmiedo, Variablesdejuego.variablesdejuego.social.nombreslealtadmiedo,
   			0,4,null,0,0,null, anchocolumnascuatrocolumnas, anchoprimeracolumna, estilolabel, 
   			espacioentrefilastablainformacion, espacioenblanco);
    
    crearTabla(tablelealtadmiedo, Variablesdejuego.variablesdejuego.social.nombresclasessociales, 
    		Variablesdejuego.variablesdejuego.social.intsvaloreslealtadmiedo, 7, 5, arraydelabelsintssocial,
    		anchocolumnascuatrocolumnas, anchoprimeracolumna, estilolabel, espacioentrefilastablainformacion);
   
    escribirFilaTabla(tablenivel, Variablesdejuego.variablesdejuego.social.nombresnivel,
   			0,5,null,0,0,null, anchocolumnascincocolumnas, anchoprimeracolumna, estilolabel, 
   			espacioentrefilastablainformacion, espacioenblanco);
    
    crearTabla(tablenivel, Variablesdejuego.variablesdejuego.social.nombresclasessociales, 
    		Variablesdejuego.variablesdejuego.social.intsvaloresnombrenivel, 7, 6, arraydelabelsintssocial,
    		anchocolumnascincocolumnas, anchoprimeracolumna, estilolabel, espacioentrefilastablainformacion);
   
    
   
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

protected void cambiartipodeinformacion(){

//Si el tipo de información es "Nivel" cambiamos a "Media"	
if (tipodeinformacion==3){
tipodeinformacion=0;
}
//De otro modo, avanzamos el tipo de información, de Media a Edad\Sexo, de Edad\Sexo a Lealtad\Miedo y de
//Lealtad\Miedo a Nivel
else{tipodeinformacion++;
};
//Si el tipo de información es media
if (tipodeinformacion==0)
{
BotonTipodeinformacion.setText("Media");
arraytabledeinformacion[0].setVisible(true);
arraytabledeinformacion[1].setVisible(false);
arraytabledeinformacion[2].setVisible(false);
arraytabledeinformacion[3].setVisible(false);

}
//Si el plazo es anual
else if (tipodeinformacion==1){
BotonTipodeinformacion.setText("Edad\\Sexo");
arraytabledeinformacion[0].setVisible(false);
arraytabledeinformacion[1].setVisible(true);
arraytabledeinformacion[2].setVisible(false);
arraytabledeinformacion[3].setVisible(false);
}
//Si el plazo es total
else if (tipodeinformacion==2){
BotonTipodeinformacion.setText("Lealtad\\Miedo");
arraytabledeinformacion[0].setVisible(false);
arraytabledeinformacion[1].setVisible(false);
arraytabledeinformacion[2].setVisible(true);
arraytabledeinformacion[3].setVisible(false);
}
else if (tipodeinformacion==3){
BotonTipodeinformacion.setText("Nivel");
arraytabledeinformacion[0].setVisible(false);
arraytabledeinformacion[1].setVisible(false);
arraytabledeinformacion[2].setVisible(false);
arraytabledeinformacion[3].setVisible(true);
}
};
	

public void act(float deltatime){
	scrollpanealmacenes.act(deltatime);
	for (int i = 0; i<25; i++){
		arraydelabelsintssocial.get(i).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentosmes[i]);
		arraydelabelsintssocial.get(i+25).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentosano[i]);
		arraydelabelsintssocial.get(i+50).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentostotal[i]);
}
	for (int i = 0; i<32; i++){	
		arraydelabelsintssocial.get(i+75).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimasmes[i]);
		arraydelabelsintssocial.get(i+107).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimasano[i]);
		arraydelabelsintssocial.get(i+139).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimastotal[i]);
	}
	for (int i = 0; i<28; i++){	
		arraydelabelsintssocial.get(i+171).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenarmasmes[i]);
		arraydelabelsintssocial.get(i+199).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenarmasano[i]);
		arraydelabelsintssocial.get(i+227).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenarmastotal[i]);
	}
	for (int i = 0; i<20; i++){	
		arraydelabelsintssocial.get(i+255).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenartesaniames[i]);
		arraydelabelsintssocial.get(i+275).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenartesaniaano[i]);
		arraydelabelsintssocial.get(i+295).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenartesaniatotal[i]);
	}
	for (int i = 0; i<20; i++){	
		arraydelabelsintssocial.get(i+315).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenbieneslujomes[i]);
		arraydelabelsintssocial.get(i+335).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenbieneslujoano[i]);
		arraydelabelsintssocial.get(i+355).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenbieneslujototal[i]);
	}
	
}
};