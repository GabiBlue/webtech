package hu.uni.miskolc.webtech.librarian.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value = {"", "/", "/home", "/index"})
	public ModelAndView homePage(){
		ModelAndView result = new ModelAndView("index");
		return result;
	}
	
	@RequestMapping(value = "/author")
	public ModelAndView authorPage() {
		ModelAndView result = new ModelAndView("authorpage");
		return result;
	}
	
	@RequestMapping(value = "/addauthor")
	public ModelAndView addauthorPage() {
		ModelAndView result = new ModelAndView("addauthorpage");
		return result;
	}
	
	@RequestMapping(value = "/updateauthor")
	public ModelAndView updateauthorPage() {
		ModelAndView result = new ModelAndView("updateauthorpage");
		return result;
	}
	
	@RequestMapping(value = "/book")
	public ModelAndView bookPage() {
		ModelAndView result = new ModelAndView("bookpage");
		return result;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contactPage() {
		ModelAndView result = new ModelAndView("contactpage");
		return result;
	}

	/*
	@RequestMapping("/hello")
	public @ResponseBody String sayHello(){
		return "Hello World";
	}
	*/
}
