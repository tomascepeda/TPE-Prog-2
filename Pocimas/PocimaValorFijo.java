package Pocimas;

import TPE.Atributo;

public class PocimaValorFijo extends Pocima{
	private int valor;
	
	
	public PocimaValorFijo(String nombre, int valor) {
		super(nombre);
		this.valor = valor;
	}


	@Override
	public void aplicar(Atributo a) {
		int valorOrignal = a.getValor();
		a.setValor(valorOrignal*valor);
	}

}
