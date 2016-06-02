package br.usp.icmc.agora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.usp.icmc.agora.domain.DescribeSensor;
import br.usp.icmc.agora.domain.GetFeatureOfInterest;
import br.usp.icmc.agora.domain.GetObservation;
import br.usp.icmc.agora.domain.GetObservationById;
import br.usp.icmc.agora.service.SosService;
import br.usp.icmc.agora.utils.Common;

@RestController
@RequestMapping("/sos")
@CrossOrigin
public class SosController {

	@Autowired
    private SosService sosService;
	
	@RequestMapping("/describesensor")
    @ResponseBody
    public DescribeSensor describeSensor() {
    	
    	DescribeSensor describeSensor = sosService.describeSensor(
    			Common.readJson("describeSensor.json").toString());
        
        return describeSensor;
    }
	
	@RequestMapping("/getfeatureofinterest")
    @ResponseBody
    public GetFeatureOfInterest getFeatureOfInterest() {
    	
		GetFeatureOfInterest getFeatureOfInterest = sosService.getFeatureOfInterest(
    			Common.readJson("getFeatureOfInterest.json").toString());
        
        return getFeatureOfInterest;
    }

    @RequestMapping("/getobservationbyid")
    @ResponseBody
    public GetObservationById getObservationById() {
    	
    	GetObservationById getObservationById = sosService.getObservationById(
    			Common.readJson("getObservationById.json").toString());
        
        return getObservationById;
    }
    
    @RequestMapping("/getobservation")
    @ResponseBody
    public GetObservation getObservation() {
    	
    	GetObservation getObservation = sosService.getObservation(
    			Common.readJson("getObservation.json").toString());
        
        return getObservation;
    }

    /*@RequestMapping(method = RequestMethod.POST, value = "/world")
    public void post(HelloWorld helloWorld) {
        helloService.save(helloWorld);
    }*/
}
