package TPE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import Pocimas.Pocima;

public class Juego {
	
	private Jugador j1, j2;
	private Mazo mazo;
	private ArrayList<Pocima> pocimas;
	private ArrayList<String> text = new ArrayList<String>();
	
	public Juego(Jugador j1, Jugador j2) {
		super();
		this.j1 = j1;
		this.j2 = j2;
		String mazoPath = "./superheroes.json"; // la notacion nos varia a cada uno
		this.mazo = VisorMazo.armarMazo(mazoPath);
		this.pocimas = new ArrayList<>();
		this.repartirCartas();
	}
	
	
	
	
	public void addPocima(Pocima po) {
		this.pocimas.add(po);
	}
	
	
	public void barajarPocimas() {
		Collections.shuffle(pocimas);
	}
	
	
	
	
	
	
	// aca va toda la logica propia del juego (main del juego)
	// diferenciar bien las responsabilidades de las clases
	
	public void repartirCartas() {
		boolean cartaDada = false;
	
		for (int i = 0; i <mazo.size(); i++) {
			
			if(cartaDada)
				j1.addCarta(mazo.getCarta(i));
			else 
				j2.addCarta(mazo.getCarta(i));	
			cartaDada = !cartaDada;
			
		}
		//System.out.println(j1.cantCartas()+" "+j2.cantCartas());

		/*
		 * Alternativa sin usar boolean
		for (int i = 0; i <mazo.size(); i++) {
			
			if(i % 2 == 0)
				j1.addCarta(mazo.getCarta(i));
			else 
				j2.addCarta(mazo.getCarta(i));	
			cartaDada = !cartaDada;
		}
		*/
	}
		
		
		
		
		/*
		for (int i = 0; i < mazo.size() + 2; i = i + 2) {
			j1.addCarta(mazo.getCarta(i));
			j2.addCarta(mazo.getCarta(i+1));
		*/
		// HORRIBLE CODIGO TOMAS, MEJORADO MAQUINOLA
	public void jugar(Jugador jugador1, Jugador jugador2, int rondas) {
		
		
		if(!mazo.isPar()) {
			System.out.println("No se puede jugar no es par");
			System.out.println(mazo.size());
		}else {
			
		
		
		
		
		Jugador ganador = null; // TE DICE QUIEN GANO EL JUEGO
		int i = 0;
		Jugador j1 = jugador1;
		Jugador j2 = jugador2;
		Jugador ganadorRonda = j1;
		while ((i<rondas && ganador == null) && (j1.getCarta() != null && j2.getCarta() != null)){
			Carta cartaJugador1 = j1.getCarta();
			Carta cartaJugador2 = j2.getCarta();
			i++;
			text.add("---- Ronda " + i + " ----");
			try {
				// no seria mas necesario ahora con el nombre alcanza, evitas pasar el objeto entero.
				//Atributo atributo = ganadorRonda.selectAtributo();
				
				
	
				String atributoSelecionado = ganadorRonda.elegirAtributo(ganadorRonda.getCarta());
				
				
				text.add("El jugador " + ganadorRonda.getNombre() + " selecciona competir por el atributo: " + atributoSelecionado);
				text.add("La carta de " + j1.getNombre() + " es " + cartaJugador1.getNombre() + " con " + atributoSelecionado + " " +cartaJugador1.getValor(atributoSelecionado));
				text.add("La carta de " + j2.getNombre() + " es " + cartaJugador2.getNombre() + " con " + atributoSelecionado + " " + cartaJugador2.getValor(atributoSelecionado));
				
				if (cartaJugador1.getValor(atributoSelecionado) > cartaJugador2.getValor(atributoSelecionado)) {
					j1.addCarta(cartaJugador2);
					j2.removeCarta(cartaJugador2);
					ganadorRonda = j1;
					text.add("Gana la ronda " + ganadorRonda.getNombre() + " y queda con " + ganadorRonda.cantCartas() + " cartas (" + j2.getNombre() + " posee ahora " + j2.cantCartas() + " cartas)");
				}else if (cartaJugador1.getValor(atributoSelecionado) < cartaJugador2.getValor(atributoSelecionado)) {
					j2.addCarta(cartaJugador1);
					j1.removeCarta(cartaJugador1);
					text.add("Gana la ronda " + j2.getNombre() + " y queda con " + j2.cantCartas() + " cartas (" + j1.getNombre() + " posee ahora " + j1.cantCartas() + " cartas)");
					ganadorRonda = j2;
                    				
				}else {
					text.add("empate");
				}
			} catch (Exception e) {
				if (cartaJugador1 == null) {
					ganador = j2;
				}else {
					ganador = j1;
				}
			}
		}
		if (ganador != null) {
			text.add("---- FIN DEL JUEGO ----");
			text.add("GANO " + ganador.getNombre());			
		}else if (j1.cantCartas() > j2.cantCartas()) {
			text.add("---- FIN DEL JUEGO ----");
			text.add("GANO " + j1.getNombre());
		}else if (j1.cantCartas() < j2.cantCartas()) {
			text.add("---- FIN DEL JUEGO ----");
			text.add("GANO " + j2.getNombre());
		}else {
			text.add("---- FIN DEL JUEGO ----");
			text.add("EMPATE");
			}
		}
	}
	
	public ArrayList<String> textoJuego(){
		return this.text;
	}
	
	
	
}
