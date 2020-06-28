package com.integra.onlinegaming.dto;

public class IndoorRequestDto {
	
	private int indoorgamesid;
	private String indoorGamesNames;
	private int costFor1Hr;
	private int costFor2Hr;
	private int costFor3Hr;
	private int costFor4Hr;
	private int costForfullDay;
	
	public IndoorRequestDto() {
		
	}

	public int getIndoorgamesid() {
		return indoorgamesid;
	}

	public void setIndoorgamesid(int indoorgamesid) {
		this.indoorgamesid = indoorgamesid;
	}

	public String getIndoorGamesNames() {
		return indoorGamesNames;
	}

	public void setIndoorGamesNames(String indoorGamesNames) {
		this.indoorGamesNames = indoorGamesNames;
	}

	public int getCostFor1Hr() {
		return costFor1Hr;
	}

	public void setCostFor1Hr(int costFor1Hr) {
		this.costFor1Hr = costFor1Hr;
	}

	public int getCostFor2Hr() {
		return costFor2Hr;
	}

	public void setCostFor2Hr(int costFor2Hr) {
		this.costFor2Hr = costFor2Hr;
	}

	public int getCostFor3Hr() {
		return costFor3Hr;
	}

	public void setCostFor3Hr(int costFor3Hr) {
		this.costFor3Hr = costFor3Hr;
	}

	public int getCostFor4Hr() {
		return costFor4Hr;
	}

	public void setCostFor4Hr(int costFor4Hr) {
		this.costFor4Hr = costFor4Hr;
	}

	public int getCostForfullDay() {
		return costForfullDay;
	}

	public void setCostForfullDay(int costForfullDay) {
		this.costForfullDay = costForfullDay;
	}

	@Override
	public String toString() {
		return "IndoorRequestDto [indoorgamesid=" + indoorgamesid + ", indoorGamesNames=" + indoorGamesNames
				+ ", costFor1Hr=" + costFor1Hr + ", costFor2Hr=" + costFor2Hr + ", costFor3Hr=" + costFor3Hr
				+ ", costFor4Hr=" + costFor4Hr + ", costForfullDay=" + costForfullDay + "]";
	}

	
	
	
	
	}

