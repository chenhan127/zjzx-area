package com.zjzx.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.plugin.activerecord.Record;
import com.zjzx.dao.AreaDao;
import com.zjzx.util.JSONUtil;

public class AreaService {
	@Autowired
	private AreaDao areaDao;

	public JSONObject getAreaByCity(String cityid) {
		List<Record> areaList = areaDao.getAreaByCity(cityid);
		JSONObject resMap = new JSONObject();
		resMap.put("status", "success");
		JSONObject result = new JSONObject();
		result.put("areaList", areaList);
		resMap.put("result", result);
		return JSONUtil.parseJSON(resMap);
	}

	public JSONObject getAreaDic() {
		Map<String, String> dic = new HashMap<String, String>();
		List<Record> recordList = areaDao.getAreaList();
		for (Record record : recordList) {
			String mykey = record.getStr("areaid");
			String value = record.getStr("area");
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
