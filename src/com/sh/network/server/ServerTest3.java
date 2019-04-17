package com.sh.network.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class ServerTest3 {
	public static void main(String[] args) {
		Random random = new Random();
		int index = 0;
		String [] result = null;
		File file = new File("C:\\test");
		FileReader fr = null;
		//BufferedReader brF =  null;

		ServerSocket ss = null;
		Socket socket = null;

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br =  null;

		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;

		String food = null;
		
		ServerMenu sm = new ServerMenu();
		

		try {
			sm.init();
			System.out.println("Server : 클라이언트 접속 받을 준비중입니다.");
			ss = new ServerSocket(8180);
			socket = ss.accept();
			System.out.println("Server : 클라이언트 연결 성공");

			while(true) {
				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				String str = br.readLine();
				
				if(str.equals("1")) {
					food = sm.getLunch();
				}else if(str.equals("2")) {
					food = sm.getDinner();
				}else {
					food ="준비중";
				}
				
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				
				/*내가 짠 소스코드
				if(str.equals("1")) {
					//점심메뉴
					file = new File("C:\\test", "lunch.txt");
					fr = new FileReader(file);
					br = new BufferedReader(fr);

					str = br.readLine();
					result= str.split(",");
					index = random.nextInt(result.length);
					food = result[index];


				}else if(str.equals("2")) {
					//저녁메뉴
					file = new File("C:\\test", "dinner.txt");
					fr = new FileReader(file);
					br = new BufferedReader(fr);

					str = br.readLine();
					result= str.split(",");
					index = random.nextInt(result.length);
					food = result[index];
					System.out.println(food);

				}else {
					//아무거나
					file = new File("C:\\test", "dinner.txt");
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					str = br.readLine();
					
					file = new File("C:\\test", "lunch.txt");
					fr = new FileReader(file);
					br = new BufferedReader(fr);

					str = str+br.readLine();
					
					result= str.split(",");
					index = random.nextInt(result.length);
					food = result[index];
					
				}*/
				bw.write(food);
				bw.write("\r\n");
				bw.flush();

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				socket.close();
				ss.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}



	}
}
