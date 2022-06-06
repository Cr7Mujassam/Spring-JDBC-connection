package com.Jdbc.spring.SpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Jdbc/spring/SpringJdbc/Config.xml");
		JdbcTemplate templet = (JdbcTemplate) context.getBean("JdbcTemplate");
		String inp = "insert into employee values(?,?,?)";
		int result = templet.update(inp, new Integer(1),"Mujassam","Taukir Khan");
		result = templet.update(inp, new Integer(1),"Mujassam","Taukir Khan");
		System.out.println("No of times you inserted the row : "+ result);
	}

}
