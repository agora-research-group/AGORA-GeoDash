package br.usp.icmc.agora.domain;

public class Result {
	
	private String uom;
	private Double value;
	
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Result [uom=" + uom + ", value=" + value + "]";
	}
	
}
