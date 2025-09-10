package com.rays.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeExternalization {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Employee e = new Employee(12, "Neeraj", "Indore");
		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\Win10 Pro\\Desktop\\IO\\Employee.txt"));
		out.writeObject(e);
		out.close();
		System.out.println("employee serilized successfully");

		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("C:\\Users\\Win10 Pro\\Desktop\\IO\\Employee.txt"));
		e = (Employee) in.readObject();
		System.out.println(e);
		in.close();

	}

}
