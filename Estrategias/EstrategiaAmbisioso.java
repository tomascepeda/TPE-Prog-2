package Estrategias;

import java.util.ArrayList;

import TPE.Atributo;
import TPE.Carta;


public class EstrategiaAmbisioso extends Estrategia {
	
	public EstrategiaAmbisioso(String nombre) {
		super(nombre);
	}
	
	
	/*
	 * Metodo testing
	 */
	private void MayorCarta(ArrayList<Atributo> atributos) {
		String nombre = "";
		int valor = 0;
		for (int i = 0; i < atributos.size(); i++) {
			String nombre2 = atributos.get(i).getNombre();
			int valor2 = atributos.get(i).getValor();
			if(valor2>valor) {
				valor = valor2;
				nombre = atributos.get(i).getNombre();
			}
		}
		System.out.println("El mayor atributo de la carta es :"+nombre+" Valor :"+valor);
	}
	
	
	

	@Override
	public String obtenerEstrategia(Carta ca) {
		
		ArrayList<Atributo> atributos = new ArrayList<>();
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
		//this.MayorCarta(atributos);	
		return nombreMayor;
	}

}
