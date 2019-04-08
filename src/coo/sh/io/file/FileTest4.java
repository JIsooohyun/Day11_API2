package coo.sh.io.file;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class FileTest4 {

	public static void main(String[] args) {
		
		

		
	}
	
	public void me() {
		File file = new File("c:\\test\\iu");
		Scanner sc = new Scanner(System.in);
	
		//이미지 파일을 제외한 나머지를 삭제

		String [] ar = file.list();

		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
			if(ar[i].lastIndexOf(".jpg")<0) {
				File file2 = new File(file, ar[i]);
				file2.delete();
			}
		}//for문

	}
	
	public void teacher() {
		File file = new File("c:\\test\\iu");
		//확장자, bmp, jpg, gif, png
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("bmp", "img");
		map.put("jpg", "img");
		map.put("gif", "img");
		map.put("png", "img");
		
		String [] names = file.list();
		for(int i=0; i<names.length; i++) {
			int index = names[i].lastIndexOf('.');
			String n = names[i].substring(index+1);
			if(!(map.get(n)!=null && map.get(n).equals("img"))) {
				File file2 = new File(file, names[i]);
				file2.delete();
			}
		}
		
		
	}

}










