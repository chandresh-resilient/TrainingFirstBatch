package com.resilient.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		File srcFile = new File("F:\\jdk-11.0.15.1_windows-x64_bin.exe");
		File destination = new File("E:\\copy\\" + srcFile.getName() + ".new");
		if (srcFile.exists()) {
			try (FileInputStream in = new FileInputStream(srcFile);
					FileOutputStream out = new FileOutputStream(destination)) {
				int fiveMb = 1024 * 1024 * 5;
				while (in.available() > 0) {
					System.out.println("reading and writing " + in.available());
					if (in.available() > fiveMb) {
						byte[] bs = new byte[fiveMb];
						int read = in.read(bs);
						out.write(bs);
					} else {
						byte[] bs = new byte[in.available()];
						int read = in.read(bs);
						out.write(bs);
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
