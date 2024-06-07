package kr.co.hhh.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	private String u_name;
	private String u_pw;
	private String u_phone;
	private String u_email;

}
