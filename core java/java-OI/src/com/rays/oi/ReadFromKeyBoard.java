package com.rays.oi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyBoard {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter("C:\\Users\\Win10 Pro\\Desktop\\IO\\Mewada.txt");
		InputStreamReader ne = new InputStreamReader(System.in);
		System.out.println("type something");
		BufferedReader in = new BufferedReader(ne);

		String line = in.readLine();
		while (!line.equals("quit")) {
			out.println(line);
			line = in.readLine();
		}
		in.close();
		out.close();
		ne.close();
	}

}
