package data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SawonController {
	@GetMapping({"/", "/list"})
	public String goMainPage()
	{
		return "sawon/sawonlist";
	}
	
	@GetMapping("/form")
	public String sawonForm()
	{
		return "sawon/sawonform";
	}
}
