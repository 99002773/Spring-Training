package com.example.autowire;

import org.springframework.stereotype.Component;

@Component("shape")
public class Triangle implements Shape{

	@Override
	public void calculateArea(int x, int y) {
		System.out.print(x+y);
		// TODO Auto-generated method stub
		
	}

}
