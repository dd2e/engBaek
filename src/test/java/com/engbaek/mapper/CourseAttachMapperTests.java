package com.engbaek.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class CourseAttachMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private CourseAttachMapper mapper;
	
	@Test
	public void testFindByCourseCode() {
		
		Long courseCode = 2L;
		
		mapper.findByCourseCode(courseCode).forEach(attach -> log.info(attach));
	}

}
