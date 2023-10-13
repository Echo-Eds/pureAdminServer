package com.li;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.li.Mapper")
public class PureAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PureAdminServerApplication.class, args);
	}

}
