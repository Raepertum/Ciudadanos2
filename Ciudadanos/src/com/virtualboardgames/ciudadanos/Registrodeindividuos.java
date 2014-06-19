package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Array;

public class Registrodeindividuos {

public static final Registrodeindividuos registrodeindividuos = new Registrodeindividuos();
	
Array<Individuo> arraydeindividuos;
	
private Registrodeindividuos(){
	
	arraydeindividuos = new Array<Individuo>();
	
};


public void anadirindividuos(Individuo individuo){
	arraydeindividuos.add(individuo);
}


public void crearnuevoindividuo(Familia familia,boolean sexo, int edad, int lealtad, int miedo, 
		String profesion, int nivel){
	Individuo individuo = new Individuo(sexo,edad,lealtad,miedo,profesion,nivel);
	arraydeindividuos.add(individuo);
	familia.anadiralafamilia(individuo);
	Variablesdejuego.variablesdejuego.social.anadiraloscontadores(individuo);
	
};


}
