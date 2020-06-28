package com.integra.onlinegaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TODDLER_GAMES")
public class Toddler {
	
	
	private int toddlerGameNamesid;
	private String toddlerGameNames;
	private int costFor1Hr;
	private int costFor2Hr;
	private int costFor3Hr;
	private int costFor4Hr;
	private int costForFullday;
	
	
	public Toddler() {
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="T_GAME_ID")
	public int getToddlerGameNamesid() {
		return toddlerGameNamesid;
	}

	public void setToddlerGameNamesid(int toddlerGameNamesid) {
		this.toddlerGameNamesid = toddlerGameNamesid;
	}
    
	 @Column(name="T_GAME_NAMES")
	public String getToddlerGameNames() {
		return toddlerGameNames;
	}

	public void setToddlerGameNames(String toddlerGameNames) {
		this.toddlerGameNames = toddlerGameNames;
	}
    
	 @Column(name="COST_FOR_1Hr")
	public int getCostFor1Hr() {
		return costFor1Hr;
	}

	public void setCostFor1Hr(int costFor1Hr) {
		this.costFor1Hr = costFor1Hr;
	}
	 @Column(name="COST_FOR_2Hr")
	public int getCostFor2Hr() {
		return costFor2Hr;
	}

	public void setCostFor2Hr(int costFor2Hr) {
		this.costFor2Hr = costFor2Hr;
	}
	
	 @Column(name="COST_FOR_3Hr")
	public int getCostFor3Hr() {
		return costFor3Hr;
	}

	public void setCostFor3Hr(int costFor3Hr) {
		this.costFor3Hr = costFor3Hr;
	}
    
	 @Column(name="COST_FOR_4Hr")
	public int getCostFor4Hr() {
		return costFor4Hr;
	}

	public void setCostFor4Hr(int costFor4Hr) {
		this.costFor4Hr = costFor4Hr;
	}
	
	 @Column(name="COST_FOR_FULL_DAY")
	public int getCostForFullday() {
		return costForFullday;
	}

	public void setCostForFullday(int costForFullday) {
		this.costForFullday = costForFullday;
	}

	@Override
	public String toString() {
		return "Toddler [toddlerGameNamesid=" + toddlerGameNamesid + ", toddlerGameNames=" + toddlerGameNames
				+ ", costFor1Hr=" + costFor1Hr + ", costFor2Hr=" + costFor2Hr + ", costFor3Hr=" + costFor3Hr
				+ ", costFor4Hr=" + costFor4Hr + ", costForFullday=" + costForFullday + "]";
	}

	
	}

	
	
	
	
	

