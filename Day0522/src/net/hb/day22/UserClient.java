package net.hb.day22;
import   java.lang.*; 
import    java.net.*  ;
import    java.io.*;
public class  UserClient {  //�����ϴ� client�� ���α׷� ����
	public static void main(String[ ] args)   throws Exception   {
		try{
		//����1 ->���� ip�� ��Ʈ��ȣ 
		Socket  socket = new Socket("203.236.209.120", 1111) ;

		//����4  �������� ������  InputStream/OutputStream �� ������
	//	InputStream  is =  socket.getInputStream( ) ;  // ���� �޾ƿ��� ��
		OutputStream  os = socket.getOutputStream( ) ; // �������� �ִ°�

		//����5  while���� ���ؼ� �������� ���� ��/����� char�� �ְ�ް��� 
		//BufferedReader   br = new  BufferedReader( new InputStreamReader( is ) ) ;
		PrintWriter   pw =  new  PrintWriter(  new OutputStreamWriter( os ) )  ;
		BufferedReader   key = new  BufferedReader( new InputStreamReader( System.in ) ) ;
		while(true) {
			System.out.print("�޼���: " ) ;
			String data= key.readLine( ) ;
			if(data == null) break ;
		   //Client�ʿ��� ������  ���뺸��
			pw.println( data );  		  pw.flush( ) ;
		} //while END
		key.close( ) ; /* br.close( );*/  pw.close( ) ;  socket.close( ) ; 
		} catch(Exception  ex) {   } 
	}//main END
} // class END