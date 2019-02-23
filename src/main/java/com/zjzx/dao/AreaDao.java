package com.zjzx.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
@Repository
public class AreaDao {
	
	public static final AreaDao areaDao = new AreaDao();
	public List<Record> getAreaByCity(String cityid) {
		// TODO Auto-generated method stub
		String sql = "select areaid,area from areas where cityid =?";
		List<Record> recordList = Db.find(sql, cityid);
		return recordList;
	}

	public List<Record> getAreaList() {
		// TODO Auto-generated method stub
		String sql = "select areaid,area from areas ";
		List<Record> recordList = Db.find(sql);
		return recordList;
	}
}
