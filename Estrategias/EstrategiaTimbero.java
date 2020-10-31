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
		
		atributos.addAll(ca.getAtributos()); // guardo todos los atributos 
		//System.out.println(atributos.size());
		
		//System.out.println(atributos.get(0).getNombre());
		
		
		int max = atributos.size()-1; // no se pasa del rango
		int min = 0;
		int range = max - min + 1;
		
		
		
		int atributoRamdon = (int) (Math.random()* range)+min; // hay que ver si no se bugea
		//System.out.println("Salio el numero ramdon:"+atributoRamdon+"Y la longitud del arreglo es"+atributos.size());
		//System.out.println(atributos.get(atributoRamdon).getNombre());
		return atributos.get(atributoRamdon).getNombre();
	}

}
