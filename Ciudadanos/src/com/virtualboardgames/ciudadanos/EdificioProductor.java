package com.virtualboardgames.ciudadanos;
import com.badlogic.gdx.utils.Array;
import com.virtualboardgames.ciudadanos.Edificio;
import com.virtualboardgames.ciudadanos.Familia;


public class EdificioProductor {
	
	Array <Familia> familiasquehabitaneledificio;

	//Formados por un edificio y por las familias que viven en ellos
	
	public EdificioProductor(Array <Familia> familiasquehabitaneledificio, Edificio edificio){
		
		this.familiasquehabitaneledificio=familiasquehabitaneledificio;
		
	};
	
	public void anadirnuevafamilia(Familia familia){
	
		familiasquehabitaneledificio.add(familia);
		
	}
	
	public void eliminarfamilia(Familia familia){
	
		//No s� si false es el valor correcto
		familiasquehabitaneledificio.removeValue(familia, false);
	}
	

	
}
