package TPE;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Jugador j1 = new Jugador("Jere");
		Jugador j2 = new Jugador("Tomas");
		
		Juego juego = new Juego(j1, j2);
		
		juego.repartirCartas();
		ArrayList<String> resultados = (ArrayList<String>) juego.jugar(j1, j2, 1000).clone();
		for (String i : resultados) {
			System.out.println(i.toString());
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
