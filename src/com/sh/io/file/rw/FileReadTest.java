package com.sh.io.file.rw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {

	public static void main(String[] args) {

		File file = new File("c:\\test", "readTest.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			//"abc \n def"  -> \n은 엔터의 역할
			// \n 개행문자
			fr = new FileReader(file);
			br = new BufferedReader(fr); //문자열로 바꿔주는 보조스트림
			//읽는 것을 몇번 해야 할지 모르기 때문에 while문을 사용한다.
			String str=null;
			while(true) {  //null이 아니면 true
				str = br.readLine();
				if(str==null){
					break;
				}
				//문자열 한줄만 읽어온다.
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//자원해제 -> 연결된 역순으로!!!
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println("종료합니다.");

	}

}
