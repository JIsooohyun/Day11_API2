package com.sh.io.file.rw;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {

	public void start() {
		Member m = new Member();
		MemberAdd ma = new MemberAdd();
		MemberInfo mi  = new MemberInfo();
		MemberView mv = new MemberView();
		ArrayList<Member> ar = null;
		String name = null;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.멤버정보가져오기");
			System.out.println("2.멤버정보출력하기");
			System.out.println("3.멤버검색하기");
			System.out.println("4.그룹검색하기");
			System.out.println("5.멤버추가하기");
			System.out.println("6.백업");
			System.out.println("7.종료");

			int select = sc.nextInt();

			if(select == 1) {
				ar =mi.getMembers();
				System.out.println();
			}else if(select == 2) {
				mv.view(ar);
				System.out.println();
			}else if(select == 3) {
				m =mi.searchMember(ar, sc);
				if(m!=null) {
					mv.view(m);
				}else {
					mv.view("이름이 없습니다.");
				}
			}else if(select==4){
				ArrayList<Member> search = mi.searchGroup(sc, ar);
				if(search.size()>0) {
					mv.view(search);
				}else {
					mv.view("해당 데이터가 없습니다.");
				}

				
			}else if(select==5){
				Member n1 = ma.addMember(sc);
				ar.add(n1);
			}else if(select == 6){
				ma.backup(ar);
			}else {
				System.out.println("종료");
				break;
			}
		}


	}
}
