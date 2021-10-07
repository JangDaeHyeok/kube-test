package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
	@RequestMapping(value="/")
	public ModelAndView TestIndex() {
		ModelAndView mv = new ModelAndView("hello");
		return mv;
	}
	
	@RequestMapping(value="hello")
	public ModelAndView TestHello() {
		ModelAndView mv = new ModelAndView("hello");
		return mv;
	}
}
