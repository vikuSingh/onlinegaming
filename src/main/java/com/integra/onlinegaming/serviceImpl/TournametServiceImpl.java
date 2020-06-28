package com.integra.onlinegaming.serviceImpl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integra.onlinegaming.dao.TournamentDao;
import com.integra.onlinegaming.dto.TournamentRequestDto;

import com.integra.onlinegaming.model.Tournament;
import com.integra.onlinegaming.service.TournamentService;



@Service
@Transactional
public class TournametServiceImpl implements TournamentService {

	@Autowired
	private TournamentDao tournamentDetailsDao;
	
	public Integer persist(TournamentRequestDto tournamentDetailsRequestDto) {

	Tournament tournamentDetails = new Tournament();
	
	
	tournamentDetails.setEventName(tournamentDetailsRequestDto.getEventName());
	tournamentDetails.setEntryAmount(tournamentDetailsRequestDto.getEntryAmount());
	tournamentDetails.setGameType(tournamentDetailsRequestDto.getGameType());
	tournamentDetails.setGameName(tournamentDetailsRequestDto.getGameName());
	tournamentDetails.setTeams(tournamentDetailsRequestDto.getTeams());
	tournamentDetails.setWinningPrice(tournamentDetailsRequestDto.getWinningPrice());

	Serializable serializable = null;
	if (tournamentDetails != null) {

		serializable = tournamentDetailsDao.save(tournamentDetails);

	}
	return serializable.hashCode();

}

	
}
