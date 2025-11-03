package com.rays.oi;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("C:\\Users\\Win10 Pro\\Desktop\\IO\\Neeraj.txt");
		
		
		file.write("Hello Neeraj\n How Are you ");
		file.close();
		
	
}

}
