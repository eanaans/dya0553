package net.hb.day22;

public class Tow {

	public static void main(String[] args) {
		int su = 0;

		while (true) {
			try {
				su++;
				System.out.print(su + "\t");
				if(su%5 == 0) System.out.println();
				Thread.sleep(200);
				
			} catch (Exception ex) {}
			
			}// while end
			//함수를 2개로 쪼갠다, 아니면 하나만 함수로 구현
		

	}// main end
	
	public void soc (){
		int kor = 85, eng = 90, sum =0;
		sum =kor + eng;
		System.out.println("\n국어=" + kor);
		System.out.println("영어=" + eng);
		System.out.println("총점=" + sum);
	}

}// class end
