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
	private int gameType;
	private int gameName;
	private int teams;
    private int winningPrice;
	
	
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
	public int getGameType() {
		return gameType;
	}


	public void setGameType(int gameType) {
		this.gameType = gameType;
	}

	 @Column(name="GAME_NAMES")
	public int getGameName() {
		return gameName;
	}


	public void setGameName(int gameName) {
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
	public int getWinningPrice() {
		return winningPrice;
	}


	public void setWinningPrice(int winningPrice) {
		this.winningPrice = winningPrice;
	}


	@Override
	public String toString() {
		return "Tournament [eventNameid=" + eventId + ", eventName=" + eventName + ", entryAmount=" + entryAmount
				+ ", gameType=" + gameType + ", gameName=" + gameName + ", teams=" + teams + ", winningPrice="
				+ winningPrice + "]";
	}
	
	
	
	
	
	

}
