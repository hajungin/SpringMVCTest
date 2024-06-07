package kr.co.hhh.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.hhh.dto.UserDto;
import kr.co.hhh.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("main")
	public String mainView() {
		return "/user/main";
	}
	
	@GetMapping("")
	public String userView() {
		return "user/user";
	}
	
	@GetMapping("login")
	public String userLogin() {
		return "/user/login";
	}
	
	@PostMapping("login")
	public String LoginOK(User) {
		return "user/loginOk";
	}
	
	@GetMapping("create")
	public String create() {
		return "user/create";
	}
	
	@PostMapping("create")
	public String create(UserDto userDto) {
		userService.userInsert(userDto);
		return "user/main";
	}
	
	@GetMapping("/Logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/user";
	}

}
