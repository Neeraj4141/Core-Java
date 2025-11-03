package com.rays.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerilizable {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Account a = new Account("4342545444e2", 32662.22);
		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\Win10 Pro\\Desktop\\IO\\Account.txt"));
		// Convert Account class object into bite Stream.serilization
		out.writeObject(a);
		out.close();
		System.out.println("Object Serilized Succecssfully");

		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("C:\\Users\\Win10 Pro\\Desktop\\IO\\Account.txt"));

		// Convert bite Stream into Account class object.deserilization
		System.out.println(in.readObject());
		in.close();
	}

}
