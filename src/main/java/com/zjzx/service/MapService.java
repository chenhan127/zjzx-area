package com.zjzx.service;

import java.io.IOException;

import com.alibaba.fastjson.JSONObject;
import com.zjzx.util.HttpUtil;

public class MapService   {

	public JSONObject getPoiList(String key, Integer page_num, String location)
			throws IOException {
		// TODO Auto-generated method stub
		if(key == null || "".equals(key)){
			key = "酒店$公司$超市$饭店$广场$电影$小区$商之都$写字楼$网吧";
		}
		if(page_num == null){
			page_num = 0;
		}
		String url = "http://api.map.baidu.com/place/v2/search?query="+key+"&location="+location+"&radius=2000&output=json&ak=XG911pLxEnZ7kS0Q2M3U7QUGoDonCHv6&scope=2&filter=sort_name:distance|sort_rule:0&page_num="+page_num;
		JSONObject resMap = HttpUtil.getHttpJSONObj(url);
		System.out.println(resMap);
		return resMap;
	}
	
//	public static void main(String[] args) {
//		try {
//			new MapServiceImpl().getPoiList("", 1, "30.663549,117.482321");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
