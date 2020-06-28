package com.integra.onlinegaming.dto;

public class TournamentRequestDto {
	
	private int eventNameid;
	private String eventName;
	private int entryAmount;
	private int gameType;
	private int gameName;
	private int teams;
	private int winningPrice;
	
	
	public TournamentRequestDto() {
		
	}


	public int getEventNameid() {
		return eventNameid;
	}


	public void setEventNameid(int eventNameid) {
		this.eventNameid = eventNameid;
	}


	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public int getEntryAmount() {
		return entryAmount;
	}


	public void setEntryAmount(int entryAmount) {
		this.entryAmount = entryAmount;
	}


	public int getGameType() {
		return gameType;
	}


	public void setGameType(int gameType) {
		this.gameType = gameType;
	}


	public int getGameName() {
		return gameName;
	}


	public void setGameName(int gameName) {
		this.gameName = gameName;
	}


	public int getTeams() {
		return teams;
	}


	public void setTeams(int teams) {
		this.teams = teams;
	}


	public int getWinningPrice() {
		return winningPrice;
	}


	public void setWinningPrice(int winningPrice) {
		this.winningPrice = winningPrice;
	}


	@Override
	public String toString() {
		return "TournamentRequestDto [eventNameid=" + eventNameid + ", eventName=" + eventName + ", entryAmount="
				+ entryAmount + ", gameType=" + gameType + ", gameName=" + gameName + ", teams=" + teams
				+ ", winningPrice=" + winningPrice + "]";
	}


	
	
	
	

}
