package coo.sh.io.file;

import java.io.File;
import java.util.Calendar;
import java.util.Scanner;

public class FileTest4_2 {
	public static void main(String[] args) {
		File file = new File("c:\\test");
		Scanner sc = new Scanner(System.in);
		String [] ar = file.list();
		
		

		Calendar ca = Calendar.getInstance();
		
		long now = ca.getTimeInMillis();
		String s = Long.toString(now);
		file = new File(file, s);
		file.mkdir();
		
		
	}
	
	
	public void teacher() {
		String filename = "";
		Calendar ca = Calendar.getInstance();
		
		long t = ca.getTimeInMillis();
		filename = "D"+t;
		File file = new File("c://test//",filename);
		
	}
}
