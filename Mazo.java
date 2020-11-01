package TPE;

import java.util.ArrayList;
import java.util.Collections;

import Pocimas.Pocima;

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
			
			if (!repetida && c.tieneAtributos(cartas.get(0))) {
				cartas.add(c);				
				System.out.println(c.getNombre());
			}
		}
		barajarCartas();
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
	
	public void aplicarPocimas(Pocima p, int posicion) {
		this.cartas.get(posicion).aplicarPocima(p);
	}
	
	private void barajarCartas() {
		if(this.isPar())
		Collections.shuffle(cartas);
	}
	
	public int size() {
		return cartas.size();
	}
	public boolean isPar() {
		return(this.cartas.size()%2==0); // el 0 puede que sea constante..
	}

}

