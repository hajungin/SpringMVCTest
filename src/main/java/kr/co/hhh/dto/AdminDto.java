package kr.co.hhh.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdminDto {
	private String a_id;
	private String a_pw;
	private String a_name;
	private String a_phone;
	private int a_approval;
}
