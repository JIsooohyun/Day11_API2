package coo.sh.io.file;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {

		File file = new File("C:\\test\\ex1.txt");  // \로 표시하고 싶으면 \\쓰기 !
		file = new File("c:\\test", "ex1.txt");
		file = new File("c:\\test");
		File file2 = new File(file, "ex1.txt");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());  //여기에 쓰여진 경로가 폴더입니까?
		System.out.println(file.isFile());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.length());  //해당 파일의 크기가 나타난다. 

		File f = new File("c:\\");
		String [] g = f.list();  //파일이나 폴더명을 문자열 배열로 받아오는 것
		File [] lists = file.listFiles();  //파일이나 폴더명을 파일 배열로 받아노는 것

		file = new File("c:\\test\\test2\\iu");  //이렇게는 안만들어진다. 
		//최종적으로 마지막 부분을 만들려고 하는데 중간 부분이 없어서 만들어지지 않는 것
		file.mkdir();
		
		//file.mkdirs("c:\\test\\iu\\test"); //중간에 없는 디렉터리명도 다 만들어진다. 
		file = new File("c:\\test\\test2");
		file.delete();

	}

}
