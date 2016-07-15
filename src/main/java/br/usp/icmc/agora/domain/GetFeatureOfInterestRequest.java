package br.usp.icmc.agora.domain;

public class GetFeatureOfInterestRequest {
	
	private String request;
	private String version;
	private String service;
	
	private String featureOfInterest;
	private String observedProperty;
	private String procedure;
	
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
	public String getFeatureOfInterest() {
		return featureOfInterest;
	}
	public void setFeatureOfInterest(String featureOfInterest) {
		this.featureOfInterest = featureOfInterest;
	}
	public String getObservedProperty() {
		return observedProperty;
	}
	public void setObservedProperty(String observedProperty) {
		this.observedProperty = observedProperty;
	}
	public String getProcedure() {
		return procedure;
	}
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
	
	@Override
	public String toString() {
		return "GetFeatureOfInterestRequest [request=" + request + ", version=" + version + ", service=" + service
				+ ", featureOfInterest=" + featureOfInterest + ", observedProperty=" + observedProperty + ", procedure="
				+ procedure + "]";
	}
}
