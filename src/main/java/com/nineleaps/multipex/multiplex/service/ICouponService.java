package com.nineleaps.multipex.multiplex.service;

import java.util.List;
import java.util.Optional;

import com.nineleaps.multipex.multiplex.entity.Coupon;



public interface ICouponService {

	public List<Coupon> getAllCoupon();

	public Coupon saveCoupon(Coupon coupon);

	public List<Coupon> getCouponById(Long coupon);

	public Coupon updateCoupon(Coupon coupon,Long cid);

	public void deleteCouponById(Long couponId);

	


}
