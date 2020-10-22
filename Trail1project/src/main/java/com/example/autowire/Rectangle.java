package com.example.autowire;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {
    
	@Override
	public void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.print(x*y);
		
	}
	

}
