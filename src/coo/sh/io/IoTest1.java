package coo.sh.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class IoTest1 {

	public static void main(String[] args) {
		System.out.println("입력");
		InputStream is = System.in;  //byte처리 용도 
		
		//read메서드
		try {
			int num = is.read();
			System.out.println(num);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}
}
