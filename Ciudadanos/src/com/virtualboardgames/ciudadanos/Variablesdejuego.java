package com.virtualboardgames.ciudadanos;

public class Variablesdejuego {

public static final Variablesdejuego variablesdejuego = new Variablesdejuego();	
	
//Tipos de variables provisionales. En muchos casos, lo más sensato será crear vectores
	
Almacen almacen = new Almacen();
Comercio comercio = new Comercio();
Ejercito ejercito = new Ejercito();
Espionaje espionaje = new Espionaje();
Social social = new Social();

String espacioenblanco = "";

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

String titulo = "ALMACÉN";
	
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
	

//Trigo en almacén (8 cada una: PM, GM, NM, PA, GA, NA, RE, CP)
//Fruta en almacén
//Carne en almacén
//Carne salada en almacén
//Pescado en almacén
//Miel en almacén

public Almacen(){
	
	//Alimentos
	
	//!!!!!!!!!!!!!!!!!!!
	//Más que reorganizar: Saca esto de alimentos. Crea una array genérica para 
	//Los nombres producción, consumo y demás...
	//!!!!!!!!!!!!!!!!!!!
	
	stringsdealmacenalimentos = new String[14];
	stringsdealmacenalimentos[0] = "Prod. mes";
	stringsdealmacenalimentos[1] = "Gasto. mes";
	stringsdealmacenalimentos[2] = "Neto mes";
	stringsdealmacenalimentos[3] = "Prod. año";
	stringsdealmacenalimentos[4] = "Gasto año";
	stringsdealmacenalimentos[5] = "Neto año";
	stringsdealmacenalimentos[6] = "Reservas";
	stringsdealmacenalimentos[7] = "Prox. Caduc.";
	stringsdealmacenalimentos[8] = "Trigo";
	stringsdealmacenalimentos[9] = "Fruta";
	stringsdealmacenalimentos[10] = "Carne";
	stringsdealmacenalimentos[11] = "Carne sal.";
	stringsdealmacenalimentos[12] = "Pescado";
	stringsdealmacenalimentos[13] = "Miel";
	
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
    stringsdealmacenmatprimas[5] = "Estaño";
	stringsdealmacenmatprimas[6] = "Plata";
	stringsdealmacenmatprimas[7] = "Oro";
	stringsdealmacenmatprimas[8] = "Mercurio";
	stringsdealmacenmatprimas[9] = "Azufre";
	
	intsdealmacenmatprimas = new int[80];
	for (int i=0; i<80; i++){
		intsdealmacenmatprimas[i] = 0;
	}
	//Armas
	
	//Artesanía
	
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
	
	String titulo = "EJÉRCITO";
	
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
