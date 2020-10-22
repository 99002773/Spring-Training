package com.example.Milecalculator;

import org.springframework.stereotype.Component;

@Component
public class Bike implements MileCalculator {

	@Override
	public void showMileage() {
		System.out.print("Bike Mileage is : "+234);
		// TODO Auto-generated method stub
		
	}

}
