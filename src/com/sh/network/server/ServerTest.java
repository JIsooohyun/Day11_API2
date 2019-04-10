package com.sh.network.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {

	public static void main(String[] args) {

		ServerInfo si = new ServerInfo();
		ServerSocket ss = null;
		Socket socket = null;

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		OutputStream os = null;
		OutputStreamWriter ow = null; 
		BufferedWriter bw = null;

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("server : 클라이언트 접속 받을 준비중");
			ss = new ServerSocket(8180);
			socket = ss.accept();
			System.out.println("Server : 연결 성공");

			boolean check = true;
			while(true) {
				check = si.receiveClient(socket, is, ir, br);
				if(!check) {
					break;
				}
				check = si.sendClient(socket, os, ow, bw, sc);
				if(!check) {
					break;
				}
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
				ss.close();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("서버 종료됨");

	}

}
