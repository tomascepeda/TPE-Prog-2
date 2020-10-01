package TPE;

public class Juego {
	
	private Jugador j1, j2;
	private Mazo mazo;
	
	public Juego(Jugador j1, Jugador j2) {
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
	
	private Jugador jugarRonda(Jugador actual, Jugador adversario) {
		Carta cartaJugadorActual = actual.getCarta();
		Carta cartaJugadorAdversario = actual.getCarta();
		try {
			Atributo atributo = actual.selectAtributo();
			System.out.println("El jugador " + actual.getNombre() + " selecciona competir por el atributo: " + atributo.getNombre());
			System.out.println("La carta de " + actual.getNombre() + " es " + cartaJugadorActual.getNombre() + " con " + atributo.getNombre() + " " +cartaJugadorActual.getValor(atributo));
			System.out.println("La carta de " + adversario.getNombre() + " es " + cartaJugadorAdversario.getNombre() + " con " + atributo.getNombre() + " " + cartaJugadorAdversario.getValor(atributo));
			if (cartaJugadorActual.getValor(atributo) > cartaJugadorAdversario.getValor(atributo)) {
				System.out.println("Gana la ronda " + actual.getNombre());
				actual.addCarta(cartaJugadorAdversario);
				adversario.removeCarta(cartaJugadorAdversario);
			}else if (cartaJugadorActual.getValor(atributo) < cartaJugadorAdversario.getValor(atributo)) {
				System.out.println("Gana la ronda " + adversario.getNombre());
				adversario.addCarta(cartaJugadorActual);
				actual.removeCarta(cartaJugadorActual);
			}else {
				System.out.println("empate");
			}
			return null;
		} catch (Exception e) {
			if (cartaJugadorActual == null) {
				return adversario;
			}else {
				return actual;
			}
		}
	}
	
	public void jugar(Jugador j1, Jugador j2, int rondas) {
		// Prueba solamente.
		/*
		if(!mazo.isPar()) {
			System.out.println("No se puede jugar no es par");
		}
		*/
		Jugador ganador = null;
		int i = 0;
		while (i<rondas && ganador == null && mazo.isPar()) {
			i++;
			System.out.println("---- Ronda " + i + " ----");
			ganador = jugarRonda(j1,j2);
		}
		if (ganador != null) {
			System.out.println("---- FIN DEL JUEGO ----");
			System.out.println("GANO " + ganador.getNombre());			
		}else if (j1.cantCartas() > j2.cantCartas()) {
			System.out.println("---- FIN DEL JUEGO ----");
			System.out.println("GANO " + j1.getNombre());
		}else if (j1.cantCartas() < j2.cantCartas()) {
			System.out.println("---- FIN DEL JUEGO ----");
			System.out.println("GANO " + j2.getNombre());
		}else {
			System.out.println("---- FIN DEL JUEGO ----");
			System.out.println("EMPATE");
		}
	}
	
	
	
}
