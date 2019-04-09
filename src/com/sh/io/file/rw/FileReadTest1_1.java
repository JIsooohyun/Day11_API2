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
		
		File file = new File("c:\\test", "readTest.txt");
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<Member> ar = new ArrayList<Member>(); //값을 모아준다.
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
				Member member = new Member();
				member.setGroup(names[0]);
				member.setName(names[1]);
				member.setAge(Integer.parseInt(names[2]));
				member.setPart(names[3]);
				member.setCompany(names[4]);
				ar.add(member);
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
		for(Member s:ar) {
			System.out.print("그룹 : "+s.getGroup());
			System.out.print(", 이름 : "+s.getName());
			System.out.print(", 나이 : "+s.getAge());
			System.out.print(", 파트 : "+s.getPart());
			System.out.print(", 회사 : "+s.getCompany());
			System.out.println();
		}
	}

}
