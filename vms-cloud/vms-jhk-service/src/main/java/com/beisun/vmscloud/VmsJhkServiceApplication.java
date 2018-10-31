package com.beisun.vmscloud;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//exclude = MybatisAutoConfiguration.class 禁止加载mybatias的自动配置类
@SpringBootApplication(exclude = MybatisAutoConfiguration.class)
//加载xml配置文件
@ImportResource(locations = {"classpath:config/spring/applicationContext*.xml"})
public class VmsJhkServiceApplication   {

	public static void main(String[] args) {
		SpringApplication.run(VmsJhkServiceApplication.class, args);
	}
}
