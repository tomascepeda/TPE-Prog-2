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
	
	public Jugador jugarRonda(Jugador actual, Jugador adversario) {
		Carta cartaJugadorActual = actual.getCarta();
		Carta cartaJugadorAdversario = actual.getCarta();
		//System.out.println(cartaJugadorActual.tieneAtributos(cartaJugadorAdversario));
		Atributo atributo = actual.selectAtributo();
		System.out.println("El jugador " + actual.getNombre() + " selecciona competir por el atributo: " + atributo.getNombre());
		System.out.println("La carta de " + actual.getNombre() + " es " + cartaJugadorActual.getNombre() + " con " + atributo.getNombre() + " " +cartaJugadorActual.getValor(atributo));
		System.out.println("La carta de " + adversario.getNombre() + " es " + cartaJugadorAdversario.getNombre() + " con " + atributo.getNombre() + " " + cartaJugadorAdversario.getValor(atributo));
		if (cartaJugadorActual.getValor(atributo) > cartaJugadorAdversario.getValor(atributo)) {
			System.out.println("Gana la ronda " + actual.getNombre());
			return actual;
		}else if (cartaJugadorActual.getValor(atributo) < cartaJugadorAdversario.getValor(atributo)) {
			System.out.println("Gana la ronda " + adversario.getNombre());
			return adversario;
		}else {
			System.out.println("empate");
			return null;
		}
	}
	
	
	
	
}
