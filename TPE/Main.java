package TPE;

import java.util.ArrayList;

import Estrategias.*;
import Pocimas.*;

public class Main {

	public static void main(String[] args) {
	
		Estrategia es1 = new EstrategiaObstinado("Timbero", "fuerza");
		Estrategia es2 = new EstrategiaTimbero("Timbero");
		
		Jugador j1 = new Jugador("Jere", es1);
		Jugador j2 = new Jugador("Tomas", es2);
		
		//Pocimas
		Fortalecedora p1 = new Fortalecedora("fortalecedora", 20);
	    Fortalecedora p2 = new Fortalecedora("fortalecedora plus", 50);
	    Reductora p3 = new Reductora("kriptonita", 25);
	    Reductora p4 = new Reductora("reductor de plomo", 55);
	    PocimaValorFijo p5 = new PocimaValorFijo("quiero vale 4", 4);
	    PocimaValorFijo p6 = new PocimaValorFijo("numero magico", 22);
	    Selectiva p7 = new Selectiva("selectiva fuerza", "fuerza", 35);
	    Selectiva p8 = new Selectiva("selectiva peso", "peso", 43);
	    
	    //esto es para el caso especial de la pocima cocktail
	    ArrayList<Pocima> pocimasAux = new ArrayList<Pocima>();
	    pocimasAux.add(p1); pocimasAux.add(p2); pocimasAux.add(p3); pocimasAux.add(p4);
	    pocimasAux.add(p5); pocimasAux.add(p6); pocimasAux.add(p7); pocimasAux.add(p8);
	    Cocktail p9 = new Cocktail("cocktail", pocimasAux);
		
		Juego juego = new Juego(j1, j2);
		juego.addPocima(p1);
		juego.addPocima(p2);
		juego.addPocima(p3);
		juego.addPocima(p4);
		juego.addPocima(p5);
		juego.addPocima(p6);
		juego.addPocima(p7);
		juego.addPocima(p8);
		juego.addPocima(p9);
		
		juego.jugar(j1, j2, 200); 
		
		ArrayList<String> log = juego.textoJuego();
		
		for (int i = 0; i <log.size(); i++) {
			System.out.println(log.get(i));
		}
		
	}

}
