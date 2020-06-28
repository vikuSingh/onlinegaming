package com.integra.onlinegaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.integra.onlinegaming.dto.TournamentRequestDto;
import com.integra.onlinegaming.service.TournamentService;

    @RestController
    @CrossOrigin(origins="*")
	public class TournametController {

		@Autowired
		private TournamentService tournamentDetailsService;

		public ResponseEntity<TournamentRequestDto> save(@ModelAttribute TournamentRequestDto tournamentDetailsRequestDto) {

			if (tournamentDetailsRequestDto != null) {
				tournamentDetailsService.persist(tournamentDetailsRequestDto);
				return new ResponseEntity<TournamentRequestDto>(HttpStatus.OK);
			}
			return new ResponseEntity<TournamentRequestDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
