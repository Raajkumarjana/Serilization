package org.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execution {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
	FileReader f = new FileReader(new File("C:\\Users\\hp\\eclipse-workspace\\JSONDeSeralizationTopic\\src\\test\\resources\\Sample2.json"));
		
	ObjectMapper objectMapper = new ObjectMapper();	
	
	Root readValue = objectMapper.readValue(f, Root.class);
		
	System.out.println(readValue.getId());	
	System.out.println(readValue.getType());	
	System.out.println(readValue.getName());	
	System.out.println(readValue.getPpu());
	Batters batters = readValue.getBatters();
	ArrayList<Batter> batter = batters.getBatter();
	for (int i = 0; i < batter.size(); i++) {
		Batter batter2 = batter.get(i);
		System.out.println(batter2.getId()+" "+batter2.getType());
	}
	ArrayList<Topping> topping = readValue.getTopping();
	for (int j = 0; j < topping.size(); j++) {
		Topping topping2 = topping.get(j);
		System.out.println(topping2.getId()+" "+topping2.getType());		
	}
	
	}

}
