package com.neel.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neel.web.model.ResultPage;

@Controller
@RequestMapping(value="/result")
public class ResultController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String eligibilityform(Model model, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		model.addAttribute("resultPage", new ResultPage());
		model.addAttribute("applNum", "1000");
		model.addAttribute("applInterest", "8.0");
		return "resultPage";
		
	}
	
}

