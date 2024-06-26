package kr.co.hhh.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.hhh.dto.AdminDto;
import kr.co.hhh.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@GetMapping("")
	public String mainView() {
		return "/admin/main";
	}
	
	@GetMapping("/createAccountForm")
	public String createAccountForm() {
		return "/admin/create_account_form";
	}
	
	@PostMapping("/createAccountConfirm")
	public String createAccountConfirm(AdminDto adminDto) {
		System.out.println("createAccountConfirm : " + adminDto.toString());
		adminService.adminInsert(adminDto);
		return "/admin/create_account_form";
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "/admin/login_form";
	}
	
	@PostMapping("/loginConfirm")
	public String loginConfirm(AdminDto adminDto, HttpSession session) {
		String nextPage = "/admin/login_ok";
		
		AdminDto adminLoginedDto = adminService.loginConfirm(adminDto);
		
		if(adminLoginedDto == null) {
			return nextPage;
		}
		
		if(passwordEncoder.matches(adminDto.getA_pw(), adminLoginedDto.getA_pw()))  {
			session.setAttribute("adminLoginedDto", adminLoginedDto);
			session.setMaxInactiveInterval(10); //60초*30 = 30분
			return nextPage;
		} else {
			nextPage = "/admin/login_ng";
			return nextPage;
		}
	}
	
	@GetMapping("/Logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/admin";
	}
	
	@GetMapping("listupAdmin")
	public String listupAdmin(Model model) {
		String nextPage = "/admin/admin_list";
		List<AdminDto> adminDtos = adminService.adminList();
		model.addAttribute("adminDtos", adminDtos);
		return nextPage;
	}
	
	@GetMapping("setAdminApproval")
	public String setAdminApproval(@RequestParam("id")String id) {
		String nextPage = "redirect:/admin/listupAdmin";
		int result = adminService.findOne(id);
		return nextPage;
	}
	
	@GetMapping("/modifyAccountForm")
	public String modifyAccountFirm(HttpSession session) {
		String nextPage = "/admin/modify_account_form";
		    // 현재 로그인 상태인지 확인
		AdminDto adminLoginedDto = (AdminDto) session.getAttribute("adminLoginedDto");

		    if (adminLoginedDto == null) {
		    	//로그인 상태 : 수정페이지로 이동
		    	nextPage = "redirect:/admin/LoginForm";
		    }
		    return nextPage;
		}
		// 
		
		// 로그 아웃 상태(세션만료) : 로그인 페이지로 이동
//		session.invalidate();
//		nextPage = "/admin/LoginForm";
//		return nextPage;
//	}
	
	
	
	@PostMapping("/modifyAccountConfirm")
	public String modifyAccountConFirm(HttpSession session,AdminDto adminDto) {
		String nextPage = "redirect:/admin/listupAdmin";
		System.out.println("adminDto : " + adminDto.toString());
//		수정 후 관리자 리스트 페이지로 이동
		adminService.update(adminDto);
		session.setAttribute("adminDto", adminDto);
		session.setMaxInactiveInterval(60*30); //60초*30 = 30분
		return nextPage;
	}
	
	@GetMapping("/searchAdminConfirm")
	public String searchAdminConfirm(@RequestParam("category") String category,
	                                 @RequestParam("keyword") String keyword,
	                                 Model model) {
	    List<AdminDto> adminDtos = adminService.search(category, keyword);
	    System.out.println(adminDtos.toString());
	    model.addAttribute("adminDtos", adminDtos);
	    return "/admin/admin_list";
	}
	
	@GetMapping("/handlerInterceptor")
	public String handlerInterceptor() {
		return "/admin/handler_interceptor";
	}

	

}
