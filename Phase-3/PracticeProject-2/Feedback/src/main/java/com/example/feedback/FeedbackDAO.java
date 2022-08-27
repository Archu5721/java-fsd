package com.example.feedback;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FeedbackDAO {
	@Autowired
	private JdbcTemplate template;
	
	
	 public int create(Feedback feedback) {
		return template.update("insert into feedback(name,comments,rating) values (?,?,?)", 
				feedback.getName(),feedback.getComments(),feedback.getRating());
	}
}
