package Pocimas;

import TPE.Atributo;

public class Fortalecedora extends Pocima {

	private int valor;
	
	public Fortalecedora(String nombre, int valor) {
		super(nombre);
		this.valor = valor;
	}

	@Override
	public int getValorResultante(Atributo a) {
		return a.getValor() + ((this.valor * a.getValor()) / 100);
	}

}
