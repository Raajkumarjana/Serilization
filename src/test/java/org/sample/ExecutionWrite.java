package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExecutionWrite {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\JSONDeSeralizationTopic\\src\\test\\resources\\Sample3.json");
		ObjectMapper objectMapper = new ObjectMapper();
		Topping t = new Topping("10", "Inheritance");
		Topping t2 = new Topping("20", "JavaScript");
		Topping t3 = new Topping("30", "Deserialization");
		ArrayList<Topping> topping = new ArrayList<Topping>();
		topping.add(t);
		topping.add(t2);
		topping.add(t3);
		Batter b = new Batter("100", "java");
		Batter b1 = new Batter("200", "selenium");
		Batter b2 = new Batter("300", "API");
		ArrayList<Batter> batter = new ArrayList<Batter>();
		batter.add(b);
		batter.add(b1);
		batter.add(b2);
		Batters batters = new Batters(batter);
		Root root = new Root("100", "Selenium", "Raajkumar", 50.76, batters, topping);
		objectMapper.writeValue(file, root);	
	}

}
