package kr.co.hhh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.co.hhh.dto.AdminDto;

@Mapper
public interface AdminMapper {

	int adminInsert(@Param("adminDto") AdminDto adminDto);

	AdminDto loginConfirm(@Param("adminDto")AdminDto adminDto);

	List<AdminDto> adminList();

	int findOne(@Param("id")String id);

	void update(@Param("adminDto")AdminDto adminDto);

	List<AdminDto> search(@Param("category")String category, @Param("keyword")String keyword);

}
