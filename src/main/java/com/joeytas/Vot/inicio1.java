package com.joeytas.Vot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class inicio1{
	
	@GetMapping("/")
	    public ModelAndView redirigirAHola() {
	        ModelAndView modelAndView = new ModelAndView("redirect:/inicio");
	        return modelAndView;
	    }
	
	@GetMapping("/inicio")
	public String salu(){
	
		return "ser";
		
	}
	
	@GetMapping("/pru")
	public String inicio(){
	
		return "pru";
		
	}
	

}
