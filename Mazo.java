package TPE;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
	
	private ArrayList<Carta> cartas;
	
	public Mazo() {
		cartas = new ArrayList<Carta>();
	}
	
	public void addCarta(Carta c) {
		/*if(cartas.size() == 0) {
		*/	
		if (c != null)
			cartas.add(c);
		/*}else {
			boolean repetida = false;
			for (Carta i : cartas) {
				if (i.equals(c))
					repetida = true;
			} // guarda un boolean 
			if (!repetida && c.tieneAtributos(cartas.get(0)))
				cartas.add(c);
		}
		barajarCartas(); */
	}
	
	public void removeCarta(Carta c) {
		cartas.remove(c);
	}
	
	public Carta getCarta(int index) {
		try {
			return cartas.get(index);
		} catch (Exception e) {
			return null;
		}
	}
	
	private void barajarCartas() {
		Collections.shuffle(cartas);
	}
	
	public int size() {
		return cartas.size();
	}

}

