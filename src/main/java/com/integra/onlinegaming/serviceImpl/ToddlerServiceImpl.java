package com.integra.onlinegaming.serviceImpl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.integra.onlinegaming.dao.ToddlerDao;
import com.integra.onlinegaming.dto.ToddlerRequestDto;
import com.integra.onlinegaming.model.Toddler;
import com.integra.onlinegaming.service.ToddlerService;


@Service
@Transactional
public class ToddlerServiceImpl implements ToddlerService {
	
	@Autowired
	private ToddlerDao toddlerDetailsDao;
	
	public Integer persist(ToddlerRequestDto toddlerDetailsRequestDto) {

	Toddler toddlerDetails = new Toddler();
	
	toddlerDetails.setToddlerGameNamesid(toddlerDetailsRequestDto.getToddlerGameNamesid());
	toddlerDetails.setToddlerGameNames(toddlerDetailsRequestDto.getToddlerGameNames());
	toddlerDetails.setCostFor1Hr(toddlerDetailsRequestDto.getCostFor1Hr());
	toddlerDetails.setCostFor2Hr(toddlerDetailsRequestDto.getCostFor2Hr());
	toddlerDetails.setCostFor3Hr(toddlerDetailsRequestDto.getCostFor3Hr());
	toddlerDetails.setCostFor4Hr(toddlerDetailsRequestDto.getCostFor4Hr());
	toddlerDetails.setCostForFullday(toddlerDetailsRequestDto.getCostForFllday());

	Serializable serializable = null;
	if (toddlerDetails != null) {

		serializable = toddlerDetailsDao.save(toddlerDetails);

	}
	return serializable.hashCode();

}


}
