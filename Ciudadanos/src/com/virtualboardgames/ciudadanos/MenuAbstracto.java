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
		int anchoprimeracolumna, LabelStyle estilolabel, int espacioentrefilas){
   boolean simple = true;
	//Los labels de texto (Las strings)
	if(primeraArray!=null){
		simple=false;
		//La primera
		Label label = new Label(primeraArray[rangoinferiorprimeraarray], estilolabel);
		label.setAlignment(1);
	    tableenlaquepongolafila.add(label).width(anchoprimeracolumna);
		for (int i=rangoinferiorprimeraarray+1; i<rangosuperiorprimerarray; i++){
			Label label2 = new Label(primeraArray[i], estilolabel);
			label2.setAlignment(1);
		    tableenlaquepongolafila.add(label2).width(anchocolumnas);
		}}
	if(segundaArray!=null){
		if(simple==true){
		Label label = new Label(primeraArray[rangoinferiorsegundaarray], estilolabel);
		label.setAlignment(1);
	    tableenlaquepongolafila.add(label).width(anchoprimeracolumna);	
		}
		for (int i=rangoinferiorsegundaarray+1; i<rangosuperiorsegundaarray; i++){
			Label label = new Label(""+segundaArray[i], estilolabel);
			label.setAlignment(1);
		    tableenlaquepongolafila.add(label).width(anchocolumnas);
	}}
	tableenlaquepongolafila.row().height(espacioentrefilas);
	
}


public void crearTabla(Table tableenlaquepongolafila, String primeraarray[],
		int segundaarray[],	int numerodefilas, int numerodecolumnas,
		Label[] arraydeints, int anchocolumnas, int anchoprimeracolumna, LabelStyle estilolabel, 
		int espacioentrefilas){
	
	for(int n=0;n<numerodefilas;n++){
	escribirFilaTabla(tableenlaquepongolafila, primeraarray, n,  
			n+1, segundaarray, n*numerodecolumnas, 
			(n+1)*(numerodecolumnas), arraydeints, anchocolumnas,anchoprimeracolumna, 
			estilolabel, espacioentrefilas);
	
};
}




};
	
	

	
	

