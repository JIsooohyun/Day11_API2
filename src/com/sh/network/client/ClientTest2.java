package com.sh.network.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		try {
			socket = new Socket("211.238.142.30", 8180);
			System.out.println("서버연결 성공");
			while(true) {
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os);
				
				bw = new BufferedWriter(ow);
				System.out.println("서버로 보낼 메세지를 입력해주세요");
				String str = sc.nextLine();
				bw.write(str);
				bw.write("\r\n");
				bw.flush();
				if(str.equals("exit")) {
					break;
				}
				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				str = br.readLine();
				System.out.println("Name : "+str);
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
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("클라이언트 종료");
	}
}
