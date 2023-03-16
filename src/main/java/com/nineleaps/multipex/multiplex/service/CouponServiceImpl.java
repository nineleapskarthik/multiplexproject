package com.nineleaps.multipex.multiplex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.multipex.multiplex.entity.Coupon;
import com.nineleaps.multipex.multiplex.repository.CouponRepository;
@Service
public class CouponServiceImpl implements ICouponService {
	
	@Autowired
	private CouponRepository couponRepository;

	@Override
	public List<Coupon> getAllCoupon() {
		// TODO Auto-generated method stub
		return couponRepository.findAll();
	}

	@Override
	public Coupon saveCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		return couponRepository.save(coupon);
	}

	@Override
	public List<Coupon> getCouponById(Long coupon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coupon updateCoupon(Coupon coupon, Long cid) {
		// TODO Auto-generated method stub
		return couponRepository.save(coupon);
	}

	@Override
	public void deleteCouponById(Long couponId) {
		// TODO Auto-generated method stub
		
	}

	


}
