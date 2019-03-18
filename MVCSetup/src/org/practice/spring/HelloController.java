package org.practice.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(@RequestAttribute(name="info") Information userInfo){
		 
		ModelAndView model = new ModelAndView("hello"); 
		model.addObject("firstName",userInfo.getFirstName());
		model.addObject("lastName",userInfo.getLastName());
		return model;
	}
	
	@RequestMapping("/")
	public ModelAndView homepage(){
    ModelAndView model = new ModelAndView("index","info", new Information());   
	return model;
	}
}