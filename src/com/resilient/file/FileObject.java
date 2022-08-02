package com.resilient.file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

public class FileObject {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\sts-4.8.0.RELEASE");
		file.exists();
		if (file.isDirectory()) {
			String[] list = file.list();
			for (String string : list) {
				System.out.println(string);
			}

			File[] listFiles = file.listFiles();
			for (File file2 : listFiles) {
				System.out.println(file2);
			}
		}
		File pdf = new File(
				"C:\\Users\\chand\\OneDrive\\Desktop\\"
						+ "desktop wallpaer\\TestFile.shivam");


		System.out.println("pdf.exists()" + pdf.exists());
		//System.out.println("pdf.delete()" + pdf.delete());
		OutputStream stream = new BufferedOutputStream(new FileOutputStream(pdf, true));
		String s = "Hi this is Test String "+new Date()+"\n";
		writeData(stream, s.getBytes());
	}

	private static void writeData(OutputStream stream, byte[] data) {

		try {
			stream.write(data);
			stream.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
