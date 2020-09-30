package TPE;

public class Main {

	public static void main(String[] args) {

		Jugador j1 = new Jugador("yirrap");
		Jugador j2 = new Jugador("marano");
		
		Juego juego = new Juego(j1, j2);
		
		juego.repartirCartas();
		juego.jugarRonda(j1, j2);
		
		/*
		1. el jugador que juega cada ronda,
		2. el atributo seleccionado para competir,
		3. los valores de las cartas de cada jugador para ese atributo,
		4. el jugador ganador, y
		5. la cantidad de cartas de cada jugador
		*/
		
		
		
	}

}
