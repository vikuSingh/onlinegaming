package com.integra.onlinegaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.integra.onlinegaming.dto.CartRequestDto;
import com.integra.onlinegaming.service.CartService;

@Controller
@RequestMapping(value = "/cart")
public class CartController {

	@Autowired
	private CartService cartDetailsService;

	public ResponseEntity<CartRequestDto> save(@ModelAttribute CartRequestDto cartDetailsRequestDto) {

		if (cartDetailsRequestDto != null) {
			cartDetailsService.persist(cartDetailsRequestDto);
			return new ResponseEntity<CartRequestDto>(HttpStatus.OK);
		}
		return new ResponseEntity<CartRequestDto>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
