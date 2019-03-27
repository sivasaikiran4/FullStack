package org.practice.spring;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(@Valid Information userInfo,BindingResult result){
		 
		ModelAndView model = new ModelAndView("hello"); 
		model.addObject("firstName",userInfo.getFirstName());
		model.addObject("lastName",userInfo.getLastName());
		model.addObject("gender",userInfo.getGender());
		model.addObject("country",userInfo.getCountry());
		model.addObject("text",userInfo.getText());
		model.addObject("visit",userInfo.getVisit());
		if(result.hasErrors())
			System.out.println("has Errors");
		return model;
	}
	
	@RequestMapping("/")
	//public ModelAndView homepage(){
	public String homepage(Model model){
    //ModelAndView model = new ModelAndView("index","info", new Information());
		model.addAttribute("info",new Information());
    Map<String,String> country= new LinkedHashMap<String,String>();
    country.put("USA","USA");
    country.put("canada","canada"); country.put("india","india");
    model.addAttribute("country",country);
	return "index";
	}
}