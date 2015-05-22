package net.hb.day22;
import   java.lang.*; 
import    java.net.*  ;
import    java.io.*;
public class  UserClient {  //접속하는 client쪽 프로그램 시작
	public static void main(String[ ] args)   throws Exception   {
		try{
		//순서1 ->서버 ip와 포트번호 
		Socket  socket = new Socket("203.236.209.120", 1111) ;

		//순서4  소켓으로 접속한  InputStream/OutputStream 값 얻어오기
	//	InputStream  is =  socket.getInputStream( ) ;  // 내가 받아오는 거
		OutputStream  os = socket.getOutputStream( ) ; // 서버에게 주는거

		//순서5  while문을 통해서 소켓으로 받은 입/출력을 char로 주고받게함 
		//BufferedReader   br = new  BufferedReader( new InputStreamReader( is ) ) ;
		PrintWriter   pw =  new  PrintWriter(  new OutputStreamWriter( os ) )  ;
		BufferedReader   key = new  BufferedReader( new InputStreamReader( System.in ) ) ;
		while(true) {
			System.out.print("메세지: " ) ;
			String data= key.readLine( ) ;
			if(data == null) break ;
		   //Client쪽에서 서버로  내용보냄
			pw.println( data );  		  pw.flush( ) ;
		} //while END
		key.close( ) ; /* br.close( );*/  pw.close( ) ;  socket.close( ) ; 
		} catch(Exception  ex) {   } 
	}//main END
} // class END