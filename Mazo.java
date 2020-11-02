package TPE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import Pocimas.Pocima;

public class Mazo {
	
	
	//private ArrayList<Pocima> pocimas;
	private ArrayList<Carta> cartas;
	
	public Mazo() {
		//pocimas = new ArrayList<Pocima>();
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
				//System.out.println(c.getNombre());
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
	/*
	public void aplicarPocimas(Pocima p, int posicion) {
		this.cartas.get(posicion).aplicarPocima(p);
	}
	*/
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

	public void repartirCartas(Jugador j1, Jugador j2, ArrayList<Pocima> pocimas) {
		boolean cartaDada = false;
		
		for (int i = 0; i <this.size(); i++) {
		//NO BORRES ESTO PLIS
		//Carta c = this.getCarta(i);
		Carta c = new Carta(this.getCarta(i).getNombre(), this.getCarta(i).getAtributos(), this.getCarta(i).getPocima());
		if (!pocimas.isEmpty()) {
			int rdm = (int) Math.random()*pocimas.size();
			c.setPocima(pocimas.get(rdm));
			//System.out.println("Se repartieron:"+pocimas.size());
			pocimas.remove(rdm);
		}	
			if(cartaDada)
				//j1.addCarta(this.getCarta(i));
				j1.addCarta(c);
			else
				//j2.addCarta(this.getCarta(i));	
				j2.addCarta(c);
			cartaDada = !cartaDada;
			//this.cartas.remove(i);
		}		
	}
	
	/*
	public void repartirPocimas(ArrayList<Pocima> pocima) {
		Random randomizer = new Random(java.lang.System.nanoTime());
		ArrayList<Integer> n = new ArrayList<Integer>();
		while(!pocima.isEmpty()) {
			int r = randomizer.nextInt(cartas.size());
			
			if(!n.contains(r)){
				Carta ca = cartas.get(r);
				Pocima p = pocima.get(0);
				pocima.remove(0);			
				ca.setPocima(p);
				n.add(r);
				//System.out.println(r);
			}
		}
	}*/


} // CIERRE CLASS 

