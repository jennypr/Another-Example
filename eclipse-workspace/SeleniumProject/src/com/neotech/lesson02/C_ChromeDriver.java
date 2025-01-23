package com.neotech.lesson02;

public class C_ChromeDriver implements I_WebDriver{
	
	public C_ChromeDriver() {
		System.out.println("Chrome is opening!");
	}

	@Override
	public void get(String url) {
		System.out.println("Chrome navigates to the "+url);		
	}

	@Override
	public String getTitle() {
		System.out.println("Chrome will get the title!");		
		return "Title";
	}

	@Override
	public String getCurrentUrl() {
		System.out.println("Chrome will get the title!");		
		return "Url";
	}

	@Override
	public void close() {
		System.out.println("Chrome is closing");		
	}

	@Override
	public void quit() {
		System.out.println("Chrome is quiting");
		
	}

}
