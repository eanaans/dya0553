package net.hb.day22;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class UserServer {

	public static void main(String[] args) {
		try{
			ServerSocket server = new ServerSocket(111) ;
			System.out.println("서버소켓 생성...접속대기중...");
			
			Socket sk = server.accept();//접속성공
			System.out.println("서버소켓 접속성공!!!");
			
			InetAddress juso = sk.getInetAddress();
			
			//3단계에서 데이타를 주고 받기위해서 io처.리 =>Byte처리 =>한글자만 ascii 한글자만 받는다.
			InputStream is = sk.getInputStream();
			OutputStream os = sk.getOutputStream();
			
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			while(true){
				String str = br.readLine();
				if(str==null) break;
				System.out.println("client쪽 내용:"+str);
			}
		} catch(Exception ex){
		
	}
	
	}
}
