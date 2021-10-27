package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OutputDataTest {

	OutputData out= new OutputData();
	
	@Test
	public void resultTest()
	{
		assertEquals(out.result(),"SUCCESS");
	}
}
