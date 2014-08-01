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
	//Artesanía
	Table tabledeinformacion4mes;
	Table tabledeinformacion4ano;
	Table tabledeinformacion4total;
	//Bienes de lujo
	Table tabledeinformacion5mes;
	Table tabledeinformacion5ano;
	Table tabledeinformacion5total;
	
	//Las arrays que clasifican la información por plazos
	Table[] arraytabledeinformacion1;
	Table[] arraytabledeinformacion2;
	Table[] arraytabledeinformacion3;
		
	Table tabledealmacenes;
	Table tabledescrollpanealmacenes;
	Table tabledebotones;
	Table tabledeordenes;
	
	//Instancias de las imágenes (Una para el fondo, el resto para los iconos)	
	Image fondomenualmacen;
	Image iconoalmacen;
	
	//Array de labels que contienen variables
	//Label[] arraydelabelsintsalmacen;
	Array <Label> arraydelabelsintsalmacen;
		
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
	TextButton BotonPlazo;	
	
	//Botones de la table de órdenes
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
	int alturaespacioenblanco = 37;
	
	//La int para cambiar el plazo
    //Plazo (0=mes, 1=año, 2=resto)
  	int plazo;
  	
  	public MenuAlmacen(){
		
	//El array de labels
	arraydelabelsintsalmacen = new Array<Label>(375);
		
    //Creamos las nuevas tables	
	tabledefondo = new Table();
	
	tabledeinformacion = new Table();
	
	//La información del mes
	arraytabledeinformacion1 = new Table[5];
	
	arraytabledeinformacion1[0] = tabledeinformacion1mes =  crearTabla2(6,6,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacencaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenalimentos,Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentosmes).devolverTable()
			.left().top().padLeft(0).padTop(90);
	arraytabledeinformacion1[1] = tabledeinformacion2mes =  crearTabla2(9,5,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas,Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimasmes).devolverTable()
			.left().top().padLeft(0).padTop(90);
	arraytabledeinformacion1[2] = tabledeinformacion3mes =  crearTabla2(8,5,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenarmas,Variablesdejuego.variablesdejuego.almacen.intsdealmacenarmasmes).devolverTable()
			.left().top().padLeft(0).padTop(90);
	arraytabledeinformacion1[3] = tabledeinformacion4mes =  crearTabla2(6,5,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenartesania,Variablesdejuego.variablesdejuego.almacen.intsdealmacenartesaniames).devolverTable()
			.left().top().padLeft(0).padTop(90);
	arraytabledeinformacion1[4] = tabledeinformacion5mes =  crearTabla2(6,5,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenbieneslujo,Variablesdejuego.variablesdejuego.almacen.intsdealmacenbieneslujomes).devolverTable()
			.left().top().padLeft(0).padTop(90);
	
	//La información del año
	arraytabledeinformacion2 = new Table[5];
	arraytabledeinformacion2[0] = tabledeinformacion1ano=  crearTabla2(6,6,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacencaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenalimentos,Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentosano).devolverTable()
			.left().top().padLeft(0).padTop(90);
	arraytabledeinformacion2[1] = tabledeinformacion2ano =   crearTabla2(9,5,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas,Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimasano).devolverTable()
			.left().top().padLeft(0).padTop(90);
	arraytabledeinformacion2[2] = tabledeinformacion3ano =   crearTabla2(8,5,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenarmas,Variablesdejuego.variablesdejuego.almacen.intsdealmacenarmasano).devolverTable()
			.left().top().padLeft(0).padTop(90);
	arraytabledeinformacion2[3] = tabledeinformacion4ano =  crearTabla2(6,5,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenartesania,Variablesdejuego.variablesdejuego.almacen.intsdealmacenartesaniaano).devolverTable()
			.left().top().padLeft(0).padTop(90);
	arraytabledeinformacion2[4] = tabledeinformacion5ano =   crearTabla2(6,5,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenbieneslujo,Variablesdejuego.variablesdejuego.almacen.intsdealmacenbieneslujoano).devolverTable()
			.left().top().padLeft(0).padTop(90);
	
	//La información del total
	arraytabledeinformacion3 = new Table[5];
	arraytabledeinformacion3[0] = tabledeinformacion1total =  crearTabla2(6,6,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacencaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenalimentos,Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentostotal).devolverTable()
			.left().top().padLeft(0).padTop(90);
	arraytabledeinformacion3[1] = tabledeinformacion2total =  crearTabla2(9,5,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenmatprimas,Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimastotal).devolverTable()
			.left().top().padLeft(0).padTop(90);
	arraytabledeinformacion3[2] = tabledeinformacion3total = crearTabla2(8,5,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenarmas,Variablesdejuego.variablesdejuego.almacen.intsdealmacenarmastotal).devolverTable()
			.left().top().padLeft(0).padTop(90);
	arraytabledeinformacion3[3] = tabledeinformacion4total =  crearTabla2(6,5,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenartesania,Variablesdejuego.variablesdejuego.almacen.intsdealmacenartesaniatotal).devolverTable()
			.left().top().padLeft(0).padTop(90);
	arraytabledeinformacion3[4] = tabledeinformacion5total =   crearTabla2(6,5,Variablesdejuego.variablesdejuego.almacen.nombreslabelsalmacennocaducables,
			Variablesdejuego.variablesdejuego.almacen.stringsdealmacenbieneslujo,Variablesdejuego.variablesdejuego.almacen.intsdealmacenbieneslujototal).devolverTable()
			.left().top().padLeft(0).padTop(90);
	
	
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
  	
  	//Creamos el botón para alternar entre Mes\Año\Total
  	BotonPlazo = new TextButton("Mes", estilobotontexto);
  	
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
   	
   	//Añadimos el fondo
   	tabledefondo.add(fondomenualmacen);
   	
   
    //La tabla de botones
    //Los botones de la table de botones
   	tabledebotones.center().top();
   	tabledebotones.add(espacioenblanco);
   	tabledebotones.add(titulo);
   	tabledebotones.add(espacioenblanco);
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
    
    //Las funciones del botón que cambia el plazo
    BotonPlazo.addCaptureListener(new InputListener(){
    	public boolean touchDown(InputEvent event, float x, float y, int pointer, int actor){
			cambiarplazo();
			return true;
		}
    });
    
   
    
    //La tabla de informacion
    
    //Empezamos por la izquierda
   	tabledeinformacion.left();
   	
   	
   	//Los botones de la table de Información
    tabledebotonesinformacion.add(BotonPlazo).padLeft(20);
   	tabledebotonesinformacion.add(Alimentos).padLeft(60);
   	tabledebotonesinformacion.add(MatPrimas).padLeft(20);
   	tabledebotonesinformacion.add(Armas).padLeft(20);
   	tabledebotonesinformacion.add(Artesania).padLeft(20);
   	tabledebotonesinformacion.add(BienesLujo).padLeft(20);
   	tabledebotonesinformacion.row();
   	
   	//Las subtablas de cada tabla de información
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
   	
   	//Las funciones de los botones de la table de información
   	
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
{
BotonPlazo.setText("Mes");
for (int i = 0; i<5; i++){
	arraytabledeinformacion1[i].setVisible(true);
	arraytabledeinformacion2[i].setVisible(false);
	arraytabledeinformacion3[i].setVisible(false);
};
}
//Si el plazo es anual
else if (plazo==1){
BotonPlazo.setText("Año");
for (int i = 0; i<5; i++){
	arraytabledeinformacion1[i].setVisible(false);
	arraytabledeinformacion2[i].setVisible(true);
	arraytabledeinformacion3[i].setVisible(false);
};
}
//Si el plazo es total
else if (plazo==2){
BotonPlazo.setText("Total");
for (int i = 0; i<5; i++){
	arraytabledeinformacion1[i].setVisible(false);
	arraytabledeinformacion2[i].setVisible(false);
	arraytabledeinformacion3[i].setVisible(true);
};
}
};
	

