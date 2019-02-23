package com.zjzx.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.zjzx.annotation.EmptyCheck;
import com.zjzx.service.AreaService;

@org.springframework.stereotype.Controller
@RequestMapping("/area")
@ResponseBody
public class AreaController{
	@Autowired
	private AreaService  areaService;
	/**
	 * 根据区域获取城市
	 */
	@RequestMapping("/getAreaByCity")
	@EmptyCheck({"cityid"})
	public JSONObject getAreaByCity(String cityid){
		JSONObject resMap = areaService.getAreaByCity(cityid);
		return resMap;
	}
	/**
	 * 获取区域数据字典
	 */
	@RequestMapping("/getAreaDic")
	public JSONObject getAreaDic(){
		JSONObject resMap = areaService.getAreaDic();
		return resMap;
	}

}
