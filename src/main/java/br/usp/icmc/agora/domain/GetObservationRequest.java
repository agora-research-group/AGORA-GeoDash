package br.usp.icmc.agora.domain;

public class GetObservationRequest {
	
	private String request;
	private String version;
	private String service;
	
	private String offering;
	private String observedProperty;
	private String featureOfInterest;
	
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
	public String getOffering() {
		return offering;
	}
	public void setOffering(String offering) {
		this.offering = offering;
	}
	public String getObservedProperty() {
		return observedProperty;
	}
	public void setObservedProperty(String observedProperty) {
		this.observedProperty = observedProperty;
	}
	public String getFeatureOfInterest() {
		return featureOfInterest;
	}
	public void setFeatureOfInterest(String featureOfInterest) {
		this.featureOfInterest = featureOfInterest;
	}
	
	@Override
	public String toString() {
		return "GetObservationRequest [request=" + request + ", version=" + version + ", service=" + service
				+ ", offering=" + offering + ", observedProperty=" + observedProperty + ", featureOfInterest="
				+ featureOfInterest + "]";
	}	
}
