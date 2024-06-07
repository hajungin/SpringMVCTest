package kr.co.hhh.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.co.hhh.dto.UserDto;

@Mapper
public interface UserMapper {

	int userInsert(@Param("userDto")UserDto userDto);

}
