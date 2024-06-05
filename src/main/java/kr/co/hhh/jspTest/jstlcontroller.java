package kr.co.hhh.jspTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class jstlcontroller {

	@GetMapping("/step1-if")
	public String step_01() {
		return "/jsp-test/step1-if";
	}
	
	@GetMapping("/step2")
	public String step_02(Model model) {
		Person dto = new Person("쏜", 30);
		model.addAttribute("dto", dto);
		return "/jsp-test/step2-choose";
	}
	
	@GetMapping("/step3")
	public String step3(Model model) {
		Person idol1 = new Person("안", 30);
		Person idol2 = new Person("녕", 30);
		
		List<Person> dtos = new ArrayList<>();
		dtos.add(idol1);
		dtos.add(idol2);
		model.addAttribute("dtos", dtos);
		return "/jsp-test/step3_forEach";
	}
	
	@GetMapping("/test-main")
	public String test_main(){
		return "/jsp-test/main-test";
	}
}
