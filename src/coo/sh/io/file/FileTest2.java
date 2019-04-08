package coo.sh.io.file;

import java.io.File;
import java.util.Scanner;

public class FileTest2 {
	public static void main(String[] args) {
		File file = new File("c:\\");
		//list
		//파일이라면 파일 크기 출력
		//디렉터리라면 폴더입니다. 출력

		String [] ar = file.list();

		
		
		for(int i=0; i<ar.length; i++) {
			
			File file2 = new File("c:\\"+ar[i]);
			
			if(file2.isFile()) {
				System.out.println(file2.length());
			}else if(file2.isDirectory()) {
				System.out.println("폴더입니다. ");
			}
			
		}
		
		

	}
	

}
