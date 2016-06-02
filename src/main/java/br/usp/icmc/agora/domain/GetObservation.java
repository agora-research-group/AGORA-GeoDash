package br.usp.icmc.agora.domain;

import java.util.Arrays;

public class GetObservation {
	
	private String request;
	private String version;
	private String service;
	private Observations[] observations;	
	
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

	public Observations[] getObservations() {
		return observations;
	}

	public void setObservations(Observations[] observations) {
		this.observations = observations;
	}
	
	@Override
	public String toString() {
		return "GetObservation [request=" + request + ", version=" + version + ", service=" + service
				+ ", observations=" + Arrays.toString(observations) + "]";
	}

}
