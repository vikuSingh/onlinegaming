package com.integra.onlinegaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TOURNAMENT")
public class Tournament {
	

    private int eventId;
	private String eventName;
	private int entryAmount;
	private String gameType;
	private String gameName;
	private int teams;
    private double winningPrice;
	
	
	public Tournament() {
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="EVENT_NAME_ID")
	public int getEventNameid() {
		return eventId;
	}


	public void setEventNameid(int eventNameid) {
		this.eventId = eventNameid;
	}

	 @Column(name="EVENT_NAME")
	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	 @Column(name="ENTRY_AMOUNT")
	public int getEntryAmount() {
		return entryAmount;
	}


	public void setEntryAmount(int entryAmount) {
		this.entryAmount = entryAmount;
	}

	 @Column(name="GAME_TYPE")
	public String getGameType() {
		return gameType;
	}


	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	 @Column(name="GAME_NAMES")
	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	 @Column(name="TEAMS")
	public int getTeams() {
		return teams;
	}


	public void setTeams(int teams) {
		this.teams = teams;
	}

	 @Column(name="WINNING_PRICE")
	public double getWinningPrice() {
		return winningPrice;
	}


	public void setWinningPrice(double winningPrice) {
		this.winningPrice = winningPrice;
	}


	@Override
	public String toString() {
		return "Tournament [eventNameid=" + eventId + ", eventName=" + eventName + ", entryAmount=" + entryAmount
				+ ", gameType=" + gameType + ", gameName=" + gameName + ", teams=" + teams + ", winningPrice="
				+ winningPrice + "]";
	}
	
	
	
	
	
	

}
