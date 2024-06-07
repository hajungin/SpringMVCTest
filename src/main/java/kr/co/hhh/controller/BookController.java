package kr.co.hhh.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.hhh.dto.BookDto;
import kr.co.hhh.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	
	
	@GetMapping("/list")
	public String allList(BookDto bookDto,
			Model model) {
		List<BookDto> bookDtos = bookService.findAll();
		model.addAttribute("bookDtos", bookDtos);
		return "/book/list";
	}
	
	@GetMapping("insert")
	public String insert() {
		return "/book/insert";
	}

	@PostMapping("insert")
	public String insertBook(BookDto bookDto) {
		bookService.save(bookDto);
		return "redirect:/book/list";
	}
	
	@PostMapping("delete")
	public String deleteBook(@RequestParam("id")Long id) {
		bookService.delete(id);
		return "redirect:/book/list";
	}
	
	@GetMapping("update")
	public String showBook(@RequestParam("b_isbn")Long id,
			Model model) {
		BookDto bookDto = bookService.findOne(id);
		model.addAttribute("bookDto", bookDto);
		return "book/One";
	}
	
	@PostMapping("update")
	public String update(BookDto bookDto) {
		bookService.update(bookDto);
		return "redirect:/book/list";
	}
	
	

}
