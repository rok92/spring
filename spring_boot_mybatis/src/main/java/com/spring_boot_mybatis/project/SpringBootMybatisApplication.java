package com.spring_boot_mybatis.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.spring_boot_mybatis.project.controller.ProductController;
import com.spring_boot_mybatis.project.dao.IProductDAO;
import com.spring_boot_mybatis.project.service.ProductService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spring_boot_mybatis.project"})
@MapperScan(basePackages = {"com.spring_boot_mybatis.project"})
//@ComponentScan(basePackageClasses = ProductController.class)
//@ComponentScan(basePackageClasses = ProductService.class)
//@MapperScan(basePackageClasses = IProductDAO.class)
public class SpringBootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisApplication.class, args);
	}

}
