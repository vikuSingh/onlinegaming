package com.integra.onlinegaming.dto;

public class TournamentRequestDto {
	
	private int eventId;
	private String eventName;
	private int entryAmount;
	private String gameType;
	private String gameName;
	private int teams;
    private double winningPrice;
	
	public TournamentRequestDto() {
		
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
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

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getTeams() {
		return teams;
	}

	public void setTeams(int teams) {
		this.teams = teams;
	}

	public double getWinningPrice() {
		return winningPrice;
	}

	public void setWinningPrice(double winningPrice) {
		this.winningPrice = winningPrice;
	}

	@Override
	public String toString() {
		return "TournamentRequestDto [eventId=" + eventId + ", eventName=" + eventName + ", entryAmount=" + entryAmount
				+ ", gameType=" + gameType + ", gameName=" + gameName + ", teams=" + teams + ", winningPrice="
				+ winningPrice + "]";
	}


	
	
	

}
