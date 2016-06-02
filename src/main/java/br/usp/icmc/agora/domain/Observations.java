package br.usp.icmc.agora.domain;

public class Observations {
	
	private String type;
	private Identifier identifier;
	private String procedure;
	private String offering;
	private String observableProperty;
	private FeatureOfInterest featureOfInterest;
	private String phenomenonTime;
	private String resultTime;
	private Result result;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Identifier getIdentifier() {
		return identifier;
	}
	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}
	public String getProcedure() {
		return procedure;
	}
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
	public String getOffering() {
		return offering;
	}
	public void setOffering(String offering) {
		this.offering = offering;
	}
	public String getObservableProperty() {
		return observableProperty;
	}
	public void setObservableProperty(String observableProperty) {
		this.observableProperty = observableProperty;
	}
	public FeatureOfInterest getFeatureOfInterest() {
		return featureOfInterest;
	}
	public void setFeatureOfInterest(FeatureOfInterest featureOfInterest) {
		this.featureOfInterest = featureOfInterest;
	}
	public String getPhenomenonTime() {
		return phenomenonTime;
	}
	public void setPhenomenonTime(String phenomenonTime) {
		this.phenomenonTime = phenomenonTime;
	}
	public String getResultTime() {
		return resultTime;
	}
	public void setResultTime(String resultTime) {
		this.resultTime = resultTime;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "Observations [type=" + type + ", identifier=" + identifier + ", procedure=" + procedure + ", offering="
				+ offering + ", observableProperty=" + observableProperty + ", featureOfInterest=" + featureOfInterest
				+ ", phenomenonTime=" + phenomenonTime + ", resultTime=" + resultTime + ", result=" + result + "]";
	}
	
}
