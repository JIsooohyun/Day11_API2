package com.sh.network.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {
		ClientInfo ci = new ClientInfo();
		Socket  s=null;


		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		//요청보내는 클래스

		try {

			s = new Socket("211.238.142.30", 8180);
			System.out.println("서버와 접속 성공");
			boolean check = true;
			while(true) {
				ci.sendServer(s, os, ow, bw, sc);
				if(!check) {
					break;
				}
				ci.receiveServer(s, is, ir, br);
				if(!check) {
					break;
				}
			}



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
			try {
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}



		System.out.println("클라이언트 종료");

	}

}
