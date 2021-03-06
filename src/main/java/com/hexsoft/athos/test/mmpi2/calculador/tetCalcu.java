package com.hexsoft.athos.test.mmpi2.calculador;

import com.hexsoft.athos.services.BaremoService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class tetCalcu {

	public static void main(String[] args) throws Exception {
		JSONArray respuestasJSON = (JSONArray) readJsonSimpleDemo("src\\main\\java\\com\\hexsoft\\athos\\test\\mmpi2\\calculador\\prueba.json");
		BaremoService service = new BaremoService();
		/*TestMMPI2 test = (TestMMPI2) TestService.getInstance().obtenerTest(ConstantestServicioTest.CODIGO_TEST_MMPI2);
		CalculadorMMPI2 calcu = new CalculadorMMPI2();
		System.out.println(calcu.construirEscalas(respuestasJSON));*/

    }

	public static JSONArray obtenerRtasTemporalesDAO() throws Exception {
		JSONObject respuestasJSON = (JSONObject) readJsonSimpleDemo("src\\main\\java\\com\\hexsoft\\athos\\test\\mmpi2\\calculador\\respuestas.json");
		Boolean exit = Boolean.FALSE;
		JSONArray rtas = new JSONArray();
		for (Integer i = 1; exit == Boolean.FALSE; i++) {
			String value = (String) respuestasJSON.get(i.toString());
			if (value != null) {
				JSONObject rta = new JSONObject();
				rta.put("evaluacionId", 1);
				rta.put("testCode", "mmpi2");
				rta.put("pregiunta", i);
				rta.put("respuesta", decode(value));
				rtas.add(rta);
			} else {
				exit = Boolean.TRUE;
			}
		}
		return rtas;
	}

	private static Integer decode(String value) {
		Integer result = null;
		switch (value) {
			case "True":
				result = 1;
				break;
			case "False":
				result = 0;
				break;
			case "Null":
				result = -1;
				break;
		}
		return result;
	}

	public static Object readJsonSimpleDemo(String filename) throws Exception {
	    FileReader reader = new FileReader(filename);
	    JSONParser jsonParser = new JSONParser();
	    return jsonParser.parse(reader);
	}
}