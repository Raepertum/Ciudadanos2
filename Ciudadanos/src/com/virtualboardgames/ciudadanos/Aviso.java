package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Stack;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class Aviso extends Table {


Label textomensajeconfirmacion;
TextButton botonok;
Image fondo;
Stage contexto;
Stack stackdefondolabelybotones;
Table tabledefondo;
Table tabledebotonesylabel;

int altodellabel;
int altodelboton;

public Aviso(String textodeconfirmacion){

	//Inicialización de la tabla
	tabledefondo = new Table();
	tabledebotonesylabel = new Table();
	
	this.setPosition(30,30);
	this.setSize(740, 540);
	
	//
	stackdefondolabelybotones = new Stack();
	this.add(stackdefondolabelybotones);
	stackdefondolabelybotones.add(tabledefondo);
    stackdefondolabelybotones.add(tabledebotonesylabel);
	
	textomensajeconfirmacion = new Label(textodeconfirmacion, Texturasysonidos.texturasysonidos.estilosyactores.estilolabeldefault);
	
	//El botón
	botonok = new TextButton("OK", Texturasysonidos.texturasysonidos.estilosyactores.estilobotondefault);
	
	botonok.addListener(new InputListener(){
		
		public boolean touchDown(InputEvent event, float x, float y, int pointer, int actor){
		    suprimiraviso();
			return true;
	}
		
	});
	
	
	fondo = new Image(Texturasysonidos.texturasysonidos.estilosyactores.fondoMenuAlmacen);
	
	
	tabledebotonesylabel.add(textomensajeconfirmacion);
	tabledebotonesylabel.row().padTop(20);
	tabledebotonesylabel.add(botonok);
	
	tabledefondo.row().height(tabledebotonesylabel.getPrefHeight()+5).width(tabledebotonesylabel.getPrefWidth()+5);
	tabledefondo.add(fondo);
	
    contexto.addActor(this);
}

private void suprimiraviso(){
	this.remove();	
}


}