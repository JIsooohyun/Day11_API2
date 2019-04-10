package com.sh.network.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class ServerTest2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		Socket socket = null;
		ServerSocket ss = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;		
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		System.out.println("Server : 클라이언트 접속 받을 준비중");
		try {

			ss = new ServerSocket(8180);
			socket = ss.accept();
			//서버소켓을 포트번호로 열어놓고 소켓과 연결한다.
			System.out.println("Server : 연결성공");
			while(true) {
				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				String s = br.readLine();
				if(s.equals("exit")) {
					break;
				}
				
				String [] r = s.split(" ");
				int le = random.nextInt(r.length); 
				System.out.println(r[le]);
				
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				bw.write(r[le]);
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
		System.out.println("서버 종료");

	}

}
