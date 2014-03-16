package com.virtualboardgames.ciudadanos;

import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Stack;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

public class MenuAlmacen extends Stack{
	
	//Tablas. La table de fondo sólo contiene la imagen de fondo.
	//La table de texto contiene los nombres y la información
	//La table de botones (Si es que no se añaden los botones a la table de texto)
	//contiene los botones
	
	Table tabledefondo;
	Table tabledetexto;
	
	
	//Instancias de las imágenes (Una para el fondo, el resto para los iconos)	
	Image fondomenualmacen;
	
	//Instancias de los textos, todos dentro de un label
	Label titulo;
	Label espacio;
	Label cantidadentrames;
	Label cantidadsalemes;
	Label resultadocantidadmes;
	Label cantidadentraano;
	Label cantidadsaleano;
	Label resultadocantidadano;
	Label cantidadalmacenada;
	Label cantidadexpirames;
	Label trigo;
	Label pmtrigo;
	Label gmtrigo;
	Label nmtrigo;
	Label patrigo;
	Label gatrigo;
	Label natrigo;
	Label retrigo;
	Label cptrigo;
	Label fruta;
	Label pmfruta;
    Label gmfruta;
    Label nmfruta;
    Label pafruta;
    Label gafruta;
    Label nafruta;
    Label refruta;
    Label cpfruta;
	Label carne;
	Label pmcarne;
	Label gmcarne;
	Label nmcarne;
	Label pacarne;
	Label gacarne;
	Label nacarne;
	Label recarne;
	Label cpcarne;
	Label carneensalazon;
	Label pmcarnesal;
	Label gmcarnesal;
	Label nmcarnesal;
	Label pacarnesal;
	Label gacarnesal;
	Label nacarnesal; 
	Label recarnesal;
	Label cpcarnesal;
	Label pescado;
	Label pmpesc;
	Label gmpesc;
	Label nmpesc;
	Label papesc;
	Label gapesc;
	Label napesc;
	Label repesc;
	Label cppesc;
	Label miel;
	Label pmmiel;
	Label gmmiel;
	Label nmmiel;
	Label pamiel;
	Label gamiel;
	Label namiel;
	Label remiel;
	Label cpmiel;
		
	
	//Estilos: Para no tener que estar escribiendo desde el principio
	LabelStyle estilolabel;
	
	//Ancho columnas
	int anchocolumnas = 80;
		
