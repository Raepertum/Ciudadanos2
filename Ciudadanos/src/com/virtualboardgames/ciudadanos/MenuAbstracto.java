package com.virtualboardgames.ciudadanos;


import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Stack;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

public class MenuAbstracto extends Stack{


public void escribirFilaTabla(Table tableenlaquepongolafila, String[] primeraArray, 
		int rangoinferiorprimeraarray, int rangosuperiorprimerarray, 
		int[] segundaArray, int rangoinferiorsegundaarray, 
		int rangosuperiorsegundaarray, Label[] arraydeints, int anchocolumnas,
		LabelStyle estilolabel, int espacioentrefilas){

	//Los labels de texto (Las strings)
	if(primeraArray!=null){
		for (int i=rangoinferiorprimeraarray; i<rangosuperiorprimerarray; i++){
			Label label = new Label(primeraArray[i], estilolabel);
			label.setAlignment(1);
		    tableenlaquepongolafila.add(label).width(anchocolumnas);
		}}
	if(segundaArray!=null){
		for (int i=rangoinferiorsegundaarray; i<rangosuperiorsegundaarray; i++){
			Label label = new Label(""+segundaArray[i], estilolabel);
			label.setAlignment(1);
		    tableenlaquepongolafila.add(label).width(anchocolumnas);
	}}
	tableenlaquepongolafila.row().height(espacioentrefilas);
	
}

};
	
	

	
	

