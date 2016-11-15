package br.usp.icmc.agora.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.usp.icmc.agora.domain.Observation;
import br.usp.icmc.agora.domain.ObservationRequest;
import br.usp.icmc.agora.domain.Sensor;
import br.usp.icmc.agora.utils.Common;

@RestController
@RequestMapping("/sensor")
public class SensorController {

	@RequestMapping(value = "/find", method = RequestMethod.POST)
	@ResponseBody
	public Sensor find(@RequestBody String id) {
		String[] aux = id.split("\\.");
		return Common.jsonToObject((Common.httpPost(aux[1], "application/json",
				"http://localhost:8081/AGORA-SpatialDataService/station/find")), Sensor.class);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/listProperty", method = RequestMethod.POST)
	@ResponseBody
	public List<Sensor> listProperty(@RequestBody String id) {
		try {
			ObjectMapper mapper = new ObjectMapper();

			String[] aux = id.split("\\.");
			String response = Common.httpPost(aux[1], "application/json",
					"http://localhost:8081/AGORA-SpatialDataService/station/listProperty");

			return mapper.readValue(response, List.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	@RequestMapping(value = "/getObservation", method = RequestMethod.POST)
	@ResponseBody
	public List<Observation> getObservation(@RequestBody ObservationRequest obs) {
		try {
			String[] aux = obs.getsDate().split("T");
			obs.setsDate(aux[0] + " 00:00:01");
			
			String[] aux1 = obs.geteDate().split("T");
			obs.seteDate(aux1[0] + " 23:59:01");
			
			System.out.println(obs.getId());
			System.out.println(obs.getsDate());
			System.out.println(obs.geteDate());
			
//			obs.seteDate(obs.geteDate().replace("T", " "));
//			obs.setsDate(obs.getsDate().replace("T", " "));
			
			ObjectMapper mapper = new ObjectMapper();
			List<Observation> arr = new ArrayList<Observation>();

			String jsonInString = mapper.writeValueAsString(obs);
			System.out.println(jsonInString);
			String response = Common.httpPost(jsonInString, "application/json",
					"http://localhost:8081/AGORA-SpatialDataService/observation/listByStation");

			JSONObject jsnobject = new JSONObject(response.replace("[", "{\"observations\": [").replace("]", "]}"));

			JSONArray jsonArray = jsnobject.getJSONArray("observations");
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject explrObject = jsonArray.getJSONObject(i);
				Observation obsAux = Common.jsonToObject(explrObject.toString(), Observation.class);
				arr.add(obsAux);
				System.out.println(explrObject);
			}

			System.out.println(arr.size());

			return arr;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

//	public static void main(String[] args) {
//		try {
//			ObjectMapper mapper = new ObjectMapper();
//			ObservationRequest obs = new ObservationRequest();
//			List<Observation> arr = new ArrayList<Observation>();
//
//			obs.setId("432170906H");
//			obs.setsDate("2016-11-14T00:00:00.000Z");
//			obs.seteDate("2016-11-14T23:00:00.000Z");
//
//			String[] aux = ("2016-11-14T00:00:00.000Z").split("T");
//			obs.setsDate(aux[0] + " 00:00:01");
//			
//			String[] aux1 = ("2016-11-14T00:00:00.000Z").split("T");
//			obs.seteDate(aux1[0] + " 23:59:01");
//			
//			String jsonInString = mapper.writeValueAsString(obs);
//			String response = Common.httpPost(jsonInString, "application/json",
//					"http://localhost:8081/AGORA-SpatialDataService/observation/listByStation");
//
//			JSONObject jsnobject = new JSONObject(response.replace("[", "{\"observations\": [").replace("]", "]}"));
//
//			JSONArray jsonArray = jsnobject.getJSONArray("observations");
//			for (int i = 0; i < jsonArray.length(); i++) {
//				JSONObject explrObject = jsonArray.getJSONObject(i);
//				Observation obsAux = Common.jsonToObject(explrObject.toString(), Observation.class);
//				arr.add(obsAux);
//				System.out.println(explrObject);
//			}
//
//			System.out.println(arr.size());
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

}