package com.zjzx.serviceconfig;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;

@Configuration
public class ActiveRecordConfig {
	
	@Resource
	private DataSource dataSource;

	@Bean(initMethod = "start", destroyMethod = "stop")
	public ActiveRecordPlugin init() {
		ActiveRecordPlugin arp = new ActiveRecordPlugin(dataSource);
		arp.setDialect(new MysqlDialect());
//		try {
//			 Scan.MappingModel(arp);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		System.out.println("数据库启动成功");
		return arp;
	}

}
