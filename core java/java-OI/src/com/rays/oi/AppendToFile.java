package com.rays.oi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Win10 Pro\\Desktop\\IO\\Hello.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\Win10 Pro\\Desktop\\IO\\Neeraj.txt"));

		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Win10 Pro\\Desktop\\IO\\Append.txt"));

		String s = br.readLine();

		while (s != null) {
			bw.write(s);
			s = br.readLine();

		}
		br.close();
		String s1 = br1.readLine();
		while (s1 != null) {
			bw.write(s1);
			s1 = br1.readLine();

		}
		br1.close();
		System.out.println("successfull");
		bw.close();
	}

}
