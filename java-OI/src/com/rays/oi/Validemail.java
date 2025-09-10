package com.rays.oi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Validemail {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Win10 Pro\\Desktop\\IO\\Email.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Win10 Pro\\Desktop\\IO\\RightEmail.txt"));
		
		String s = br.readLine();
		while (s != null) {
			if(s.endsWith("@gmail.com")){
				System.out.println(s);
				bw.write(s);
				bw.newLine();
			}
			
			s = br.readLine();
		}
	br.close();
	bw.close();	
	}

}
