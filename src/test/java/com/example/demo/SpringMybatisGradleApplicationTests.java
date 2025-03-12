package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan({"data.*","*.controller","com.example.demo","naver.storage","naver.aiservice"})
@MapperScan({"data.mapper"})
class SpringMybatisGradleApplicationTests {

	@Test
	void contextLoads() {
		
	}
}
