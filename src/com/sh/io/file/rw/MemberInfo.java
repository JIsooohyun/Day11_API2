package com.sh.io.file.rw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberInfo {

	private ArrayList<Member> searchCompany(Scanner sc, ArrayList<Member> ar){
		ArrayList<Member> search = new ArrayList<Member>();
		String com = sc.next();
		for(Member m:ar) {
			if(m.getCompany().equals(com)) {
				search.add(m);
			}
		}
		return search;
	};
	private ArrayList<Member> searchTeam(Scanner sc, ArrayList<Member> ar){
		ArrayList<Member> search = new ArrayList<Member>();
		System.out.println("그룹명 입력");
		String group = sc.next();
		for(Member m:ar) {
			if(m.getGroup().equals(group)) {
				search.add(m);
			}
		}
		return search;
	};  //그룹명으로 찾는거 전용
	
	public ArrayList<Member> searchGroup(Scanner sc, ArrayList<Member> ar) {
		ArrayList<Member> search =null;
		Member member = null;
		System.out.println("1.그룹명으로 검색");
		System.out.println("2.소속사로 검색");
		
		int select = sc.nextInt();
		if(select==1) {
			search = this.searchTeam(sc, ar);
		}else {
			search = this.searchCompany(sc, ar);
		}
		return search;

	}
	
	//메서드명 searchMember
	//이름을 입력해서 멤버찾기
	//매개변수 scanner, ArrayList<member>
	public Member searchMember(ArrayList<Member> ar, Scanner sc) {

		Member member = null;
		String name = sc.next();
		for(Member m: ar) {
			if(m.getName().equals(name)) {
				member =m;
				break;
			}
		}
		return member;
	}

	//메서드명
	public ArrayList<Member> getMembers() {
		MemberView mv = new MemberView();
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
		return ar;
	}
}
