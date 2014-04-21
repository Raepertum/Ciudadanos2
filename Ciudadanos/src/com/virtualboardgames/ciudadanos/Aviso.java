package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class Aviso extends Table {

Label textomensajeconfirmacion;
TextButton botonok;
Stage contexto;
	


public Aviso(String textodeconfirmacion, Stage contexto){

	textomensajeconfirmacion = new Label(textodeconfirmacion, Texturasysonidos.texturasysonidos.estilosyactores.estilolabeldefault);
	botonok = new TextButton("OK", Texturasysonidos.texturasysonidos.estilosyactores.estilobotondefault);
	
	this.setPosition(500, 200);
	this.add(textomensajeconfirmacion);
	this.row();
	this.add(botonok);
	contexto.addActor(this);
}
}