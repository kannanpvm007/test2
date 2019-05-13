package com.kgisl.test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class combin2 {
	public static void main(String[] args) throws IOException {

		FileReader fl1=new FileReader("D:\\Kannan\\test2\\RW\\two.txt");
		FileReader fl2=new FileReader("D:\\Kannan\\test2\\RW\\one.txt");

		BufferedReader one = new BufferedReader(fl1);
		BufferedReader two = new BufferedReader(fl2);

		String a = "";
		
		String b ="";
		
		FileWriter fw = new FileWriter("D:\\Kannan\\test2\\RW\\3.txt");

		while (a != null || b != null) {
			if (a != null) {
				fw.write(a+"\n ");
				a = one.readLine();
			}

			if (b != null) {
				fw.write(b+"\n");
				b = two.readLine();
			}
		}

			
				System.out.println("doneok ");
			 one.close();two.close();fw.close();
	}
}

 