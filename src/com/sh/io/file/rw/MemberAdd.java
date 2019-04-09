package com.sh.io.file.rw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberAdd {
	public void backup(ArrayList<Member> ar) {
		File file = new File("c:\\test", "readTest.txt");
		FileWriter fw = null;//예외발생할 수 있으니까 미리 써준다. 


		try {
			//선생님이 한 부분
			fw = new FileWriter(file);
			fw.write("start\r\n");
			for(Member m :ar) {
				StringBuffer sb = new StringBuffer();
				sb.append(m.getGroup());
				sb.append("-");
				sb.append(m.getName());
				sb.append("-");
				sb.append(m.getAge());
				sb.append("-");
				sb.append(m.getPart());
				sb.append("-");
				sb.append(m.getCompany());
				sb.append("\r\n");
				fw.write(sb.toString());
			}
			
			/*내가 한 부분
			fw = new FileWriter(file, true);
			for(Member member:ar) {
				String group = member.getGroup();
				String name = member.getName();
				int age = member.getAge();
				String part = member.getPart();
				String company = member.getCompany();
				fw.write(group+"-"+name+"-"+String.valueOf(age)+"-"+part+"-"+company+"\r\n");
			}*/
			
			fw.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("백업이 완료되었습니다.");

	}

	public Member addMember(Scanner sc) {
		Member m = new Member();

		System.out.println("그룹명을 입력하세요");
		String group = sc.next();
		m.setGroup(group);

		System.out.println("이름을 입력하세요");
		String name = sc.next();
		m.setName(name);

		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		m.setAge(age);

		System.out.println("파트를 입력하세요");
		String part = sc.next();
		m.setPart(part);

		System.out.println("회사를 입력하세요");
		String company = sc.next();
		m.setCompany(company);

		return m;
	}
}
