package com.example.Milecalculator;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCalculator{

	@Override
	public void showMileage() {
		System.out.print("Car Mileage is : "+ 344);
		// TODO Auto-generated method stub
		
	}
}
