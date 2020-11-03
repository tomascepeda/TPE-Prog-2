package Juego;

import java.util.ArrayList;
import Pocimas.Pocima;

public class Carta {
	
	private String nombre;
	private ArrayList<Atributo> atributos;
	private Pocima pocima;
	
	public Carta(String nombre) {
		super();
		this.nombre = nombre;
		atributos = new ArrayList<Atributo>();
		this.pocima = null;
	}
	
	public Carta(String nombre, ArrayList<Atributo> atributos, Pocima pocima) {
		this.nombre = nombre;
		this.atributos = atributos;
		this.pocima = pocima;
	}
	
	public void setPocima(Pocima p) {
		this.pocima = p;
	}
	
	public Pocima getPocima() {
		return this.pocima;
	}
	
	public int getValor(String nombreAtributo) {
		int valor = 0;
		for (Atributo atributo : atributos) {
			if(atributo.getNombre().equals(nombreAtributo)) 
				valor = atributo.getValor();
		}
		return valor;
	}
	
	//dado el nombre retorna el objeto
	public Atributo getAtributoObj(String nombreAtributo) {
		for (Atributo i : atributos) {
			if(i.getNombre().equals(nombreAtributo))
				return i;
		}
		return null;
	}

	public void addAtributo(Atributo a) {
		atributos.add(a);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getAtributoNombre(int index) {
		return this.atributos.get(index).getNombre();
	}

	public ArrayList<Atributo> getAtributos(){
		return (ArrayList<Atributo>) atributos.clone();
	}
	
	@Override
	public boolean equals(Object o) {
		ArrayList<Atributo> atributos_aux = ((Carta) o).getAtributos();
		if (this.getNombre().equals(((Carta) o).getNombre()) && this.atributos.containsAll(atributos_aux))
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Carta nombre=" + nombre + ", atributos=" + atributos;
	}
	
	public boolean tieneAtributos(Carta c) {
		ArrayList<String> thisNombreAtributos = new ArrayList<String>();
		for (Atributo i : this.getAtributos()) {
			thisNombreAtributos.add(i.getNombre());
		}
		ArrayList<String> otherNombreAtributos = new ArrayList<String>();
		for (Atributo s : c.getAtributos()) {
			otherNombreAtributos.add(s.getNombre());
		}
		return thisNombreAtributos.containsAll(otherNombreAtributos);
	}
	
	public ArrayList<String> getNombresAtributos(){
		ArrayList<String> aux = new ArrayList<String>();
		for (Atributo i : atributos) {
			aux.add(i.getNombre());
		}
		return aux;
	}
	
}//class
