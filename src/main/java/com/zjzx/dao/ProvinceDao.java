package com.zjzx.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
@Repository
public class ProvinceDao {
	public static final ProvinceDao provinceDao = new ProvinceDao();
	public List<Record> getProvinceList() {
		String sql = "select provinceid,province from provinces";
		return Db.find(sql);
	}

}
