package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController 
{
	@RequestMapping(path = "/",method = RequestMethod.GET)
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
    @GetMapping("/greet")
    public ModelAndView greet(@RequestParam("username") String username) {
        ModelAndView mv = new ModelAndView("greet");
        mv.addObject("username", username);
        return mv;
    }

    @GetMapping("/about")
    public ModelAndView about() {
        return new ModelAndView("about");
    }

    @GetMapping("/demo1")
    public ModelAndView demo1(@RequestParam("age") int age, @RequestParam("country") String country) {
        ModelAndView mv = new ModelAndView("demo1");
        mv.addObject("age", age);
        mv.addObject("country", country);
        return mv;
    }

    @GetMapping("/demo2/{num1}/{num2}")
    public ModelAndView demo2(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        int subtraction = num1 - num2;
        int division = num1 / num2;
        ModelAndView mv = new ModelAndView("demo2");
        mv.addObject("subtraction", subtraction);
        mv.addObject("division", division);
        return mv;
    }

    @GetMapping("/productform")
    public ModelAndView productForm() {
        return new ModelAndView("productform");
    }

    @GetMapping("/multiplyNumbers")
    public ModelAndView multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1 * num2;
        ModelAndView mv = new ModelAndView("multiplyNumbers");
        mv.addObject("result", result);
        return mv;
    }

    @GetMapping("/reverse")
    public ModelAndView reverse(@RequestParam("str1") String str1, @RequestParam("str2") String str2) {
        String reversedStr1 = new StringBuilder(str1).reverse().toString();
        String reversedStr2 = new StringBuilder(str2).reverse().toString();
        ModelAndView mv = new ModelAndView("reverse");
        mv.addObject("reversedStr1", reversedStr1);
        mv.addObject("reversedStr2", reversedStr2);
        return mv;
    }

    @GetMapping("/calculate")
    public ModelAndView calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        ModelAndView mv = new ModelAndView("calculate");
        mv.addObject("addition", addition);
        mv.addObject("subtraction", subtraction);
        return mv;
    }
}

