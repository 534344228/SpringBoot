package com.shd.mapper;

import com.shd.domain.Girl;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by 单昊冬
 * 2018/1/31 下午 9:29
 */
@Mapper
public interface GirlMapper {
	@Select("SELECT * FROM girl WHERE age = #{age}")
	Girl findByAge(@Param("age") Integer age);

	@Insert("INSERT INTO girl (cup_size,age) VALUES (#{cupSize},#{age})")
	int insert(@Param("age") Integer age,@Param("cupSize") String cupSize);
}

