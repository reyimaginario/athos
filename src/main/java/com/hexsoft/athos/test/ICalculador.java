package com.hexsoft.athos.test;

import com.hexsoft.athos.entities.RespuestaDAO;
import org.json.simple.JSONObject;

import java.util.List;

public interface ICalculador {
    public JSONObject procesarRespuestas(List<RespuestaDAO> respuestas);
}