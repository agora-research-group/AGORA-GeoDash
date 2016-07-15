package br.usp.icmc.agora.domain;

import java.util.Arrays;

public class GetObservationByIdRequest {

	private String request;
	private String version;
	private String service;
	private String[] observation;	
	
	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String[] getObservation() {
		return observation;
	}

	public void setObservation(String[] observation) {
		this.observation = observation;
	}
	
	@Override
	public String toString() {
		return "GetObservationById [request=" + request + ", version=" + version + ", service=" + service
				+ ", observation=" + Arrays.toString(observation) + "]";
	}
}
