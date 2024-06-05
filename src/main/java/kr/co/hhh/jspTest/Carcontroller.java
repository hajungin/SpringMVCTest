package kr.co.hhh.jspTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Carcontroller {
	@GetMapping("/car/step1")
	public String car_Test_01() {
		return "/jsp-test/step1";
	}
	

}
