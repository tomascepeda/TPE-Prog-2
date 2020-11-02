package Pocimas;

import TPE.Atributo;

public class PocimaValorFijo extends Pocima{
	private String nombreAtributo;
	private int valor;
	
	
	public PocimaValorFijo(String nombre, String nombreAtributo, int valor) {
		super(nombre);
		this.valor = valor;
	}
	
	
	public PocimaValorFijo(String nombre, int valor) {
		super(nombre);
		this.valor = valor;
	}


	@Override
	public Atributo aplicar(Atributo a) {
		int valorOriginal = 0;
		if(a.getNombre().equals(this.nombreAtributo)) {
			valorOriginal = a.getValor()*valor;
		}
		return new Atributo(a.getNombre(), valorOriginal);					
	}


	@Override
	public int getValorResultante(int valor) {
		return valor*5000;
	}
}
