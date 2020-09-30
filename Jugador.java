package TPE;

import java.util.ArrayList;

public class Jugador {
	
	private String nombre;
	private Mazo mazo;
	private int indiceCarta;
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
		this.mazo = new Mazo();
		this.indiceCarta = -1;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void addCarta(Carta c) {
		mazo.addCarta(c);
	}
	
	public Atributo selectAtributo() {
		int cant = mazo.getCarta(indiceCarta).getAtributos().size();
		int random = (int) Math.floor((Math.random()*cant) + 1);
		return mazo.getCarta(0).getAtributos().get(random - 1); // revisar
	}
	
	public Carta getCarta() {
		this.indiceCarta++;
		return mazo.getCarta(indiceCarta);
	}

}
