package br.usp.icmc.agora.domain;

public class DescribeSensor {
	
	private String request;
	private String version;
	private String service;
	private String procedureDescriptionFormat;
	private ProcedureDescription procedureDescription;
	
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
	public String getProcedureDescriptionFormat() {
		return procedureDescriptionFormat;
	}
	public void setProcedureDescriptionFormat(String procedureDescriptionFormat) {
		this.procedureDescriptionFormat = procedureDescriptionFormat;
	}
	public ProcedureDescription getProcedureDescription() {
		return procedureDescription;
	}
	public void setProcedureDescription(ProcedureDescription procedureDescription) {
		this.procedureDescription = procedureDescription;
	}
	
	@Override
	public String toString() {
		return "DescribeSensor [request=" + request + ", version=" + version + ", service=" + service
				+ ", procedureDescriptionFormat=" + procedureDescriptionFormat + ", procedureDescription="
				+ procedureDescription + "]";
	}
	
}
