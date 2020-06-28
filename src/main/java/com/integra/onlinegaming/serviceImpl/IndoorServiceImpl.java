package com.integra.onlinegaming.serviceImpl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integra.onlinegaming.dao.IndoorDao;
import com.integra.onlinegaming.dto.IndoorRequestDto;
import com.integra.onlinegaming.model.Indoor;
import com.integra.onlinegaming.service.IndoorService;


@Service
@Transactional
public class IndoorServiceImpl implements IndoorService {

	@Autowired
	private IndoorDao indoorDetailsDao;

	public Integer persist(IndoorRequestDto indoorDetailsRequestDto) {

		Indoor indoorDetails = new Indoor();
		indoorDetails.setIndoorgamesid(indoorDetailsRequestDto.getIndoorgamesid());
		indoorDetails.setIndoorGamesNames(indoorDetailsRequestDto.getIndoorGamesNames());
		indoorDetails.setCostFor1Hr(indoorDetailsRequestDto.getCostFor1Hr());
		indoorDetails.setCostFor2Hr(indoorDetailsRequestDto.getCostFor2Hr());
		indoorDetails.setCostFor3Hr(indoorDetailsRequestDto.getCostFor3Hr());
		indoorDetails.setCostFor4Hr(indoorDetailsRequestDto.getCostFor4Hr());
		indoorDetails.setCostForFullDay(indoorDetailsRequestDto.getCostForfullDay());

		Serializable serializable = null;
		if (indoorDetails != null) {

			serializable = indoorDetailsDao.save(indoorDetails);

		}
		return serializable.hashCode();

	}


}
