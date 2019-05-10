package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {

	@Autowired
	private Person person;
	
	@Test
	public void test()
	{
		System.out.println("1111111");
		System.out.println(person);
	}
	
}
