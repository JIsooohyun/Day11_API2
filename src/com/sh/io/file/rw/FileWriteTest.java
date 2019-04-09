package com.sh.io.file.rw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {

	public static void main(String[] args) {
		File file = new File("c:\\test", "writeTest.txt");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file, true);  //true로 apend하면 추가로 붙이쟈!
											   //false로 하면 덮어 씌우쟈
			fw.write("Five Write\r\n");
			fw.flush(); //버퍼를 강제로 비우세요
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("파일 작성 완료");
	}

}
