package com.sh.io.file.rw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class FileReadTest1_1 {

	public static void main(String[] args) {
		Member m = new Member();
		File file = new File("c:\\test", "readTest.txt");
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<String> ar = new ArrayList<String>(); //값을 모아준다.
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String str=null;
			br.readLine();
			while(true) {
				str = br.readLine();
				
				if(str==null) {
					break;
				}
				String [] names = str.split("-");
				/*
				for(String s:names) {  //names배열에서 꺼낸 것을 String에 담자
					System.out.println(s);
				}*/
				for(String s:names) {
					ar.add(s);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//모든 이름 출력
		for(String s:ar) {
			System.out.println(s);
		}
	}

}