	public MenuAlmacen(){

	//Creamos las nuevas tables	
	tabledefondo = new Table();
	tabledetexto = new Table();
	
	//Posicionamos y definimos el tamaño del stack
	this.setPosition(30,30);
	this.setSize(740, 540);
	
	//Añadimos las tables en el orden correcto
	this.add(tabledefondo);
    this.add(tabledetexto);
	
	//Vamos instanciando y añadiendo los objetos (Puede que más tarde, por razones de rendimiento
    //se pasen todos a la clase de texturasysonidos)
	//El fondo
    fondomenualmacen = new Image(Texturasysonidos.texturasysonidos.estilosyactores.fondoMenuAlmacen);
	
    //Los estilos
    estilolabel = Texturasysonidos.texturasysonidos.estilosyactores.estilolabeldefault;
    
    //Los labels    
    titulo = new Label("ALMACÉN", estilolabel);
    espacio = new Label("", estilolabel);
	cantidadentrames = new Label("Prod/Mes", estilolabel);
	cantidadsalemes = new Label("Gasto/Mes", estilolabel);
	resultadocantidadmes = new Label("Neto mes", estilolabel);
	cantidadentraano = new Label("Prod/Año", estilolabel);
	cantidadsaleano = new Label("Gasto/Año", estilolabel);
	resultadocantidadano = new Label("Neto año", estilolabel);
	cantidadalmacenada = new Label("Reservas", estilolabel);
	cantidadexpirames = new Label("Cad. Próx.", estilolabel);
	trigo = new Label("Trigo", estilolabel);
	pmtrigo = new Label(""+Variablesdejuego.variablesdejuego.pmtrigo, estilolabel);
	gmtrigo = new Label(""+Variablesdejuego.variablesdejuego.gmtrigo, estilolabel);
	nmtrigo = new Label(""+Variablesdejuego.variablesdejuego.nmtrigo, estilolabel);
	patrigo = new Label(""+Variablesdejuego.variablesdejuego.patrigo, estilolabel);
	gatrigo = new Label(""+Variablesdejuego.variablesdejuego.gatrigo, estilolabel);
	natrigo = new Label(""+Variablesdejuego.variablesdejuego.natrigo, estilolabel);
	retrigo = new Label(""+Variablesdejuego.variablesdejuego.retrigo, estilolabel);
	cptrigo = new Label(""+Variablesdejuego.variablesdejuego.cptrigo, estilolabel);
	fruta = new Label("Fruta", estilolabel);
	pmfruta = new Label(""+Variablesdejuego.variablesdejuego.pmfruta, estilolabel);
	gmfruta = new Label(""+Variablesdejuego.variablesdejuego.gmfruta, estilolabel);
	nmfruta = new Label(""+Variablesdejuego.variablesdejuego.nmfruta, estilolabel);
	pafruta = new Label(""+Variablesdejuego.variablesdejuego.pafruta, estilolabel);
	gafruta = new Label(""+Variablesdejuego.variablesdejuego.gafruta, estilolabel);
	nafruta = new Label(""+Variablesdejuego.variablesdejuego.nafruta, estilolabel);
	refruta = new Label(""+Variablesdejuego.variablesdejuego.refruta, estilolabel);
	cpfruta = new Label(""+Variablesdejuego.variablesdejuego.cpfruta, estilolabel);
	carne = new Label("Carne", estilolabel);
	pmcarne = new Label(""+Variablesdejuego.variablesdejuego.pmcarne, estilolabel);
	gmcarne = new Label(""+Variablesdejuego.variablesdejuego.gmcarne, estilolabel);
	nmcarne = new Label(""+Variablesdejuego.variablesdejuego.nmcarne, estilolabel);
	pacarne = new Label(""+Variablesdejuego.variablesdejuego.pacarne, estilolabel);
	gacarne = new Label(""+Variablesdejuego.variablesdejuego.gacarne, estilolabel);
	nacarne = new Label(""+Variablesdejuego.variablesdejuego.nacarne, estilolabel);
	recarne = new Label(""+Variablesdejuego.variablesdejuego.recarne, estilolabel);
	cpcarne = new Label(""+Variablesdejuego.variablesdejuego.cpcarne, estilolabel);
	carneensalazon = new Label("Carne sal.", estilolabel);
	pmcarnesal = new Label(""+Variablesdejuego.variablesdejuego.pmcarnesal, estilolabel);
	gmcarnesal = new Label(""+Variablesdejuego.variablesdejuego.gmcarnesal, estilolabel);
	nmcarnesal = new Label(""+Variablesdejuego.variablesdejuego.nmcarnesal, estilolabel);
	pacarnesal = new Label(""+Variablesdejuego.variablesdejuego.pacarnesal, estilolabel);
	gacarnesal = new Label(""+Variablesdejuego.variablesdejuego.gacarnesal, estilolabel);
	nacarnesal = new Label(""+Variablesdejuego.variablesdejuego.nacarnesal, estilolabel);
	recarnesal = new Label(""+Variablesdejuego.variablesdejuego.recarnesal, estilolabel);
	cpcarnesal = new Label(""+Variablesdejuego.variablesdejuego.cpcarnesal, estilolabel);
	pescado = new Label("Pescado", estilolabel);
	pmpesc = new Label(""+Variablesdejuego.variablesdejuego.pmpesc, estilolabel);
	gmpesc = new Label(""+Variablesdejuego.variablesdejuego.gmpesc, estilolabel);
	nmpesc = new Label(""+Variablesdejuego.variablesdejuego.nmpesc, estilolabel);
	papesc = new Label(""+Variablesdejuego.variablesdejuego.papesc, estilolabel);
	gapesc = new Label(""+Variablesdejuego.variablesdejuego.gapesc, estilolabel);
	napesc = new Label(""+Variablesdejuego.variablesdejuego.napesc, estilolabel);
	repesc = new Label(""+Variablesdejuego.variablesdejuego.repesc, estilolabel);
	cppesc = new Label(""+Variablesdejuego.variablesdejuego.cppesc, estilolabel);
	miel = new Label("Miel", estilolabel);
	pmmiel = new Label(""+Variablesdejuego.variablesdejuego.pmmiel, estilolabel);
	gmmiel = new Label(""+Variablesdejuego.variablesdejuego.gmmiel, estilolabel);
	nmmiel = new Label(""+Variablesdejuego.variablesdejuego.nmmiel, estilolabel);
	pamiel = new Label(""+Variablesdejuego.variablesdejuego.pamiel, estilolabel);
	gamiel = new Label(""+Variablesdejuego.variablesdejuego.gamiel, estilolabel);
	namiel = new Label(""+Variablesdejuego.variablesdejuego.namiel, estilolabel);
	remiel = new Label(""+Variablesdejuego.variablesdejuego.remiel, estilolabel);
	cpmiel = new Label(""+Variablesdejuego.variablesdejuego.cpmiel, estilolabel);
	
	
	//La alineación de los labels
	titulo.setAlignment(4);
	cantidadentrames.setAlignment(1);
	pmtrigo.setAlignment(1);
	cantidadsalemes.setAlignment(1);
	resultadocantidadmes.setAlignment(1);
	cantidadentraano.setAlignment(1);
	cantidadsaleano.setAlignment(1);
	resultadocantidadano.setAlignment(1);
	cantidadalmacenada.setAlignment(1);
	cantidadexpirames.setAlignment(1);
	trigo.setAlignment(1);
	pmtrigo.setAlignment(1);
	gmtrigo.setAlignment(1);
	nmtrigo.setAlignment(1);
	patrigo.setAlignment(1);
	gatrigo.setAlignment(1);
	natrigo.setAlignment(1);
	retrigo.setAlignment(1);
	cptrigo.setAlignment(1);
	fruta.setAlignment(1);
	pmfruta.setAlignment(1);
    gmfruta.setAlignment(1);
    nmfruta.setAlignment(1);
    pafruta.setAlignment(1);
    gafruta.setAlignment(1);
    nafruta.setAlignment(1);
    refruta.setAlignment(1);
    cpfruta.setAlignment(1);
	carne.setAlignment(1);
	pmcarne.setAlignment(1);
	gmcarne.setAlignment(1);
	nmcarne.setAlignment(1);
	pacarne.setAlignment(1);
	gacarne.setAlignment(1);
	nacarne.setAlignment(1);
	recarne.setAlignment(1);
	cpcarne.setAlignment(1);
	carneensalazon.setAlignment(1);
	pmcarnesal.setAlignment(1);
	gmcarnesal.setAlignment(1);
	nmcarnesal.setAlignment(1);
	pacarnesal.setAlignment(1);
	gacarnesal.setAlignment(1);
	nacarnesal.setAlignment(1);
	recarnesal.setAlignment(1);
	cpcarnesal.setAlignment(1);
	pescado.setAlignment(1);
	pmpesc.setAlignment(1);
	gmpesc.setAlignment(1);
	nmpesc.setAlignment(1);
	papesc.setAlignment(1);
	gapesc.setAlignment(1);
	napesc.setAlignment(1);
	repesc.setAlignment(1);
	cppesc.setAlignment(1);
	miel.setAlignment(1);
	pmmiel.setAlignment(1);
	gmmiel.setAlignment(1);
	nmmiel.setAlignment(1);
	pamiel.setAlignment(1);
	gamiel.setAlignment(1);
	namiel.setAlignment(1);
	remiel.setAlignment(1);
	cpmiel.setAlignment(1);
		
	
    //Empezamos por arriba a la izquierda, y establecemos los márgenes
	tabledetexto.left().top();
	tabledetexto.padLeft(20);
	tabledetexto.padTop(20);
	
	//Añadimos el fondo
	tabledefondo.add(fondomenualmacen);
	
	//Añadimos el label (Alternamos con row)
	tabledetexto.left();
	tabledetexto.add(titulo).width(anchocolumnas);
	tabledetexto.row().height(80);
	tabledetexto.add(espacio).width(anchocolumnas);
	tabledetexto.add(cantidadentrames).width(anchocolumnas);
	tabledetexto.add(cantidadsalemes).width(anchocolumnas);
	tabledetexto.add(resultadocantidadmes).width(anchocolumnas);
	tabledetexto.add(cantidadentraano).width(anchocolumnas);
	tabledetexto.add(cantidadsaleano).width(anchocolumnas);
	tabledetexto.add(resultadocantidadano).width(anchocolumnas);
	tabledetexto.add(cantidadalmacenada).width(anchocolumnas);
	tabledetexto.add(cantidadexpirames).width(anchocolumnas);
	tabledetexto.row();
	tabledetexto.add(trigo).width(anchocolumnas);
	tabledetexto.add(pmtrigo).width(anchocolumnas);
	tabledetexto.add(gmtrigo).width(anchocolumnas);
	tabledetexto.add(nmtrigo).width(anchocolumnas);
	tabledetexto.add(patrigo).width(anchocolumnas);
	tabledetexto.add(gatrigo).width(anchocolumnas);
	tabledetexto.add(natrigo).width(anchocolumnas);
	tabledetexto.add(retrigo).width(anchocolumnas);
	tabledetexto.add(cptrigo).width(anchocolumnas);
	tabledetexto.row();
	tabledetexto.add(fruta).width(anchocolumnas);
	tabledetexto.add(pmfruta).width(anchocolumnas);
	tabledetexto.add(gmfruta).width(anchocolumnas);
	tabledetexto.add(nmfruta).width(anchocolumnas);
	tabledetexto.add(pafruta).width(anchocolumnas);
	tabledetexto.add(gafruta).width(anchocolumnas);
	tabledetexto.add(nafruta).width(anchocolumnas);
	tabledetexto.add(refruta).width(anchocolumnas);
	tabledetexto.add(cpfruta).width(anchocolumnas);
	tabledetexto.row();
	tabledetexto.add(carne).width(anchocolumnas);
	tabledetexto.add(pmcarne).width(anchocolumnas);
	tabledetexto.add(gmcarne).width(anchocolumnas);
	tabledetexto.add(nmcarne).width(anchocolumnas);
	tabledetexto.add(pacarne).width(anchocolumnas);
	tabledetexto.add(gacarne).width(anchocolumnas);
	tabledetexto.add(nacarne).width(anchocolumnas);
	tabledetexto.add(recarne).width(anchocolumnas);
	tabledetexto.add(cpcarne).width(anchocolumnas);
	tabledetexto.row();
	tabledetexto.add(carneensalazon).width(anchocolumnas);
	tabledetexto.add(pmcarnesal).width(anchocolumnas);
	tabledetexto.add(gmcarnesal).width(anchocolumnas);
	tabledetexto.add(nmcarnesal).width(anchocolumnas);
	tabledetexto.add(pacarnesal).width(anchocolumnas);
	tabledetexto.add(gacarnesal).width(anchocolumnas);
	tabledetexto.add(nacarnesal).width(anchocolumnas);
	tabledetexto.add(recarnesal).width(anchocolumnas);
	tabledetexto.add(cpcarnesal).width(anchocolumnas);
	tabledetexto.row();
	tabledetexto.add(pescado).width(anchocolumnas);
	tabledetexto.add(pmpesc).width(anchocolumnas);
	tabledetexto.add(gmpesc).width(anchocolumnas);
	tabledetexto.add(nmpesc).width(anchocolumnas);
	tabledetexto.add(papesc).width(anchocolumnas);
	tabledetexto.add(gapesc).width(anchocolumnas);
	tabledetexto.add(napesc).width(anchocolumnas);
	tabledetexto.add(repesc).width(anchocolumnas);
	tabledetexto.add(cppesc).width(anchocolumnas);
	tabledetexto.row();
	tabledetexto.add(miel).width(anchocolumnas);
	tabledetexto.add(pmmiel).width(anchocolumnas);
	tabledetexto.add(gmmiel).width(anchocolumnas);
	tabledetexto.add(nmmiel).width(anchocolumnas);
	tabledetexto.add(pamiel).width(anchocolumnas);
	tabledetexto.add(gamiel).width(anchocolumnas);
	tabledetexto.add(namiel).width(anchocolumnas);
	tabledetexto.add(remiel).width(anchocolumnas);
	tabledetexto.add(cpmiel).width(anchocolumnas);

}


public void act(float deltatime){
	
}
	
}
