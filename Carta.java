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
	}
	// preguntar si hay que derivar mas.
	

	public void aplicarPocima(Pocima p) {
		this.pocima = p;
		for (Atributo elem : atributos) {
			elem.aplicarPocima(p);
		}
		
		
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
		/*ArrayList<String> thisNombreAtributos = new ArrayList<String>();
		for (Atributo i : atributos) {	PEDAZO DE BOLUDO AGREGASTE LOS MISMOS ATIBUTOS A LOS 2 ARREGLOS
			thisNombreAtributos.add(i.getNombre());
		}
		ArrayList<String> otherNombreAtributos = new ArrayList<String>();
		for (Atributo i : atributos) {	PEDAZO DE BOLUDO AGREGASTE LOS MISMOS ATIBUTOS A LOS 2 ARREGLOS
			otherNombreAtributos.add(i.getNombre());
		}
		if(thisNombreAtributos.containsAll(otherNombreAtributos))
			return true;
		else
			return false;*/
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
