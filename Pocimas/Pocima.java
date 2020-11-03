package Pocimas;

import Juego.Atributo;

public abstract class Pocima {
	
	private String nombre;
	protected boolean aplicada = false;
	
	public Pocima(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean isAplicada() {
		return aplicada;
	}
	
	public void fueUsada() {
		this.aplicada = true;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract int getValorResultante(Atributo a);
	
}
