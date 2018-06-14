package com.heroku.keith.libpngtest;

import java.awt.Font;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibpngTestController {

	@RequestMapping("/test")
	public String test() {
		
		String output;
	
		try {
			 Font  f = new Font("SansSerif", Font.PLAIN, 13);
			 output = "All Good!!!";
		} catch (Exception ex) {
			output = ExceptionUtils.getStackTrace(ex);
		}
		  
	    return output;
	}
}
