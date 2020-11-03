package Pocimas;

import java.util.ArrayList;

import Juego.Atributo;

public class PocimaCocktail extends Pocima {
	
	private ArrayList<Pocima> pocimas;	

	public PocimaCocktail(String nombre, ArrayList<Pocima> pocimas) {
		super(nombre);
		this.pocimas = pocimas;
	}

	@Override
	public int getValorResultante(Atributo a) {
		int resultado = 0;
		for (Pocima i : pocimas) {
			resultado += i.getValorResultante(a);
		}
		return resultado;
	}

}
