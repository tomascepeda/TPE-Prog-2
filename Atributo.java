package TPE;

import Pocimas.Pocima;

public class Atributo{
	
	private String nombre;
	private int valor;
	
	public Atributo(String nombre, int valor) {
		super();
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void aplicarPocima(Pocima p) {
		p.aplicar(this);
	}
	
	
	@Override
	public String toString() {
		return "Atributo nombre=" + nombre + ", valor=" + valor;
	}
}
