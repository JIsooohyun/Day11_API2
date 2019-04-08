package coo.sh.io.file;

import java.io.File;
import java.util.Scanner;

public class FileTest4_1 {

	public static void main(String[] args) {

		//c:\\test
		//입력한 디렉터리가 있으면 삭제, 없으면 만들기


		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\test");
		String [] ar2 = file.list();

		System.out.println("디렉터리명을 입력하세요");
		String name = sc.next();

		for(int i=0; i<ar2.length; i++) {
			File file2= new File(file, name);
			if(ar2[i].equals(name)) {
				file2 = new File(file, ar2[i]);
				file2.delete();
				System.out.println("같은 디렉터리가 있다.");
				break;

			}else {

				System.out.println("디렉터리가 없다. ");
				file2.mkdir();

			}
		}
		
		
	}
	
	
	public void teacher() {
		Scanner sc = new Scanner(System.in);
		System.out.println("폴더명 입력");
		String name = sc.next();
		File file = new File("c://test", name);
		
		if(file.exists()) {
			file.delete();
		}else {
			file.mkdir();
		}
	}
}