package br.com.eduardopagliaroni.mvc.mudi.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model) {
		LocalDate localDate = LocalDate.now();
		String data = String.valueOf(localDate);
		model.addAttribute("nome", data);
		return "hello";
	}
	
}
