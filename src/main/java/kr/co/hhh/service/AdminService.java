package kr.co.hhh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.hhh.dto.AdminDto;
import kr.co.hhh.mapper.AdminMapper;

@Service
public class AdminService {
	@Autowired
	AdminMapper mapper;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public int adminInsert(AdminDto adminDto) {
		adminDto.setA_pw(passwordEncoder.encode(adminDto.getA_pw()));
		if(adminDto.getA_id().equals("admin")) {
				adminDto.setA_approval(1);		
		}
		return mapper.adminInsert(adminDto);
		
	}

	
	
	public AdminDto loginConfirm(AdminDto adminDto) {
		AdminDto dto = new AdminDto();
		dto = mapper.loginConfirm(adminDto);
		return dto;
	}



	public List<AdminDto> adminList() {
		return mapper.adminList();
	}



	public int findOne(String id) {
		return mapper.findOne(id);
	}



	public void update(AdminDto adminDto) {
		mapper.update(adminDto);
		
	}



	public List<AdminDto> search(String category, String keyword) {
		return mapper.search(category,keyword);
	}



}
