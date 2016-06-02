package br.usp.icmc.agora.domain;

import java.util.Arrays;

public class GetFeatureOfInterest {
	
	private String request;
	private String version;
	private String service;
	private FeatureOfInterest[] featureOfInterest;
		
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

	public FeatureOfInterest[] getFeatureOfInterest() {
		return featureOfInterest;
	}

	public void setFeatureOfInterest(FeatureOfInterest[] featureOfInterest) {
		this.featureOfInterest = featureOfInterest;
	}

	@Override
	public String toString() {
		return "GetFeatureOfInterest [request=" + request + ", version=" + version + ", service=" + service
				+ ", featureOfInterest=" + Arrays.toString(featureOfInterest) + "]";
	}
}
