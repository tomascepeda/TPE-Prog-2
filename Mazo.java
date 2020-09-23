package TPE;

import java.util.ArrayList;

public class Mazo {
	
	private ArrayList<Carta> cartas;
	
	public Mazo() {
		cartas = new ArrayList<Carta>();
	}
	
	public void addCarta(Carta c) {
		boolean repetida = false;
		for (Carta i : cartas) {
			if (i.equals(c))
				repetida = true;
		}
		if (!repetida)
			cartas.add(c);
	}
	
	public void removeCarta(Carta c) {
		for (Carta i : cartas) {
			if (i.equals(c))
				cartas.remove(i);
		}
	}
	
	public Carta getCarta() {
		return cartas.get(0);
	}

}

