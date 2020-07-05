package com.integra.onlinegaming.service;

import com.integra.onlinegaming.dto.CartRequestDto;

public interface CartService {
	
	public int persist(CartRequestDto cartDetailsRequestDto);

}
