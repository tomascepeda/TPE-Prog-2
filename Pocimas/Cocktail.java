package Pocimas;

import java.util.ArrayList;

import TPE.Atributo;

public class Cocktail extends Pocima {
	
	private ArrayList<Pocima> pocimas;	

	public Cocktail(String nombre, ArrayList<Pocima> pocimas) {
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
