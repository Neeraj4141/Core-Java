package com.rays.oi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {
	public static void main(String[] args) throws IOException {

		FileInputStream in = new FileInputStream("C:\\Users\\Win10 Pro\\Desktop\\IO\\Rays.jpg");
		FileOutputStream out = new FileOutputStream("C:\\Users\\Win10 Pro\\Desktop\\IO\\Neerajji.jpg");

		int i = in.read();
		while (i != -1) {
			System.out.println(i);
			out.write(i);
			i = in.read();
		}
		in.close();
		out.close();
	}
}
