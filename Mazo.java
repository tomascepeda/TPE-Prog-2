package TPE;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
	
	private ArrayList<Carta> cartas;
	
	public Mazo() {
		cartas = new ArrayList<Carta>();
	}
	
	public void addCarta(Carta c) {
		if(cartas.size() == 0) {
			cartas.add(c);
		}else {
			boolean repetida = false;
			for (Carta i : cartas) {
				if (i.equals(c))
					repetida = true;
			} // guarda un boolean 
			
			if (!repetida) // && condicion nueva
				// TODO comprobar
				cartas.add(c);
		}
		barajarCartas();
	}
	
	public void removeCarta(Carta c) {
		for (Carta i : cartas) {
			if (i.equals(c))
				cartas.remove(i);
		}
	}
	
	public Carta getCarta(int index) {
		return cartas.get(index);
	}
	
	private void barajarCartas() {
		Collections.shuffle(cartas);
	}
	
	public int size() {
		return cartas.size();
	}

}

