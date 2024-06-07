package kr.co.hhh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.co.hhh.dto.BookDto;

@Mapper
public interface BookMapper {

	List<BookDto> findAll();

	void save(@Param("bookDto")BookDto bookDto);

	void delete(@Param("id")Long id);

	BookDto findOne(@Param("id")Long id);

	void update(@Param("bookDto")BookDto bookDto);

}
