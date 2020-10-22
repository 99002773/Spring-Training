package com.example.Milecalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class VehicleDetails {
	@Autowired
	@Qualifier("car")
	MileCalculator mcar;
	@Autowired
	@Qualifier("bike")
	MileCalculator mbike;
	public void getMileage(String choice)
	{
		if(choice.equals("car"))
		{
			mcar.showMileage();
		}
		else
		{
			mbike.showMileage();
		}
	}
}
