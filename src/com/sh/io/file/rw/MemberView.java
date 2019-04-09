package com.sh.io.file.rw;

import java.util.ArrayList;

public class MemberView {
	public void view(String s) {
		System.out.println(s);
	}
	
	//member 하나를 출력하는 메서드 
	public void view(Member s) {
		System.out.print("그룹 : "+s.getGroup()+" \t");
		System.out.print("이름 : "+s.getName()+" \t");
		System.out.print("나이 : "+s.getAge()+" \t");
		System.out.print("파트 : "+s.getPart()+" \t");
		System.out.print("회사 : "+s.getCompany()+" \t");
		System.out.println();
	}
	
	public void view(ArrayList<Member> ar) {

		for(Member s:ar) {
			System.out.print("그룹 : "+s.getGroup()+" \t");
			System.out.print("이름 : "+s.getName()+" \t");
			System.out.print("나이 : "+s.getAge()+" \t");
			System.out.print("파트 : "+s.getPart()+" \t");
			System.out.print("회사 : "+s.getCompany()+" \t");
			System.out.println();
		}
		
	}

}
