package Juego;

import java.util.ArrayList;
import Estrategias.Estrategia; 

public class Jugador {
	
	private String nombre;
	private Mazo mazo;
	private int indiceCarta;
	private Estrategia estrategia;
	
	public Jugador(String nombre, Estrategia estrategia) {
		this.nombre = nombre;
		this.mazo = new Mazo();
		this.indiceCarta = -1;
		this.estrategia = estrategia;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void addCarta(Carta c) {
		if (c != null)
			mazo.addCarta(c);
	}
	
	public void removeCarta(Carta c) {
		mazo.removeCarta(c);
	}

	public String elegirAtributo(Carta ca) {
		return this.estrategia.obtenerEstrategia(ca);
	}
	
	public Carta getCarta() {
		this.indiceCarta++;
		Carta aux = mazo.getCarta(indiceCarta);
		if(aux == null) {
			this.indiceCarta = 0;
			return mazo.getCarta(indiceCarta);
		}else
			return aux;
	}
	
	public int cantCartas() {
		return mazo.size();
	}

	@Override
	public boolean equals(Object j) {
		return (this.getNombre().equals(((Jugador) j).getNombre())); // y que las cartas en posesion sean las mismas
	}

}
