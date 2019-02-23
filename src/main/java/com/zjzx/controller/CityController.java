package com.zjzx.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.core.Controller;
import com.zjzx.annotation.EmptyCheck;
import com.zjzx.service.CityService;
@org.springframework.stereotype.Controller
@RequestMapping("/city")
@ResponseBody
public class CityController extends Controller {
	
	@Autowired
	private CityService cityService; 
	/**
	 * 根据省份编号获取城市
	 */
	@RequestMapping("/getCityByProvince")
	@EmptyCheck({"provinceid"})
	public JSONObject getCityByProvince(String provinceid){
		JSONObject resMap = cityService.getCityByProvince(provinceid);
		return resMap;
		
	}
	/**
	 * 获取城市数据字典
	 */
	@RequestMapping("/getCityDic")
	public JSONObject getCityDic(){
		JSONObject resMap = cityService.getCityDic();
		return resMap;
		
	}

}
