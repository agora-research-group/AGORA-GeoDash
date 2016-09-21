package br.usp.icmc.agora.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Decision {

	@Id
	private String id;

	@Indexed
	private String title;

	@Indexed
	private String description;

	@DBRef
	private List<InformationRequirement> infReqs;

	public List<InformationRequirement> getInfReqs() {
		return infReqs;
	}

	public void setInfReqs(List<InformationRequirement> infReqs) {
		this.infReqs = infReqs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
