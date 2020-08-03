package com.app.controller;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping("/show")
	public String showPages(Model m) {
		m.addAttribute("msg","Welcome App:"+new Date());
		return "Home";
	}
}
