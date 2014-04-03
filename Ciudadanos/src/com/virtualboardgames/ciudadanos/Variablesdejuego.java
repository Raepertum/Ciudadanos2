package com.virtualboardgames.ciudadanos;

public class Variablesdejuego {

public static final Variablesdejuego variablesdejuego = new Variablesdejuego();	
	
//Tipos de variables provisionales. En muchos casos, lo m�s sensato ser� crear vectores
	
Almacen almacen = new Almacen();
Comercio comercio = new Comercio();
Ejercito ejercito = new Ejercito();
Espionaje espionaje = new Espionaje();
Social social = new Social();

String espacioenblanco = "";

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

String titulo = "ALMAC�N";

String[] nombreslabelsalmacencaducables;
String[] nombreslabelsalmacennocaducables;

String [] stringsdealmacenalimentos;
int[] intsdealmacenalimentos;
String [] stringsdealmacenmatprimas;
int[] intsdealmacenmatprimas;
String [] stringsdealmacenarmas;
int[] intsdealmacenarmas;
String [] stringsdealmacenartesania;
int[] intsdealmacenartesania;
String [] stringsdealmacenbieneslujo;
int[] intsdealmacenbieneslujo;
	

//Trigo en almac�n (8 cada una: PM, GM, NM, PA, GA, NA, RE, CP)
//Fruta en almac�n
//Carne en almac�n
//Carne salada en almac�n
//Pescado en almac�n
//Miel en almac�n

public Almacen(){
	
	
	//Labels de almac�n de productos que pueden caducar
	nombreslabelsalmacencaducables = new String[15];
	nombreslabelsalmacencaducables[0] = "Producci�n mes"; 
	nombreslabelsalmacencaducables[1] = "Gasto mes";
	nombreslabelsalmacencaducables[2] = "Caducidad mes";
	nombreslabelsalmacencaducables[3] = "Neto mes";
	nombreslabelsalmacencaducables[4] = "Reservas";
	nombreslabelsalmacencaducables[5] = "Producci�n a�o";
	nombreslabelsalmacencaducables[6] = "Gasto a�o";
	nombreslabelsalmacencaducables[7] = "Caducidad a�o";
	nombreslabelsalmacencaducables[8] = "Neto a�o";
	nombreslabelsalmacencaducables[9] = "Reservas";
	nombreslabelsalmacencaducables[10] = "Producci�n total";
	nombreslabelsalmacencaducables[11] = "Gasto total";
	nombreslabelsalmacencaducables[12] = "Caducidad total";
	nombreslabelsalmacencaducables[13] = "Neto total";
	nombreslabelsalmacencaducables[14] = "Reservas";
	
	//Labels de almac�n de productos que no caducan
	nombreslabelsalmacennocaducables = new String[15];
	nombreslabelsalmacennocaducables[0] = "Producci�n mes"; 
	nombreslabelsalmacennocaducables[1] = "Gasto mes";
	nombreslabelsalmacennocaducables[2] = "Neto mes";
	nombreslabelsalmacennocaducables[3] = "Reservas";
	nombreslabelsalmacennocaducables[4] = "Producci�n a�o";
	nombreslabelsalmacennocaducables[5] = "Gasto a�o";
	nombreslabelsalmacennocaducables[6] = "Neto a�o";
	nombreslabelsalmacennocaducables[7] = "Reservas";
	nombreslabelsalmacennocaducables[8] = "Producci�n total";
	nombreslabelsalmacennocaducables[9] = "Gasto total";
	nombreslabelsalmacennocaducables[10] = "Neto total";
	nombreslabelsalmacennocaducables[11] = "Reservas";
	
	//Alimentos
	stringsdealmacenalimentos = new String[6];
	stringsdealmacenalimentos[0] = "Trigo";
	stringsdealmacenalimentos[1] = "Fruta";
	stringsdealmacenalimentos[2] = "Carne";
	stringsdealmacenalimentos[3] = "Carne sal.";
	stringsdealmacenalimentos[4] = "Pescado";
	stringsdealmacenalimentos[5] = "Miel";
	
	intsdealmacenalimentos = new int[48];
	for (int i=0; i<48; i++){
		intsdealmacenalimentos[i] = 0;
	}
	
	//Materias Primas
	stringsdealmacenmatprimas = new String[10];
	stringsdealmacenmatprimas[0] = "Sal";
    stringsdealmacenmatprimas[1] = "Madera";
    stringsdealmacenmatprimas[2] = "Piedra";
    stringsdealmacenmatprimas[3] = "Hierro";
    stringsdealmacenmatprimas[4] = "Cobre";
    stringsdealmacenmatprimas[5] = "Esta�o";
	stringsdealmacenmatprimas[6] = "Plata";
	stringsdealmacenmatprimas[7] = "Oro";
	stringsdealmacenmatprimas[8] = "Mercurio";
	stringsdealmacenmatprimas[9] = "Azufre";
	
	intsdealmacenmatprimas = new int[70];
	for (int i=0; i<70; i++){
		intsdealmacenmatprimas[i] = 0;
	}
	//Armas
	stringsdealmacenarmas = new String[8];
	stringsdealmacenarmas[0] = "Espadas";
	stringsdealmacenarmas[1] = "Hachas";
	stringsdealmacenarmas[2] = "Arcos";
	stringsdealmacenarmas[3] = "Lanzas";
	stringsdealmacenarmas[4] = "Mazos";
	stringsdealmacenarmas[5] = "Cetros";
	stringsdealmacenarmas[6] = "Armad. cuero";
	stringsdealmacenarmas[7] = "Armad. hierro";
	
	intsdealmacenarmas = new int[64];
	for (int i=0; i<64; i++){
		intsdealmacenarmas[i] = 0;
	}
	
	//Artesan�a
	
	//Bienes de lujo
	
	
	
}



}


public class Comercio{
	
	String titulo = "COMERCIO";
	
	String[] stringsdecomercio;
	int[] intsdecomercio;

	public Comercio(){
		
		stringsdecomercio = new String[17];
		stringsdecomercio[0] = "Comercio";
		stringsdecomercio[1] = "";
		stringsdecomercio[2] = "Consumo";
		stringsdecomercio[3] = "Venta";
		stringsdecomercio[4] = "P. nom.";
		stringsdecomercio[5] = "P. real";
		stringsdecomercio[6] = "Ingresos";
		stringsdecomercio[7] = "G. prod.";
		stringsdecomercio[8] = "G. trans";
		stringsdecomercio[9] = "G. total";
		stringsdecomercio[10] = "Beneficio";
		stringsdecomercio[11] = "Trigo";
		stringsdecomercio[12] = "Fruta";
		stringsdecomercio[13] = "Carne";
		stringsdecomercio[14] = "Carne sal.";
		stringsdecomercio[15] = "Pescado";
		stringsdecomercio[16] = "Miel";
		
		
		intsdecomercio = new int[54];
		for (int i=0; i<54; i++){
			intsdecomercio[i] = 0;
		}
		
	};
	
}

public class Ejercito{
	
	String titulo = "EJ�RCITO";
	
	public Ejercito(){
		
	}
}

public class Espionaje{
	
	String titulo = "ESPIONAJE";
	
	public Espionaje(){
		
	}
}

public class Social{
	
	String titulo = "SOCIAL";
	
	public Social(){
		
	}
	
}




private Variablesdejuego(){
	
}
public void iniciar(){

	
};

	
	
}
