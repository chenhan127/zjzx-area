package com.zjzx.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.plugin.activerecord.Record;
import com.zjzx.dao.ProvinceDao;
import com.zjzx.util.JSONUtil;

public class ProvincesService {
	@Autowired
	private ProvinceDao provinceDao;

	public JSONObject getProvinceList() {
		// TODO Auto-generated method stub
		// String key = "getProvinceList";
		List<Record> recordList = provinceDao.getProvinceList();
		JSONObject resMap = new JSONObject();
		resMap.put("status", "success");
		JSONObject result = new JSONObject();
		result.put("provinceList", recordList);
		resMap.put("result", result);
		return JSONUtil.parseJSON(resMap);
	}

	public JSONObject getProvinceDic() {
//		String key = "getProvinceDic";
		Map<String, String> dic = new HashMap<String, String>();
		List<Record> recordList = provinceDao.getProvinceList();
		for (Record record : recordList) {
			String mykey = record.getStr("provinceid");
			String value = record.getStr("province");
			dic.put(mykey, value);
		}
		JSONObject resMap = new JSONObject();
		resMap.put("status", "success");
		JSONObject result = new JSONObject();
		result.put("provinceDic", dic);
		resMap.put("result", result);
		return JSONUtil.parseJSON(resMap);
	}

}
