package br.usp.icmc.agora.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.usp.icmc.agora.domain.DescribeSensorRequest;
import br.usp.icmc.agora.domain.DescribeSensorResponse;
import br.usp.icmc.agora.domain.GetFeatureOfInterestRequest;
import br.usp.icmc.agora.domain.GetFeatureOfInterestResponse;
import br.usp.icmc.agora.domain.GetObservationByIdRequest;
import br.usp.icmc.agora.domain.GetObservationByIdResponse;
import br.usp.icmc.agora.domain.GetObservationRequest;
import br.usp.icmc.agora.domain.GetObservationResponse;
import br.usp.icmc.agora.service.SosService;

@RestController
@RequestMapping("/sos")
public class SosController {

	@Autowired
	private SosService sosService;

	@RequestMapping(method = RequestMethod.POST, value = "/describesensor")
	@ResponseBody
	public DescribeSensorResponse describeSensor(@RequestBody DescribeSensorRequest request) {

		DescribeSensorResponse response = sosService.describeSensor((new JSONObject(request)).toString());

		return response;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/getfeatureofinterest")
	@ResponseBody
	public GetFeatureOfInterestResponse getFeatureOfInterest(@RequestBody GetFeatureOfInterestRequest request) {

		GetFeatureOfInterestResponse response = sosService.getFeatureOfInterest((new JSONObject(request)).toString());

		return response;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/getobservationbyid")
	@ResponseBody
	public GetObservationByIdResponse getObservationById(@RequestBody GetObservationByIdRequest request) {

		GetObservationByIdResponse response = sosService.getObservationById((new JSONObject(request)).toString());

		return response;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/getobservation")
	@ResponseBody
	public GetObservationResponse getObservation(@RequestBody GetObservationRequest request) {

		GetObservationResponse response = sosService.getObservation((new JSONObject(request)).toString());

		return response;
	}
}
