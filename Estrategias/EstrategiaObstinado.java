package Estrategias;

import java.util.ArrayList;

import TPE.Atributo;
import TPE.Carta;

public class EstrategiaObstinado extends Estrategia {
	private String nombreAtributo;

	public EstrategiaObstinado(String nombre, String nombreAtributo) {
		super(nombre);
		this.nombreAtributo = nombreAtributo;
	}

	@Override
	public String obtenerEstrategia(Carta ca) {
		String atributoSelecionado = this.nombreAtributo;
		return atributoSelecionado;
	}

}
