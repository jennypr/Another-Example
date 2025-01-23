package com.neotech.lesson02;

public interface I_WebDriver {
	
	//any variable I declare will be public static final
	//any method I declare will be public abstract
	
	public void get(String url);
	
	public String getTitle();
	
	public String getCurrentUrl();
	
	public void close();
	
	public void quit();

	

}
