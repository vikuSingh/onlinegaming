package com.integra.onlinegaming.service;

import java.util.List;

import com.integra.onlinegaming.dto.ContactRequestDto;


public interface ContactService {
	
public Integer persist(ContactRequestDto contactRequestDto);
	
public List<ContactRequestDto> getDeatils();
}
