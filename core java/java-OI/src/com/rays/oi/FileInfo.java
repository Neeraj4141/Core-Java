package com.rays.oi;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\Win10 Pro\\Desktop\\IO\\Hello.txt");
		if (f.exists()) {
			System.out.println("File Found");
		} else {
			System.out.println("File Not Found");
		}
		System.out.println("Path = " + f.getAbsolutePath());
		System.out.println("Writeable = " + f.canWrite());
		System.out.println("Readable = " + f.canRead());
		System.out.println("Is File = " + f.isFile());
		System.out.println("Is Directory = " + f.isDirectory());
		System.out.println("Excutable = "+f.canExecute());

		Date d = new Date(f.lastModified());

		System.out.println("Modified Date = " + d);

	}
}
