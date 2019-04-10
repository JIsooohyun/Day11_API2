package com.sh.network.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerInfo {

	//메서드 : sendClient
	public boolean sendClient(Socket socket, OutputStream os, OutputStreamWriter ow, BufferedWriter bw, Scanner sc ) throws Exception {

		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		System.out.println("클라이언트에게 메세지 입력 : ");
		String s = sc.nextLine();
		bw.write(s);
		bw.write("\r\n");
		bw.flush();
		boolean check = true;
		if(s.equals("exit")) {
			check =! check;
		}

		return check;
	}

	//메서드 : receiveClient
	public boolean receiveClient(Socket socket,InputStream is,InputStreamReader ir, BufferedReader br) throws Exception {

		Scanner sc = new Scanner(System.in);

		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		String s = br.readLine();
		boolean check = true;
		if(s.equals("exit")) {
			check =! check;
		}else {
			System.out.println("Message : "+s);
		}

		return check;
	}
}
