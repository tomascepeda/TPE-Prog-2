package Pocimas;

import TPE.Atributo;
import TPE.Carta;

public abstract class Pocima {
	private String nombre;
	
	
	
	public Pocima(String nombre) {
		this.nombre = nombre;
	}
	
	
	public abstract void aplicar(Atributo a);
	
	
	

}
