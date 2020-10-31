package Estrategias;

import TPE.Carta;

public abstract class Estrategia {
	
	private String nombre;
	
	
	
	public Estrategia(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	// metodos abstractos
	
	
	public abstract String obtenerEstrategia(Carta ca);
	
	
	
	
	
}
