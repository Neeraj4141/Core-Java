package com.rays.excaption.handling;

public class TestLogin {
	public static void main(String[] args) throws LoginNotFoundException {
	
	String login = "Neeraj55";

	if (login != null && login == "Neeraj" ) {
		System.out.println("Neeraj Mewada login done");
	}else {
		throw new LoginNotFoundException();
	}
	System.out.println( "Login succesfully");
	
	
	}
}
