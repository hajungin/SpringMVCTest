package kr.co.hhh.service;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.hhh.dto.BookDto;
//import kr.co.hhh.dto.BookDto;
import kr.co.hhh.mapper.BookMapper;

@Service
public class BookService {
	
	@Autowired
	BookMapper mapper;


	public List<BookDto> findAll() {
		return mapper.findAll();
	}


	public void save(BookDto bookDto) {
		mapper.save(bookDto);
		
	}


	public void delete(Long id) {
		 mapper.delete(id);
	}


	public BookDto findOne(Long id) {
		return mapper.findOne(id);
	}


	public void update(BookDto bookDto) {
		mapper.update(bookDto);
		
	}


}
