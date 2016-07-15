package br.usp.icmc.agora.domain;

public class DescribeSensorRequest {

	private String request;
	private String service;
	private String version;
	
	private String procedure;
	private String procedureDescriptionFormat;
	
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
	public String getProcedure() {
		return procedure;
	}
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
	public String getProcedureDescriptionFormat() {
		return procedureDescriptionFormat;
	}
	public void setProcedureDescriptionFormat(String procedureDescriptionFormat) {
		this.procedureDescriptionFormat = procedureDescriptionFormat;
	}
	
	@Override
	public String toString() {
		return "DescribeSensorRequest [request=" + request + ", version=" + version + ", service=" + service
				+ ", procedure=" + procedure + ", procedureDescriptionFormat=" + procedureDescriptionFormat + "]";
	}
}
