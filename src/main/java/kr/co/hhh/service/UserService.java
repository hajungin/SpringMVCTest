package kr.co.hhh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.hhh.dto.UserDto;
import kr.co.hhh.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	UserMapper mapper;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public int userInsert(UserDto userDto) {
		userDto.setU_pw(passwordEncoder.encode(userDto.getU_pw()));
		return mapper.userInsert(userDto);
	}

}
