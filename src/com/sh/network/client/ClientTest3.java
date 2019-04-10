package com.sh.network.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socket socket = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br =  null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		try {
			socket = new Socket("211.238.142.30", 8180);
			System.out.println("Client : 서버연결 성공했어요~");
			
			while(true) {
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				System.out.println("1.점심 / 2.저녁 / 3.아무거나");
				String str = sc.nextLine();
				bw.write(str);
				bw.write("\r\n");
				bw.flush();
				
				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				str = br.readLine();
				System.out.println("오늘 메뉴는 : "+str+"입니다.");
			}
		} catch (Exception e) {
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
	}
}
