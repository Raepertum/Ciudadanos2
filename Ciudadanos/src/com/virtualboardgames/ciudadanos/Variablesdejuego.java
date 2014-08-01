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
	

//Trigo en almac�n (8 cada una: PM, GM, NM, PA, GA, NA, RE, CP)
//Fruta en almac�n
//Carne en almac�n
//Carne salada en almac�n
//Pescado en almac�n
//Miel en almac�n

public Almacen(){
	
	
	//Labels de almac�n de productos que pueden caducar
	nombreslabelsalmacencaducables = new String[]{"Producci�n mes", "Gasto mes", "Caducidad mes", "Neto mes",
		"Reservas","Producci�n a�o", "Gasto a�o", "Caducidad a�o", "Neto a�o", "Reservas", "Producci�n total",
		"Gasto total", "Caducidad total", "Neto total", "Reservas"};
	
	//Labels de almac�n de productos que no caducan
	nombreslabelsalmacennocaducables = new String[]{"Producci�n mes", "Gasto mes", "Neto mes", "Reservas",
		"Producci�n a�o", "Gasto a�o", "Neto a�o", "Reservas", "Producci�n total", "Gasto total", "Neto total",
		"Reservas"};
	
    //Alimentos
	stringsdealmacenalimentos = new String[]{"Trigo", "Fruta", "Carne", "Carne sal.", "Pescado", "Miel"};
	
	
	intsdealmacenalimentosmes = new int[25];
	for (int i=0; i<25; i++){
		intsdealmacenalimentosmes[i] = 0;
	}
	intsdealmacenalimentosano = new int[25];
	for (int i=0; i<25; i++){
		intsdealmacenalimentosano[i] = 0;
	}
	intsdealmacenalimentostotal = new int[25];
	for (int i=0; i<25; i++){
		intsdealmacenalimentostotal[i] = 0;
	}
	
	//Materias Primas
	stringsdealmacenmatprimas = new String[]{"Sal", "Madera", "Piedra", "Hierro", "Cobre", "Esta�o", "Plata",
			"Oro", "Mercurio", "Azufre"};
	
	intsdealmacenmatprimasmes = new int[32];
	for (int i=0; i<32; i++){
		intsdealmacenmatprimasmes[i] = 0;
	}
	intsdealmacenmatprimasano = new int[32];
	for (int i=0; i<32; i++){
		intsdealmacenmatprimasano[i] = 0;
	}
	intsdealmacenmatprimastotal = new int[32];
	for (int i=0; i<32; i++){
		intsdealmacenmatprimastotal[i] = 0;
	}
	//Armas
	stringsdealmacenarmas = new String[]{"Espadas", "Hachas", "Arcos", "Lanzas", "Mazos", "Cetros",
			"Armad. cuero", "Armad. hierro"};
	
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
	
	//Artesan�a
	stringsdealmacenartesania = new String[]{"Ropa", "Alfarer�a", "Cristaler�a", "Herramientas", "Instrumentos"};
	
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
	stringsdealmacenbieneslujo = new String[]{"Joyer�a", "Marfil", "Seda", "Especias", "Armas expo."};
	    
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
//Deber�a servir para actualizar, aunque s�lo se est� usando para hacer pruebas	
};

}


public class Comercio{
	
	String titulo = "COMERCIO";
	
	String[] stringsdecomercio;
	int[] intsdecomercio;

	public Comercio(){
		
		
		//CAMBIARLO TOTALMENTE
		stringsdecomercio = new String[]{"Comercio", "", "Consumo", "Venta", "P.nom", "P.real", "Ingresos",
		"G. prod", "G. trans", "G. total", "Beneficio", "Trigo", "Fruta", "Carne", "Carne sal.", "Pescado",
		"Miel"};
				
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

//SOCIAL

public class Social{
	
	String titulo = "SOCIAL";
	//Los nombres de las clases, dispuestos en la primera columna, son lo que no cambian
	String nombresclasessociales[];
	
	//Los nombres de la primera fila var�an dependiendo del bot�n que se pulse: 
	//Media, Edad\Sexo, Lealtad\Miedo, Nivel
	
	String nombresvaloresmedios[];
	int intsvaloresmedios[];
	String nombresedadsexo[];
	int intsvaloresedadsexo[];
	String nombreslealtadmiedo[];
	int intsvaloreslealtadmiedo[];
	String nombresnivel[];
	int intsvaloresnivel[];
	
	
	public Social(){
		
	//La primera columna, con las clases sociales, nunca var�a	
	nombresclasessociales = new String[]{"Campesinos", "Soldados", "Esp�as", "Magos" , "Nigromantes", "Nobleza",
		"TOTAL"};
	
	//Los valores medios, calculados convirtiendo en int la media de cada vector que representa
	//a un ciudadano
	nombresvaloresmedios = new String[]{"Edad", "Sexo", "Lealtad", "Miedo", "Nivel"};
			
	//Los valores que representan las variables edad\sexo, medidos en n�mero de individuos
	nombresedadsexo = new String[]{"Ni�os", "Ni�as", "Hombres", "Mujeres", "Ancianos", "Ancianas"};
	
	//Los valores que representan las variables Lealtad\Miedo
	nombreslealtadmiedo = new String[]{"Leales", "Poco leales", "Desleales", "Miedo"};
	
	//El nivel o experiencia
	nombresnivel = new String[]{"0-10", "11-20", "21-30", "31-40", "41-50"};
	
	//Inicializaci�n de valores
	intsvaloresmedios = new int[35];
	intsvaloresedadsexo = new int[42];
	intsvaloreslealtadmiedo = new int[28];
	intsvaloresnivel = new int[35];
	
	}
	
	public void anadiraloscontadores(Individuo individuo){
	
	if(individuo.profesion=="campesinos"){
		if(individuo.edad<10){
			intsvaloresedadsexo[0]++;
		}
		else if((individuo.edad>=10)&&(individuo.edad<20)){
			intsvaloresedadsexo[1]++;
		}
        else if((individuo.edad>=20)&&(individuo.edad<30)){
        	intsvaloresedadsexo[2]++;
		}
        else if((individuo.edad>=30)&&(individuo.edad<40)){
        	intsvaloresedadsexo[3]++;
		}
        else if((individuo.edad>=40)&&(individuo.edad<=50)){
        	intsvaloresedadsexo[4]++;
		}
	}
 
}

	
//HAY QUE CREAR UN REGISTRO DE PRODUCCIONES Y UN CONTROL DE INDIVIDUOS	
	
	
}






private Variablesdejuego(){
	
}
public void iniciar(){

	
};

public void actualizar(){
	this.almacen.Actualizaralmacen();
}

	
	
}
