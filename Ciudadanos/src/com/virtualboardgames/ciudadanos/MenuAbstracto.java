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

public void crearTablaMesAnoResto(Table tablemes, Table tableano, Table tabletotal,
		Label espacioenblanco, int alturaespacioenblanco, String[] nombrecolumnas,
		int rangoinferiornom, int rangosuperiornom, int[] intsdelatablames,
		int[]intsdelatablaano, int[] intsdelatablatotal, Label[] arraydealmacenamientodeints, int anchocolumnas,
		int anchoprimeracolumna, LabelStyle estilolabel, int espacioentrefilas,
		String[] nombredelasfilas, int numerodefilas, int numerodecolumnas)
		{
	//MES
	tablemes.row();
	tablemes.add(espacioenblanco).height(alturaespacioenblanco);
	escribirFilaTabla(tablemes, nombrecolumnas, rangoinferiornom, rangosuperiornom,
	    null,0,0, arraydealmacenamientodeints, anchocolumnas,anchoprimeracolumna, estilolabel,espacioentrefilas);
	crearTabla(tablemes, nombredelasfilas, intsdelatablames, numerodefilas, numerodecolumnas,
   			arraydealmacenamientodeints, anchocolumnas, anchoprimeracolumna,
   			estilolabel,espacioentrefilas);
	//AÑO
	tableano.row();
	tableano.add(espacioenblanco).height(alturaespacioenblanco);
	escribirFilaTabla(tableano, nombrecolumnas, rangoinferiornom+rangosuperiornom, 
			rangosuperiornom*2, null,0,0, arraydealmacenamientodeints, anchocolumnas,
			anchoprimeracolumna, estilolabel,espacioentrefilas);
	crearTabla(tableano, nombredelasfilas, intsdelatablaano, numerodefilas, numerodecolumnas,
   			arraydealmacenamientodeints, anchocolumnas, anchoprimeracolumna,
   			estilolabel,espacioentrefilas);
	//TOTAL
	tabletotal.row();
	tabletotal.add(espacioenblanco).height(alturaespacioenblanco);
	escribirFilaTabla(tabletotal, nombrecolumnas, rangoinferiornom+2*rangosuperiornom, 
			rangosuperiornom*3, null,0,0, arraydealmacenamientodeints, anchocolumnas,
			anchoprimeracolumna, estilolabel, espacioentrefilas);
	crearTabla(tabletotal, nombredelasfilas, intsdelatablatotal, numerodefilas, numerodecolumnas,
   			arraydealmacenamientodeints, anchocolumnas, anchoprimeracolumna,
   			estilolabel,espacioentrefilas);
	}




};
	
	

	
	

