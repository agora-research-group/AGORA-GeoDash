package br.usp.icmc.agora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usp.icmc.agora.domain.DescribeSensorResponse;
import br.usp.icmc.agora.domain.GetFeatureOfInterestResponse;
import br.usp.icmc.agora.domain.GetObservationByIdResponse;
import br.usp.icmc.agora.domain.GetObservationResponse;
import br.usp.icmc.agora.repository.SosRepository;
import br.usp.icmc.agora.utils.Common;

@Service
public class SosService {

	@Autowired
	private SosRepository sosRepository;
	
	public DescribeSensorResponse describeSensor(String json){
		
		return (DescribeSensorResponse) Common.jsonToObject(sosRepository.request(json), DescribeSensorResponse.class);
	}
	
	public GetFeatureOfInterestResponse getFeatureOfInterest(String json) {
		
		return (GetFeatureOfInterestResponse) Common.jsonToObject(sosRepository.request(json), GetFeatureOfInterestResponse.class);
	}
	
	public GetObservationByIdResponse getObservationById(String json) {
		
		return (GetObservationByIdResponse) Common.jsonToObject(sosRepository.request(json), GetObservationByIdResponse.class);
	}
	
	public GetObservationResponse getObservation(String json) {
		
		return (GetObservationResponse) Common.jsonToObject(sosRepository.request(json), GetObservationResponse.class);
	}
	
	/*public GetCapabilitiesResponse getCapabilities(String json) {
		
		return (GetCapabilitiesResponse) Common.jsonToObject(sosRepository.request(json), GetCapabilitiesResponse.class);
	}*/
	
	/*public static void main(String[] args) {
		
		SosService sos = new SosService();
		
		System.out.println(sos.getFeatureOfInterest(Common.readJson("getFeatureOfInterest.json").toString()));
	}*/
}