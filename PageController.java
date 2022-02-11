package kr.co.abandog.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	@GetMapping("/")
	public String main(Model model) {
		Map<String,Object> map = new HashMap<>();
		
		map.put("Language", "JAVA");
		map.put("IDE", "STS");
		map.put("Build", "Gradle");
		map.put("WAS", "Tomcat");
		
		model.addAttribute("map", map);
		
		List<String> task = new ArrayList<>();
		task.add("Back End Developer");
		task.add("Front End Developer");
		
		model.addAttribute("list",task);

		return "main";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		
		return "login";

	}
	@GetMapping("/joinmember")
	public String joinmember(Model model) {
		
		return "joinmember";
	}
	
	@GetMapping("/find")
	public String find(Model model) {
		
		return "find";
	}
}

