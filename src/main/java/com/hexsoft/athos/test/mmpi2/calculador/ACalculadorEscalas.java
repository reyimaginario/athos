package com.hexsoft.athos.test.mmpi2.calculador;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;

public abstract class ACalculadorEscalas {
	
	protected List<CalculadorSubescalas> subescalas;
	
	public JSONArray construirEscalas(JSONObject respuestasAProcesar) {
		JSONArray escalasBasicas = new JSONArray();
		for (CalculadorSubescalas calculadorSubescala : subescalas) {
			escalasBasicas.add(calculadorSubescala.getPuntajes(respuestasAProcesar));
		}
		return escalasBasicas;
	};
}
