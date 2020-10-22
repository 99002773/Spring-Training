package com.example.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Course {
	String name;
	double price;

	public String getName() {
		return name;
	}
	@Value("${student.course.name}")
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	@Value("${student.course.price}")
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", price=" + price + "]";
	}
	

}
