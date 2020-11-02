package Pocimas;

import TPE.Atributo;

public class Reductora extends Pocima {

	private int valor;
	
	public Reductora(String nombre, int valor) {
		super(nombre);
		this.valor = valor;
	}

	@Override
	public int getValorResultante(Atributo a) {
		return a.getValor() - ((this.valor * a.getValor()) / 100);
	}

}
