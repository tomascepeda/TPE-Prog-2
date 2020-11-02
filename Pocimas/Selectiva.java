package Pocimas;

import TPE.Atributo;

public class Selectiva extends Pocima {

	private String atributo;
	private int valor;
	
	public Selectiva(String nombre, String atributo, int valor) {
		super(nombre);
		this.atributo = atributo;
		this.valor = valor;
	}

	@Override
	public int getValorResultante(Atributo a) {
		if(a.getNombre().equals(this.atributo))
			return a.getValor() + ((this.valor * a.getValor()) / 100);
		else return a.getValor();
	}

}
