package com.integra.onlinegaming.dto;

public class ToddlerRequestDto {
	
	private int toddlerGameNamesid;
	private String toddlerGameNames;
	private int  costFor1Hr;
	private int  costFor2Hr;
	private int  costFor3Hr;
	private int  costFor4Hr;
	private int costForFllday;
	public ToddlerRequestDto() {
		
	}
	public int getToddlerGameNamesid() {
		return toddlerGameNamesid;
	}
	public void setToddlerGameNamesid(int toddlerGameNamesid) {
		this.toddlerGameNamesid = toddlerGameNamesid;
	}
	public String getToddlerGameNames() {
		return toddlerGameNames;
	}
	public void setToddlerGameNames(String toddlerGameNames) {
		this.toddlerGameNames = toddlerGameNames;
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
	public int getCostForFllday() {
		return costForFllday;
	}
	public void setCostForFllday(int costForFllday) {
		this.costForFllday = costForFllday;
	}
	@Override
	public String toString() {
		return "ToddlerRequestDto [toddlerGameNamesid=" + toddlerGameNamesid + ", toddlerGameNames=" + toddlerGameNames
				+ ", costFor1Hr=" + costFor1Hr + ", costFor2Hr=" + costFor2Hr + ", costFor3Hr=" + costFor3Hr
				+ ", costFor4Hr=" + costFor4Hr + ", costForFllday=" + costForFllday + "]";
	}
	
	
	

}
