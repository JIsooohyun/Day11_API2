package coo.sh.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IoTest2 {
	public static void main(String[] args) {
		//키보드로 부터 받은 문자열을 출력
		//byte로 받아서
		//byte -> 문자
		//문자 -> 문자열
		//결론적으로 스캐너가 돌아가는 원리를 설명한다. 
		System.out.println("입력 : ");
		InputStream is = System.in; //byte를 처리하는 부분
		InputStreamReader ir = new InputStreamReader(is); //문자를 처리
		BufferedReader br = new BufferedReader(ir);
		
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//다 쓰고 나서 자원을 해제해 줘야 한다.
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
	}
}
