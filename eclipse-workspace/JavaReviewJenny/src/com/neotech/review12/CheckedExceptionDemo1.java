package com.neotech.review12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo1 {

	public static void main(String[] args) {
		
		
		
		String projectPath = System.getProperty("user.dir");

		String filePath = projectPath + "/extra/demo.properties";
		
		//2 ways

		try {
			FileInputStream fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
						e.printStackTrace();
		}
	}

}
