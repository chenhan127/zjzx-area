package com.zjzx.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.zjzx.jfinal.JFController;
import com.zjzx.service.ProvincesService;
@JFController("province")
@org.springframework.stereotype.Controller
@RequestMapping("/province")
@ResponseBody
public class ProvincesController {
	@Autowired
	private ProvincesService provincesService; 
	/**
	 * 获取省份列表
	 */
	@RequestMapping("/getProvinceList")
	public JSONObject getProvinceList(){
		JSONObject resMap = provincesService.getProvinceList();
		return resMap;
		
	}
	/**
	 * 获取省份数据字典
	 */
	@RequestMapping("/getProvinceDic")
	public JSONObject getProvinceDic(){
		JSONObject resMap = provincesService.getProvinceDic();
		return resMap;
	}

}
