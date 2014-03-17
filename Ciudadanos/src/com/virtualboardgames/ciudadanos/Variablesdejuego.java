package com.virtualboardgames.ciudadanos;

public class Variablesdejuego {

public static final Variablesdejuego variablesdejuego = new Variablesdejuego();	
	
//Tipos de variables provisionales. En muchos casos, lo más sensato será crear vectores
	



Almacen almacen = new Almacen();

public class Almacen{

	//Variables para almacen
	//PM: Producción mensual
	//GM: Gasto mensual
	//NM: Neto mensual
	//PA: Producción anual
	//GA: Gasto anual
	//NA: Neto anual
	//RE: Reservas
	//CP: Próxima caducidad
	
	
	
//ALMACÉN
String [] stringsdealmacen;
int[] intsdealmacen;
	

//Trigo en almacén (8 cada una: PM, GM, NM, PA, GA, NA, RE, CP)
//Fruta en almacén
//Carne en almacén
//Carne salada en almacén
//Pescado en almacén
//Miel en almacén


public Almacen(){
	stringsdealmacen = new String[16];
	stringsdealmacen[0] = "Almacén";
	stringsdealmacen[1] = "";
	stringsdealmacen[2] = "Prod. mes";
	stringsdealmacen[3] = "Gasto. mes";
	stringsdealmacen[4] = "Neto mes";
	stringsdealmacen[5] = "Prod. año";
	stringsdealmacen[6] = "Gasto año";
	stringsdealmacen[7] = "Neto año";
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
