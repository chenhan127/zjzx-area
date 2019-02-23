package com.zjzx.serviceconfig;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.jfinal.aop.Duang;
import com.jfinal.plugin.activerecord.tx.Tx;
import com.zjzx.service.AreaService;
import com.zjzx.service.CityService;
import com.zjzx.service.MapService;
import com.zjzx.service.ProvincesService;

@Configuration
public class BeanConfiguration {
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		
		return new RestTemplate();
	}
	@Bean
	public AreaService areaService() {
		return Duang.duang(AreaService.class, Tx.class);
	}
	@Bean
	public CityService cityService() {
		return Duang.duang(CityService.class, Tx.class);
	}
	@Bean
	public MapService fquestionService() {
		return Duang.duang(MapService.class, Tx.class);
	}
	
	@Bean
	public ProvincesService provincesService() {
		return Duang.duang(ProvincesService.class, Tx.class);
	}
	

}
