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
	
	//Arrays de labels que contienen texto
	Label[] arraydelabelsstring;
	
	//Array de labels que contienen variables
	Label[] arraydelabelsvars;
		
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
    
    //El array de labels
    arraydelabelsstring = new Label[64];
   
    //Las tablas
    
    //Empezamos por arriba a la izquierda, y establecemos los márgenes
   	tabledetexto.left().top();
   	tabledetexto.padLeft(20);
   	tabledetexto.padTop(20);
   	
   	//Añadimos el fondo
   	tabledefondo.add(fondomenualmacen);
    
    //Empezamos por la izquierda
   	tabledetexto.left();
   	
    //Los labels    
    
    //La primera tanda es de strings
	for(int i=0; i<10; i++){
    Label label = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacen[i],estilolabel);
    label.setAlignment(1);
    tabledetexto.add(label).width(anchocolumnas);
    if(i==0){
    	tabledetexto.row().height(80);
    }
    }
    
	//Trigo
    tabledetexto.row().height(60);
    Label label = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacen[10],estilolabel);
    label.setAlignment(1);
    tabledetexto.add(label).width(anchocolumnas);
    
    //Las ints del trigo
    for(int i=0; i<8; i++){
    
    Label label2 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacen[i],estilolabel);
    label2.setAlignment(1);
    tabledetexto.add(label2).width(anchocolumnas);
    }
    
    //Fruta
    tabledetexto.row().height(60);
    Label label3 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacen[11],estilolabel);
    label3.setAlignment(1);
    tabledetexto.add(label3).width(anchocolumnas);
    
    //Las ints de la fruta
    for(int i=8; i<16; i++){
    Label label4 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacen[i],estilolabel);
    label4.setAlignment(1);
    tabledetexto.add(label4).width(anchocolumnas);
    }
    
    //Carne
    tabledetexto.row().height(60);
    Label label5 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacen[12],estilolabel);
    label5.setAlignment(1);
    tabledetexto.add(label5).width(anchocolumnas);
    
    //Las ints de la carne
    for(int i=16; i<24; i++){
    Label label6 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacen[i],estilolabel);
    label6.setAlignment(1);
    tabledetexto.add(label6).width(anchocolumnas);
    }
    
    //Carne salada
    
    tabledetexto.row().height(60);
    Label label7 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacen[13],estilolabel);
    label7.setAlignment(1);
    tabledetexto.add(label7).width(anchocolumnas);
   
    
    //Las ints de la carne salada
    
    for(int i=24; i<32; i++){
    Label label8 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacen[i],estilolabel);
    label8.setAlignment(1);
    tabledetexto.add(label8).width(anchocolumnas);
    }
    
    //Pescado
    
    tabledetexto.row().height(60);
    Label label9 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacen[14],estilolabel);
    label9.setAlignment(1);
    tabledetexto.add(label9).width(anchocolumnas);
   
    
    //Las ints del pescado
    
    for(int i=32; i<40; i++){
    Label label10 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacen[i],estilolabel);
    label10.setAlignment(1);
    tabledetexto.add(label10).width(anchocolumnas);
        }
    
    //Miel
    
    tabledetexto.row().height(60);
    Label label11 = new Label(Variablesdejuego.variablesdejuego.almacen.stringsdealmacen[15],estilolabel);
    label11.setAlignment(1);
    tabledetexto.add(label11).width(anchocolumnas);
   
    
    //Las ints de la miel
    
    for(int i=40; i<48; i++){
    Label label12 = new Label(""+Variablesdejuego.variablesdejuego.almacen.intsdealmacen[i],estilolabel);
    label12.setAlignment(1);
    tabledetexto.add(label12).width(anchocolumnas);
    }
    
   
    
 }  

public void act(float deltatime){
	
}
	
}
