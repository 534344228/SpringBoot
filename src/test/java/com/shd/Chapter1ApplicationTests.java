package com.shd;

import com.shd.domain.Girl;
import com.shd.mapper.GirlMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter1ApplicationTests {
	@Autowired
	private GirlMapper girlMapper;

	@Test
	@Rollback
	public void contextLoads() throws Exception {
		girlMapper.insert(10,"Q");
		Girl girl = girlMapper.findByAge(10);
		Assert.assertEquals(10,girl.getAge().intValue());

	}

}
