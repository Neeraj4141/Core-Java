package com.rays.oi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTextFile {
	public static void main(String[] args) throws IOException {

		BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\Win10 Pro\\Desktop\\IO\\Neeraj Mewada.txt"));
		br.write("What do you for living");
		br.newLine();
		br.write("How much you earn in a month");
		br.newLine();
		br.write(":)");
		br.close();

	}

}
