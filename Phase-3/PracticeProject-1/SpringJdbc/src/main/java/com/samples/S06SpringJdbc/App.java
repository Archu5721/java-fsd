package com.samples.S06SpringJdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S06SpringJdbc/SpringConfig.xml");
    	
    	JdbcTemplate jdbctemplate = (JdbcTemplate) springContainer.getBean("jdbctemplate");
    	String sql="insert into employee values(?,?,?)";
    	int updateResult = jdbctemplate.update(sql, 1, "Will", "Byers");
		System.out.println("Number of records inserted: " + updateResult);
    }
}
