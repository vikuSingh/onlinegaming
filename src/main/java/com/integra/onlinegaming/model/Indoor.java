package com.integra.onlinegaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INDOOR_GAMES")
public class Indoor {
  
  
	private int indoorgamesid;
    private String indoorGamesNames;  
	private int costFor1Hr;	
	private int costFor2Hr;	
	private int costFor3Hr;	
	private int costFor4Hr;
	private int costForFullDay;
	
	public Indoor() {
		
	}
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="INDOOR_GAME_ID")
	public int getIndoorgamesid() {
		return indoorgamesid;
	}
	public void setIndoorgamesid(int indoorgamesid) {
		this.indoorgamesid = indoorgamesid;
	}
	
	@Column(name="INDOOR_GAME_NAMES")
	public String getIndoorGamesNames() {
		return indoorGamesNames;
	}
	public void setIndoorGamesNames(String indoorGamesNames) {
		this.indoorGamesNames = indoorGamesNames;
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
	
	@Column(name="FULL_DAY_COST")
	public int getCostForFullDay() {
		return costForFullDay;
	}
	public void setCostForFullDay(int costForFullDay) {
		this.costForFullDay = costForFullDay;
	}
	@Override
	public String toString() {
		return "Indoor [indoorgamesid=" + indoorgamesid + ", indoorGamesNames=" + indoorGamesNames + ", costFor1Hr="
				+ costFor1Hr + ", costFor2Hr=" + costFor2Hr + ", costFor3Hr=" + costFor3Hr + ", costFor4Hr="
				+ costFor4Hr + ", costForFullDay=" + costForFullDay + "]";
	}
	

	
	
	
	

}
