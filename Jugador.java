package TPE;

import java.util.ArrayList;

public class Jugador {
	
	private String nombre;
	private Mazo mazo;
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
		this.mazo = new Mazo();
	}
	
	public void addCarta(Carta c) {
		this.mazo.addCarta(c);
	}
	
	public Atributo selectAtributo() {
		int cant = mazo.getCarta(0).getAtributos().size();
		int random = (int) Math.floor((Math.random()*cant) + 1);
		return mazo.getCarta(0).getAtributos().get(random);
	}

}
