package com.example.feedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController {
	
	@Autowired
	FeedbackDAO feedbackdao;
	
	@GetMapping(value="/addfeed")
	public String showFeedbackPage() {
		return "addfeedback";
	}
	
	@PostMapping("/inputfeedback")
	public ResponseEntity<String> addFeedback(@ModelAttribute ("feedback") Feedback feedback,ModelMap model) {
		int x=feedbackdao.create(feedback);
		if(x>0)
			return new ResponseEntity<String>("Data inserted",HttpStatus.OK);
		else
			return new ResponseEntity<String>("Error in inserting",
					HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
