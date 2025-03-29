package com.tka;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class MyController {
	
	@RequestMapping(value ="/pricing",method = RequestMethod.GET)
	public String FirstApi() {
		return "pricing are low.";
	}
	
	@RequestMapping(value ="/Overview",method = RequestMethod.POST)
	public String SecondApi() {
		return "Overview are good.";
	}
	
	@RequestMapping(value ="/Features",method = RequestMethod.PUT)
	public String ThirdApi() {
		return "Amazon gives fast delivery.";
	}
	
	@RequestMapping(value ="/Resources",method = RequestMethod.DELETE)
	public String FourthApi() {
		return "The Key Resources of Amazon is Technological Infrastructure.";
	}
	
	@RequestMapping(value ="/Quality",method = RequestMethod.GET)
	public String FifthApi() {
		return "The Quality of Amazon Product is Good.";
	}
	
	@RequestMapping(value ="/Advertisement",method = RequestMethod.POST)
	public String SixthApi() {
		return "Amazon advertises its products on social media.";
	}
	
	@RequestMapping(value ="/Reviews",method = RequestMethod.PUT)
	public String SeventhApi() {
		return "The Amazon Reviews for Products are Generally Positive.";
	}
	
	@RequestMapping(value ="/Satisfaction",method = RequestMethod.DELETE)
	public String EighthApi() {
		return "Customer Satisfaction is a Core Principle for Amazon.";
	}








}
