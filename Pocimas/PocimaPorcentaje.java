package Pocimas;

import Juego.Atributo;

public class PocimaPorcentaje extends Pocima {

	private int valor;
	
	public PocimaPorcentaje(String nombre, int valor) {
		super(nombre);
		this.valor = valor;
	}

	@Override
	public int getValorResultante(Atributo a) {
		return a.getValor() + ((this.valor * a.getValor()) / 100);
	}

}
