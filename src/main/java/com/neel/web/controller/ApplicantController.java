package com.neel.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.neel.web.model.Applicant;
import com.neel.web.dao.ApplicantDAO;
import com.neel.web.model.Income;

@Controller
@RequestMapping(value="/applicant")
public class ApplicantController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String applicantform(Model model, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		model.addAttribute("applicant", new Applicant());
		return "applicant";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String applicantview(@Valid @ModelAttribute("applicant") Applicant b,BindingResult result, Map<String, Object> model) {
		
		//System.out.println(result.getErrorCount());
		
		if(result.hasErrors()){
			return "applicant";
		}
		
		ApplicationContext context;
	    context =  new ClassPathXmlApplicationContext("beans.xml");
		//@Autowired
	    ApplicantDAO aDAO = (ApplicantDAO) context.getBean("applicantsdao");
	    if(aDAO.insert(b)) {
	    	
	    	((AbstractApplicationContext)context).close();
		    Income i = new Income();
			model.put("income", i);
			return "income";
			
	    } else {
	    	((AbstractApplicationContext)context).close();
	    	model.put("errval", "Encountered a Exception when inserting data into Applicant table");
	    	return "applicant";
	    }
	    
		
        
    }


}

