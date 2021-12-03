package ex03operator;

public class E08BitShiftOperator {

	public static void main(String[] args) {
		
		/*
		 비트 쉬프트 연산 : 각 비트를 정해진 크기와 방향으로 이동시키는
		    연산. 좌측으로 쉬프트하면 2배 커지고, 우측으로 쉬프트하면 2배
		    적어지는 특징이 있다.
		 */ 
		System.out.println(2 << 1);
		System.out.println(2 << 2);
		System.out.println(2 << 3);
		System.out.println("================");
		
		int num = 8;
		int sh1=1, sh2=2, sh3=3, sh4=4, sh5=5;
		
		System.out.println("Right shift 연산자");
		System.out.println(num >> sh1);
		System.out.println(num >> sh2);
		System.out.println(num >> sh3);
		System.out.println(num >> sh4);
		System.out.println(num >> sh5);
		System.out.println("================");
		System.out.println(num >>> sh1);
		System.out.println(num >>> sh2);
		System.out.println(num >>> sh3);
		System.out.println(num >>> sh4);
		System.out.println(num >>> sh5);
		System.out.println("================");

		System.out.println("Left shift 연산자");
		System.out.println(num << sh1);
		System.out.println(num << sh2);
		System.out.println(num << sh3);
		System.out.println(num << sh4);
		System.out.println(num << sh5);
		System.out.println("================");
	}
	


}
