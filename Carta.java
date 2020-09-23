package TPE;

import java.util.ArrayList;

public class Carta {
	
	private String nombre;
	private ArrayList<Atributo> atributos;
	
	public Carta(String nombre) {
		super();
		this.nombre = nombre;
		atributos = new ArrayList<Atributo>();
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
	
	public boolean equals(Object o) {
		ArrayList<Atributo> atributos_aux = ((Carta) o).getAtributos();
		if (this.getNombre().equals(((Carta) o).getNombre()) && this.atributos.containsAll(atributos_aux))
			return true;
		else
			return false;
	}
	
}//class
