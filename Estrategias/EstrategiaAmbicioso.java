package Estrategias;

import java.util.ArrayList;

import Juego.Atributo;
import Juego.Carta;


public class EstrategiaAmbicioso extends Estrategia {
	
	public EstrategiaAmbicioso(String nombre) {
		super(nombre);
	}
	
	@Override
	public String obtenerEstrategia(Carta ca) {
		ArrayList<String> nombresAtributos = new ArrayList<String>();
		nombresAtributos.addAll(ca.getNombresAtributos());
		String nombreMayor = "";
		int mayor = -9999;
		for (String elem : nombresAtributos) {
		    String nombreAux = elem;
			int mayorAux = ca.getValor(elem);
			if(mayorAux>mayor) {
				nombreMayor = nombreAux;
				mayor = mayorAux;
			}
		}
		if(nombreMayor.isEmpty()) {
			System.out.println(ca.getNombre());
			System.out.println(ca.getAtributos().toString());
			System.out.println("ME ROMPI NOOOOOOOO");
		}
		return nombreMayor;
	}

}
