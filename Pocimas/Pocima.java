package Pocimas;

import TPE.Atributo;
import TPE.Carta;

public abstract class Pocima {
	private String nombre;
	
	
	
	public Pocima(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract Atributo aplicar(Atributo a);
	public abstract int getValorResultante(int valor);
	
	

}
