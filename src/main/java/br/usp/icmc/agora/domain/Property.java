package br.usp.icmc.agora.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Property {

	@Id
	public String id;

	@Indexed
	public Double value;

	@Indexed
	public Double refValue;

	@Indexed
	public String featureId;

	@Indexed
	public String propertyId;

	@DBRef
	private InformationRequirement infoReq;

	public String getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getRefValue() {
		return refValue;
	}

	public void setRefValue(Double refValue) {
		this.refValue = refValue;
	}

	public String getFeatureId() {
		return featureId;
	}

	public void setFeatureId(String featureId) {
		this.featureId = featureId;
	}

	public InformationRequirement getInfoReq() {
		return infoReq;
	}

	public void setInfoReq(InformationRequirement infoReq) {
		this.infoReq = infoReq;
	}

}
