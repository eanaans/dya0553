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
			//�Լ��� 2���� �ɰ���, �ƴϸ� �ϳ��� �Լ��� ����
		

	}// main end
	
	public void soc (){
		int kor = 85, eng = 90, sum =0;
		sum =kor + eng;
		System.out.println("\n����=" + kor);
		System.out.println("����=" + eng);
		System.out.println("����=" + sum);
	}

}// class end
