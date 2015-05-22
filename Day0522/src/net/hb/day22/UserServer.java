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
			System.out.println("�������� ����...���Ӵ����...");
			
			Socket sk = server.accept();//���Ӽ���
			System.out.println("�������� ���Ӽ���!!!");
			
			InetAddress juso = sk.getInetAddress();
			
			//3�ܰ迡�� ����Ÿ�� �ְ� �ޱ����ؼ� ioó.�� =>Byteó�� =>�ѱ��ڸ� ascii �ѱ��ڸ� �޴´�.
			InputStream is = sk.getInputStream();
			OutputStream os = sk.getOutputStream();
			
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			while(true){
				String str = br.readLine();
				if(str==null) break;
				System.out.println("client�� ����:"+str);
			}
		} catch(Exception ex){
		
	}
	
	}
}
