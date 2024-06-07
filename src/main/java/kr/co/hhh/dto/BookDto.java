package kr.co.hhh.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class BookDto {
	private String b_name;
	private String b_author;
	private String b_publisher;
	private Long b_isbn;

}
