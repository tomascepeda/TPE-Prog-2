package TPE;

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
	

	public void setValor(int i) {
		this.atributos.get(i).setValor(i);
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
	
	
	// preguntar si hay que derivar mas.
	
/*
	public void aplicarPocima(Pocima p) {
		this.pocima = p;
		for (Atributo elem : atributos) {
			elem.aplicarPocima(p);
		}
		
		
	}
*/
	
	// Calcula como quedaria el atributo cuando se aplica una pocima.
	// se pasa una copia No el original.
	public Atributo aplicarPocima(Atributo a) {
		Atributo atributo;
		if(pocima != null) {
			atributo = pocima.aplicar(a);
		}else {
			atributo = a;
		}
		return atributo;
	}
	
	
	
	
	
	public int getValor(String nombreAtributo) {
		int valor = 0;
		for (Atributo atributo : atributos) {
			if(atributo.getNombre().equals(nombreAtributo)) // se supone que siempre cumple
				valor = atributo.getValor();
		}
		return valor;
	}
	
	
	
	public void setValorAtributo(int posicion, int valor) {
		this.atributos.get(posicion).getValor();
	}
	
	
	public int getLongitud() {
		return this.atributos.size();
	}
	
	
	// dado el nombre del atributo de su estrategia busca el atributo para selecionarlo.
	public int getAtributo(String nombreAtributo) {
		
		int buscado = 0;
		for (int i = 0; i < atributos.size(); i++) {
			if(atributos.get(i).getNombre().equals(nombreAtributo));
			buscado = atributos.get(i).getValor();			
		}
		return buscado;
	}

	//obj
	public Atributo getAtributoObj(String nombreAtributo) {
	
		int buscado = 0;
		for (int i = 0; i < atributos.size(); i++) {
			if(atributos.get(i).getNombre().equals(nombreAtributo));
			buscado = atributos.get(i).getValor();			
		}
		return atributos.get(buscado);
	}

	
	
	public void addAtributo(Atributo a) {
		atributos.add(a);
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getValor(Atributo a) {
		for (Atributo i : atributos) {
			if(i.getNombre().equals(a.getNombre()))
				return i.getValor();
		}
		return 0;
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
	
}//class
