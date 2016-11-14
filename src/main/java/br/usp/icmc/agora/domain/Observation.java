package br.usp.icmc.agora.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Observation {

	@Id
	private String stationId;

	private Date datetime;

	private String date;

	private String time;

	private String state;

	private String city;

	private Double measure;

	private Double moffset;

	private String coordinates;

	public Double getMoffset() {
		return moffset;
	}

	public void setMoffset(Double moffset) {
		this.moffset = moffset;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getMeasure() {
		return measure;
	}

	public void setMeasure(Double measure) {
		this.measure = measure;
	}

}
