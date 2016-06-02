package br.usp.icmc.agora.domain;

public class FeatureOfInterest {
	
	private Identifier identifier;
	private String sampledFeature;
	private Geometry geometry;
	
	public Identifier getIdentifier() {
		return identifier;
	}
	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	public String getSampledFeature() {
		return sampledFeature;
	}
	public void setSampledFeature(String sampledFeature) {
		this.sampledFeature = sampledFeature;
	}
}
