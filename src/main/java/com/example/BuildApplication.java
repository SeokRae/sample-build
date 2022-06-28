package com.example;

import java.io.IOException;
import java.util.Properties;

public class BuildApplication {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello, World!");
		Properties properties = new Properties();
		properties.load(Class.class.getResourceAsStream("/application.properties"));;
		
		System.out.println("properties = " + properties);
	}
}
