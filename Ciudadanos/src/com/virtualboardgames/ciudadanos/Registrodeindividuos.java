package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Array;

public class Registrodeindividuos {

public static final Registrodeindividuos registrodeindividuos = new Registrodeindividuos();
	
Array<Individuo> arraydeindividuos;
	
private Registrodeindividuos(){
	
	arraydeindividuos = new Array<Individuo>();
	
};

public void crearnuevoindividuo(boolean sexo, int edad, int lealtad, int miedo, 
		String profesion, int nivel){
	Individuo individuo = new Individuo(sexo,edad,lealtad,miedo,profesion,nivel);
	arraydeindividuos.add(individuo);
	Variablesdejuego.variablesdejuego.social.anadiraloscontadores(individuo);
	
};


}
