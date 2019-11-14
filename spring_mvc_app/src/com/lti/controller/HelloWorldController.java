package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloWorldController 
{
	@RequestMapping(value = "/hi" ,method = RequestMethod.GET)
	public ModelAndView sayHello()
	{
		ModelAndView model=new ModelAndView("helloWorld");
		model.addObject("message","hello from spring controller!!!");
		return model;
	}

	
	@RequestMapping(value="/sayHello",method=RequestMethod.GET)
	public ModelAndView sayHelloToName(@RequestParam("name") String name)
	{
		ModelAndView model=new ModelAndView("sayHello");
		model.addObject("name",name);
		
		return model;
	}

	@RequestMapping(value="/prime",method=RequestMethod.GET)
	public ModelAndView Prime(@RequestParam("number") Integer number)
	{
		ModelAndView model=new ModelAndView("prime");
		model.addObject("number",number);
		
		
		for(int i=2;i<=number/2;i++)
		  {
		   if(number%i==0)
		   {
			   model.addObject("prime","The number is not prime");
				
		   }
		   else
		   {
			   model.addObject("prime","The number is prime");
				
		   }
		   
		  
		   }
		           
		            
		   
		return model;    
		
		
	
	}
	
}