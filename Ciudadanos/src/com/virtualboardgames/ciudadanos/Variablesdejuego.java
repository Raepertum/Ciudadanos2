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

String[] nombreslabelsalmacencaducables;
String[] nombreslabelsalmacennocaducables;

String [] stringsdealmacenalimentos;
int[] intsdealmacenalimentosmes;
int[] intsdealmacenalimentosano;
int[] intsdealmacenalimentostotal;
String [] stringsdealmacenmatprimas;
int[] intsdealmacenmatprimasmes;
int[] intsdealmacenmatprimasano;
int[] intsdealmacenmatprimastotal;
String [] stringsdealmacenarmas;
int[] intsdealmacenarmasmes;
int[] intsdealmacenarmasano;
int[] intsdealmacenarmastotal;
String [] stringsdealmacenartesania;
int[] intsdealmacenartesaniames;
int[] intsdealmacenartesaniaano;
int[] intsdealmacenartesaniatotal;
String [] stringsdealmacenbieneslujo;
int[] intsdealmacenbieneslujomes;
int[] intsdealmacenbieneslujoano;
int[] intsdealmacenbieneslujototal;
	

//Trigo en almacén (8 cada una: PM, GM, NM, PA, GA, NA, RE, CP)
//Fruta en almacén
//Carne en almacén
//Carne salada en almacén
//Pescado en almacén
//Miel en almacén

public Almacen(){
	
	
	//Labels de almacén de productos que pueden caducar
	nombreslabelsalmacencaducables = new String[15];
	nombreslabelsalmacencaducables[0] = "Producción mes"; 
	nombreslabelsalmacencaducables[1] = "Gasto mes";
	nombreslabelsalmacencaducables[2] = "Caducidad mes";
	nombreslabelsalmacencaducables[3] = "Neto mes";
	nombreslabelsalmacencaducables[4] = "Reservas";
	nombreslabelsalmacencaducables[5] = "Producción año";
	nombreslabelsalmacencaducables[6] = "Gasto año";
	nombreslabelsalmacencaducables[7] = "Caducidad año";
	nombreslabelsalmacencaducables[8] = "Neto año";
	nombreslabelsalmacencaducables[9] = "Reservas";
	nombreslabelsalmacencaducables[10] = "Producción total";
	nombreslabelsalmacencaducables[11] = "Gasto total";
	nombreslabelsalmacencaducables[12] = "Caducidad total";
	nombreslabelsalmacencaducables[13] = "Neto total";
	nombreslabelsalmacencaducables[14] = "Reservas";
	
	//Labels de almacén de productos que no caducan
	nombreslabelsalmacennocaducables = new String[12];
	nombreslabelsalmacennocaducables[0] = "Producción mes"; 
	nombreslabelsalmacennocaducables[1] = "Gasto mes";
	nombreslabelsalmacennocaducables[2] = "Neto mes";
	nombreslabelsalmacennocaducables[3] = "Reservas";
	nombreslabelsalmacennocaducables[4] = "Producción año";
	nombreslabelsalmacennocaducables[5] = "Gasto año";
	nombreslabelsalmacennocaducables[6] = "Neto año";
	nombreslabelsalmacennocaducables[7] = "Reservas";
	nombreslabelsalmacennocaducables[8] = "Producción total";
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
	
	intsdealmacenalimentosmes = new int[25];
	for (int i=0; i<25; i++){
		intsdealmacenalimentosmes[i] = 0;
	}
	intsdealmacenalimentosano = new int[25];
	for (int i=0; i<25; i++){
		intsdealmacenalimentosano[i] = 1;
	}
	intsdealmacenalimentostotal = new int[25];
	for (int i=0; i<25; i++){
		intsdealmacenalimentostotal[i] = 2;
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
	
	intsdealmacenmatprimasmes = new int[32];
	for (int i=0; i<32; i++){
		intsdealmacenmatprimasmes[i] = 3;
	}
	intsdealmacenmatprimasano = new int[32];
	for (int i=0; i<32; i++){
		intsdealmacenmatprimasano[i] = 2;
	}
	intsdealmacenmatprimastotal = new int[32];
	for (int i=0; i<32; i++){
		intsdealmacenmatprimastotal[i] = 99;
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
	
	intsdealmacenarmasmes = new int[28];
	for (int i=0; i<28; i++){
		intsdealmacenarmasmes[i] = 0;
	}
	intsdealmacenarmasano = new int[28];
	for (int i=0; i<28; i++){
		intsdealmacenarmasano[i] = 0;
	}
	intsdealmacenarmastotal = new int[28];
	for (int i=0; i<28; i++){
		intsdealmacenarmastotal[i] = 0;
	}
	
	//Artesanía
	stringsdealmacenartesania = new String[5];
	stringsdealmacenartesania[0] = "Ropa";
	stringsdealmacenartesania[1] = "Alfarería";
	stringsdealmacenartesania[2] = "Cristalería";
	stringsdealmacenartesania[3] = "Herramientas";
	stringsdealmacenartesania[4] = "Instrumentos";
    
    intsdealmacenartesaniames = new int[20];
	for (int i=0; i<20; i++){
		intsdealmacenartesaniames[i] = 0;
	}
	intsdealmacenartesaniaano = new int[20];
	for (int i=0; i<20; i++){
		intsdealmacenartesaniaano[i] = 0;
	}
	intsdealmacenartesaniatotal = new int[20];
	for (int i=0; i<20; i++){
		intsdealmacenartesaniatotal[i] = 0;
	}
    
	
	//Bienes de lujo
	stringsdealmacenbieneslujo = new String[5];
	stringsdealmacenbieneslujo[0] = "Joyería";
	stringsdealmacenbieneslujo[1] = "Marfil";
	stringsdealmacenbieneslujo[2] = "Seda";
	stringsdealmacenbieneslujo[3] = "Especias";
	stringsdealmacenbieneslujo[4] = "Armas expo.";
    
    intsdealmacenbieneslujomes = new int[20];
	for (int i=0; i<20; i++){
		intsdealmacenbieneslujomes[i] = 0;
	}
	intsdealmacenbieneslujoano = new int[20];
	for (int i=0; i<20; i++){
		intsdealmacenbieneslujoano[i] = 0;
	}
	intsdealmacenbieneslujototal = new int[20];
	for (int i=0; i<20; i++){
		intsdealmacenbieneslujototal[i] = 0;
	}
    
}

public void Actualizaralmacen(){
//Debería servir para actualizar, aunque sólo se está usando para hacer pruebas	
};

}


public class Comercio{
	
	String titulo = "COMERCIO";
	
	String[] stringsdecomercio;
	int[] intsdecomercio;

	public Comercio(){
		
		
		//CAMBIARLO TOTALMENTE
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

public void actualizar(){
	this.almacen.Actualizaralmacen();
}

	
	
}
