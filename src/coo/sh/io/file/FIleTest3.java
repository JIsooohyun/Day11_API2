package coo.sh.io.file;

import java.io.File;

public class FIleTest3 {
	public static void main(String[] args) {
		File file = new File("c:\\test");
		String str = "iu-suji-choa,hani";
		
		str = str.replace(",", "-");
		
		String [] ar = str.split("-");
		
		for(int i=0; i<ar.length; i++) {
			File file2 = new File(file, ar[i]);
			file2.mkdir();
		}
		
		//배열 짜를 것을 파일로 넘기기
		
	}

}
