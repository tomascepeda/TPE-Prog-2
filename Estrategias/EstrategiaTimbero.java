package Estrategias;

import java.util.ArrayList;

import TPE.Atributo;
import TPE.Carta;

public class EstrategiaTimbero extends Estrategia {
	
	public EstrategiaTimbero(String nombre) {
		super(nombre);
	}

	@Override
	public String obtenerEstrategia(Carta ca) {
		ArrayList<Atributo> atributos = new ArrayList<>();
		atributos.addAll(ca.getAtributos()); 
		int max = atributos.size()-1; 
		int min = 0;
		int range = max - min + 1;
		int atributoRamdon = (int) (Math.random()* range)+min;
		return atributos.get(atributoRamdon).getNombre();
	}

}
