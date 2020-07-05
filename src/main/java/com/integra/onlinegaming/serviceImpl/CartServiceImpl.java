package com.integra.onlinegaming.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integra.onlinegaming.dao.CartDao;
import com.integra.onlinegaming.dto.CartRequestDto;
import com.integra.onlinegaming.model.Cart;
import com.integra.onlinegaming.service.CartService;

@Service
@Transactional
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartDetailsDao;

	public int persist(CartRequestDto cartDetailsRequestDto) {

		Cart cartDetails = new Cart();
		cartDetails.setItem(cartDetailsRequestDto.getItem());
		cartDetails.setPrice(cartDetailsRequestDto.getPrice());
		cartDetails.setQuantity(cartDetailsRequestDto.getQuantity());
		cartDetails.setCouponCode(cartDetailsRequestDto.getCouponCode());
		cartDetails.setTotal(cartDetailsRequestDto.getTotal());

		int result = 0;
		if (cartDetails != null) {

			result = cartDetailsDao.save(cartDetails);
			 result=1;
		}
		
		return result;
	}

}
