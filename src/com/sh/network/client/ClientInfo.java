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

public class ClientInfo {


	//메서드 :sendServer
	public boolean sendServer(Socket s, OutputStream os, OutputStreamWriter ow, BufferedWriter bw ,Scanner sc ) throws Exception {


		os = s.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		System.out.println("서버로 보낼 메세제를 입력해주세요");
		String str = sc.nextLine();
		bw.write(str);
		bw.write("\r\n");
		bw.flush();

		boolean check = true;
		if(s.equals("exit")) {
			check =! check;
		}

		return check;


	}//메서드

	//메서드 : receiveServer
	public boolean receiveServer(Socket s, InputStream is, InputStreamReader ir, BufferedReader br) throws Exception {
		
			is = s.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			String str = br.readLine();
			boolean check = true;
			if(s.equals("exit")) {
				check =! check;
			}else {
				System.out.println("Message : "+s);
			}

			return check;

	}//메서드

}
