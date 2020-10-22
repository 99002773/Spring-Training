package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Milecalculator.VehicleDetails;
import com.example.autowire.ShapeFactory;
import com.example.constr.Student;
import com.example.foodwiring.FoodPand;
import com.example.setter.Address;
import com.example.setter.Employee;

@SpringBootApplication
public class Trail1projectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Trail1projectApplication.class, args);
	}
	@Autowired
	ApplicationContext context;
	@Override
	public void run(String... args) throws Exception
	{
		//Employee emp=context.getBean("employee",Employee.class);
		//Address add=context.getBean("address",Address.class);
		//System.out.println(emp);
		//System.out.print(add);
		//ShapeFactory shape=context.getBean(ShapeFactory.class);
		//shape.printArea(10,20);
//		FoodPand fpad=context.getBean(FoodPand.class);
//		List<String>list=fpad.showMenu("Indian");
//		for(String listt:list)
//		{
//			System.out.print(listt);
//		}
		VehicleDetails vdt=context.getBean(VehicleDetails.class);
	    vdt.getMileage("car");
	}
	
}
