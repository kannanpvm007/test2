package com.kgisl.test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class combin2 {
	public static void main(String[] args) throws IOException {

		FileReader fl1 = new FileReader("D:\\Kannan\\test2\\RW\\two.txt");
		FileReader fl2 = new FileReader("D:\\Kannan\\test2\\RW\\one.txt");

		List<Path> files = Arrays.asList(Paths.get("D:\\Kannan\\test2\\RW\\two.txt"));

		Path out = Paths.get("D:\\Kannan\\test2\\RW\\3.txt");
		Charset charset = StandardCharsets.UTF_8;
		for (Path var : files) {
			List<String> lines = Files.readAllLines(var, charset);

			Files.write(out, lines, charset, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			
		}
System.out.println("1st file writeed....");
		List<Path> inputs = Arrays.asList(Paths.get("D:\\Kannan\\test2\\RW\\one.txt"));

		Path out1 = Paths.get("D:\\Kannan\\test2\\RW\\3.txt");
		Charset ct = StandardCharsets.UTF_8;
		for (Path var1 : inputs) {
			List<String> lines = Files.readAllLines(var1, ct);

			Files.write(out1, lines, charset, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			System.out.println("2nd st file writeed....");
		}
	}

	// BufferedReader one = new BufferedReader(fl1);
	// BufferedReader two = new BufferedReader(fl2);

	// String a = "";

	// String b ="";

	// FileWriter fw = new FileWriter("D:\\Kannan\\test2\\RW\\3.txt");

	// while (a != null || b != null) {
	// if (a != null) {
	// fw.write(a+"\n ");
	// a = one.readLine();
	// }

	// if (b != null) {
	// fw.write(b+"\n");
	// b = two.readLine();
	// }
	// }

	// System.out.println("doneok ");
	// one.close();two.close();fw.close();
	// }
}
