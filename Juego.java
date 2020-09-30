package TPE;

public class Juego {
	
	private Jugador j1, j2;
	private Mazo mazo;
	
	public Juego(Jugador j1, Jugador j2, Mazo mazo) {
		super();
		this.j1 = j1;
		this.j2 = j2;
		String mazoPath = "./superheroes.json"; // la notacion nos varia a cada uno
		this.mazo = VisorMazo.armarMazo(mazoPath);
	}
	
	// aca va toda la logica propia del juego (main del juego)
	// diferenciar bien las responsabilidades de las clases
	
	public void repartirCartas() {
		for (int i = 0; i < mazo.size() - 1; i++) {
			j1.addCarta(mazo.getCarta(i));
			j2.addCarta(mazo.getCarta(i++));
		}
	}
	
	
	
}
