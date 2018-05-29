package com.cnvex.tt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;


@RestController
@ComponentScan({"com.taotao.service", "com.taotao.controller"})
@MapperScan("com.taotao.mapper")
@SpringBootApplication
//@EnableAutoConfiguration
//@EnableTransactionManagement
public class Main {
	
	@Autowired
	public ItemService itemService;
	
	@RequestMapping("test")
	public TbItem test() {
		TbItem item = itemService.getItemById(679533);
		return item;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}	
}