public void act(float deltatime){
	
	scrollpanealmacenes.act(deltatime);
	
	/*
	
	for (int i = 0; i<25; i++){
		arraydelabelsintsalmacen.get(i).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentosmes[i]);
		arraydelabelsintsalmacen.get(i+25).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentosano[i]);
		arraydelabelsintsalmacen.get(i+50).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenalimentostotal[i]);
}
	for (int i = 0; i<32; i++){	
		arraydelabelsintsalmacen.get(i+75).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimasmes[i]);
		arraydelabelsintsalmacen.get(i+107).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimasano[i]);
		arraydelabelsintsalmacen.get(i+139).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenmatprimastotal[i]);
	}
	for (int i = 0; i<28; i++){	
		arraydelabelsintsalmacen.get(i+171).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenarmasmes[i]);
		arraydelabelsintsalmacen.get(i+199).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenarmasano[i]);
		arraydelabelsintsalmacen.get(i+227).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenarmastotal[i]);
	}
	for (int i = 0; i<20; i++){	
		arraydelabelsintsalmacen.get(i+255).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenartesaniames[i]);
		arraydelabelsintsalmacen.get(i+275).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenartesaniaano[i]);
		arraydelabelsintsalmacen.get(i+295).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenartesaniatotal[i]);
	}
	for (int i = 0; i<20; i++){	
		arraydelabelsintsalmacen.get(i+315).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenbieneslujomes[i]);
		arraydelabelsintsalmacen.get(i+335).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenbieneslujoano[i]);
		arraydelabelsintsalmacen.get(i+355).setText(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacenbieneslujototal[i]);
	}
	
	*/
	
}
};
