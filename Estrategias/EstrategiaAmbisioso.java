package Estrategias;

import java.util.ArrayList;

import TPE.Atributo;
import TPE.Carta;


public class EstrategiaAmbisioso extends Estrategia {
	
	public EstrategiaAmbisioso(String nombre) {
		super(nombre);
	}
	
	@Override
	public String obtenerEstrategia(Carta ca) {
		ArrayList<Atributo> atributos = new ArrayList<Atributo>();
		atributos.addAll(ca.getAtributos());

		String nombreMayor = "";
		int mayor = 0;
		for (Atributo elem : atributos) {
			
		    String nombreAux = elem.getNombre();
			int mayorAux = elem.getValor();
			if(mayorAux>mayor) {
				nombreMayor = nombreAux;
				mayor = mayorAux;
			}
		}
		return nombreMayor;
	}

}
