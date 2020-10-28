package TPE;

import java.util.ArrayList;

public class Jugador {
	
	private String nombre;
	private Mazo mazo;
	private int indiceCarta;
//	private Criterio CriterioEstrategia;
	
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
		if (c != null)
			mazo.addCarta(c);
	}
	
	public void removeCarta(Carta c) {
		mazo.removeCarta(c);
	}
	
	public Atributo selectAtributo() {
		int cant = mazo.getCarta(indiceCarta).getAtributos().size();
		int random = (int) Math.floor((Math.random()*cant) + 1);
		return mazo.getCarta(0).getAtributos().get(random - 1); // revisar
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
