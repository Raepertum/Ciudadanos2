package com.virtualboardgames.ciudadanos;

public class Variablesdejuego {

public static final Variablesdejuego variablesdejuego = new Variablesdejuego();	
	
//Tipos de variables provisionales. En muchos casos, lo m�s sensato ser� crear vectores
	



Almacen almacen = new Almacen();

public class Almacen{

	//Variables para almacen
	//PM: Producci�n mensual
	//GM: Gasto mensual
	//NM: Neto mensual
	//PA: Producci�n anual
	//GA: Gasto anual
	//NA: Neto anual
	//RE: Reservas
	//CP: Pr�xima caducidad
	
	
	
//ALMAC�N
String [] stringsdealmacen;
int[] intsdealmacen;
	

//Trigo en almac�n (8 cada una: PM, GM, NM, PA, GA, NA, RE, CP)
//Fruta en almac�n
//Carne en almac�n
//Carne salada en almac�n
//Pescado en almac�n
//Miel en almac�n


public Almacen(){
	stringsdealmacen = new String[16];
	stringsdealmacen[0] = "Almac�n";
	stringsdealmacen[1] = "";
	stringsdealmacen[2] = "Prod. mes";
	stringsdealmacen[3] = "Gasto. mes";
	stringsdealmacen[4] = "Neto mes";
	stringsdealmacen[5] = "Prod. a�o";
	stringsdealmacen[6] = "Gasto a�o";
	stringsdealmacen[7] = "Neto a�o";
	stringsdealmacen[8] = "Reservas";
	stringsdealmacen[9] = "Prox. Caduc.";
	stringsdealmacen[10] = "Trigo";
	stringsdealmacen[11] = "Fruta";
	stringsdealmacen[12] = "Carne";
	stringsdealmacen[13] = "Carne sal.";
	stringsdealmacen[14] = "Pescado";
	stringsdealmacen[15] = "Miel";
	
	intsdealmacen = new int[48];
	for (int i=0; i<48; i++){
		intsdealmacen[i] = 0;
	}
	
}

}

private Variablesdejuego(){
	
}
public void iniciar(){

	
};

	
	
}
