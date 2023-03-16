package com.nineleaps.multipex.multiplex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.multipex.multiplex.entity.Coupon;
import com.nineleaps.multipex.multiplex.service.ICouponService;


@CrossOrigin("*")
@RestController
@RequestMapping("/coupon")
public class CouponController {
	
	@Autowired
	private ICouponService couponService;
	
	@GetMapping("/listcoupon")
	public List<Coupon> getAllCoupon() {
		return couponService.getAllCoupon();
	}
	
	@PostMapping("/savecoupon")
	public Coupon saveCoupon(@RequestBody Coupon coupon) {
		return couponService.saveCoupon(coupon);
	}
	
	@GetMapping("/find/{coupon_id}")
	public Coupon getCouponById(@PathVariable("coupon_id") Long couponId) {
		return null;
	}
	
	@PutMapping("/updatecoupon/{coupon_id}")
	public Coupon updateCoupon(@RequestBody Coupon newCoupon,@PathVariable("coupon_id") Long cid)  {
		return couponService.updateCoupon(newCoupon,cid);
				
	}
	
	@DeleteMapping("/deletecoupon/{coupon_id}")
	public void deleteCouponById(@PathVariable("coupon_id") Long couponId){
		 couponService.deleteCouponById(couponId);
	}

}
