package TPE;

import java.util.ArrayList;

import Estrategias.*;

public class Main {

	public static void main(String[] args) {

	
		Estrategia es1 = new EstrategiaObstinado("Timbero", "fuerza");
		Estrategia es2 = new EstrategiaTimbero("Timbero");
		
		
		Jugador j1 = new Jugador("Jere",es1);
		Jugador j2 = new Jugador("Tomas",es2);
		
		
	
		
		Juego juego = new Juego(j1, j2);
		
		
		juego.jugar(j1, j2, 1000);
		ArrayList<String> log = juego.textoJuego();
		
		for (int i = 0; i <log.size(); i++) {
			System.out.println(log.get(i));
		}
		
		
		/*
		1. el jugador que juega cada ronda,
		2. el atributo seleccionado para competir,
		3. los valores de las cartas de cada jugador para ese atributo,
		4. el jugador ganador, y
		5. la cantidad de cartas de cada jugador
		*/
		
		
		
	}

}
