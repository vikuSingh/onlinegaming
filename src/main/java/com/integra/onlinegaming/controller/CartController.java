package com.integra.onlinegaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.integra.onlinegaming.dto.CartRequestDto;
import com.integra.onlinegaming.service.CartService;


@RestController
@CrossOrigin(origins ="*")
@RequestMapping(value="/cart")
public class CartController {

	@Autowired
	private CartService cartDetailsService;

	@RequestMapping(value="/save", method = RequestMethod.POST)
	public ResponseEntity<CartRequestDto> save(@RequestBody CartRequestDto cartDetailsRequestDto) {

		if (cartDetailsRequestDto != null) {
			cartDetailsService.persist(cartDetailsRequestDto);
			return new ResponseEntity<CartRequestDto>(HttpStatus.OK);
		}
		return new ResponseEntity<CartRequestDto>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
