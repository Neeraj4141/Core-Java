package com.rays.oop.exercise;

public class TestDepartment {
	public static void main(String[] args) {
		
		Department d = new Department();
		
		System.out.println("name of employee = "+d.Name());
		System.out.println("id of employe = "+d.idno());
		System.out.println("local address of employee = "+d.localaddress());
        System.out.println("permanent address of employee = "+d.permanentaddress());
        
        Department d2 = new Department();
        
        System.out.println("name of employe = "+d2.Name());
	}
	
	
	
	
	
	
	
	

}
