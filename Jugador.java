package TPE;

import java.util.ArrayList;

public class Jugador {
	
	private String nombre;
	private Mazo mazo;
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void asignarMazo(Mazo m) {
		if (mazo == null)
			mazo = m;
	}
	
	public Atributo selectAtributo() {
		int cant = mazo.getCarta().getAtributos().size();
		int random = (int) Math.floor((Math.random()*cant) + 1);
		return mazo.getCarta().getAtributos().get(random);
	}

}
