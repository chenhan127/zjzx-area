package com.zjzx.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.plugin.activerecord.Record;
import com.zjzx.dao.CityDao;
import com.zjzx.util.JSONUtil;

public class CityService {
	@Autowired
	private CityDao cityDao;

	public JSONObject getCityByProvince(String provinceid) {
		// TODO Auto-generated method stub
		List<Record> recordList = cityDao.getCityByProvince(provinceid);
		JSONObject resMap = new JSONObject();
		resMap.put("status", "success");
		JSONObject result = new JSONObject();
		result.put("cityList", recordList);
		resMap.put("result", result);
		return JSONUtil.parseJSON(resMap);
	}

	public JSONObject getCityDic() {
		Map<String, String> dic = new HashMap<String, String>();
		List<Record> recordList = cityDao.getCityList();
		for (Record record : recordList) {
			String mykey = record.getStr("cityid");
			String value = record.getStr("city");
			dic.put(mykey, value);
		}
		JSONObject resMap = new JSONObject();
		resMap.put("status", "success");
		JSONObject result = new JSONObject();
		result.put("cityDic", dic);
		resMap.put("result", result);
		return JSONUtil.parseJSON(resMap);
	}

}
