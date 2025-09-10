package com.rays.oi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferRiderTextFile {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Win10 Pro\\Desktop\\IO\\Neeraj.txt"));

		String s = br.readLine();

		while (s != null) {
			System.out.println(s);
			s = br.readLine();
		}

		br.close();

	}

}
