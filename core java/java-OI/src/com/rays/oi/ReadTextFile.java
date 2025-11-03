package com.rays.oi;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[] args) throws IOException {
		FileReader file = null;
		try {
			file = new FileReader("C:\\Users\\Win10 Pro\\Desktop\\IO\\Hello.txt");
			int i = file.read();

			while (i != -1) {
				System.out.println((char) i + " = " + i);
				i = file.read();
			}

		} catch (Exception e) {
			System.out.println("Exceotion = " + e.getLocalizedMessage());

		} finally {
			file.close();
		}
	}

}
