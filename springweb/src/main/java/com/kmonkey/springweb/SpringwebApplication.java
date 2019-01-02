package com.kmonkey.springweb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SpringwebApplication {
	@RequestMapping("/")
	public String index(Model model) { 
		Person single = new Person("侯力夫","11");
		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person("bb","22");
		Person p2 = new Person("cc","33");
		people.add(p1);
		people.add(p2);
		model.addAttribute("singlePerson", single);
		model.addAttribute("people2", people);
		
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringwebApplication.class, args);
	}

}

