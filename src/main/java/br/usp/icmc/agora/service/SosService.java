package br.usp.icmc.agora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usp.icmc.agora.domain.DescribeSensor;
import br.usp.icmc.agora.domain.GetFeatureOfInterest;
import br.usp.icmc.agora.domain.GetObservation;
import br.usp.icmc.agora.domain.GetObservationById;
import br.usp.icmc.agora.repository.SosRepository;
import br.usp.icmc.agora.utils.Common;

@Service
public class SosService {

	@Autowired
	private SosRepository sosRepository;
	
	public DescribeSensor describeSensor(String json){
		
		return (DescribeSensor) Common.jsonToObject(sosRepository.request(json), DescribeSensor.class);
	}
	
	public GetFeatureOfInterest getFeatureOfInterest(String json) {
		
		return (GetFeatureOfInterest) Common.jsonToObject(sosRepository.request(json), GetFeatureOfInterest.class);
	}
	
	public GetObservationById getObservationById(String json) {
		
		return (GetObservationById) Common.jsonToObject(sosRepository.request(json), GetObservationById.class);
	}
	
	public GetObservation getObservation(String json) {
		
		return (GetObservation) Common.jsonToObject(sosRepository.request(json), GetObservation.class);
	}
	
	/*public GetCapabilities getCapabilities(String json) {
		
		return (GetCapabilities) Common.jsonToObject(sosRepository.request(json), GetCapabilities.class);
	}*/
	
	/*public static void main(String[] args) {
		
		SosService sos = new SosService();
		
		System.out.println(sos.getFeatureOfInterest(Common.readJson("getFeatureOfInterest.json").toString()));
	}*/
}