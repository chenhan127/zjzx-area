package com.zjzx.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
@Repository
public class CityDao {
	
	public static final CityDao cityDao = new CityDao();
	public List<Record> getCityByProvince(String provinceid) {
		// TODO Auto-generated method stub
		String sql = "select cityid,city from cities where provinceid=?";
		List<Record> recordList = Db.find(sql, provinceid);
		return recordList;
	}

	public List<Record> getCityList() {
		// TODO Auto-generated method stub
		String sql = "select cityid,city from cities";
		List<Record> recordList = Db.find(sql);
		return recordList;
	}
}
