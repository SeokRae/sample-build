package com.example;

import java.io.IOException;
import java.util.Properties;

public class BuildApplication {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello, World!");
		
		Properties prop = new Properties();
		prop.load(Class.class.getResourceAsStream("/resources/application.properties"));

		System.out.println("properties = " + prop);

	}
}
