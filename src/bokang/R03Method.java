package bokang;

import java.util.Scanner;

public class R03Method
{
	//메서드 타입1 : 구구단 출력
	public static void guguPrint() {
		//2단에서 9단까지 출력하는 구구단
		for(int dan=2 ; dan<=9 ; dan++) {
			for(int su=1; su<=9; su++) {
				//dan이 2로 고정된 상태에서 su는 1~9까지 증가된다.
				System.out.print(dan+"*"+su+"="+(dan*su)+" ");
			}
			//2단이 출력되면 줄을 바꿔주고 dan이 1 증가한다.
			System.out.println();
		}
	}
	//메서드 타입2 : 주어진 범위를 출력하는 구구단
	public static void guguRangeShow(int n1, int n2) {
		//매개변수로 전달된 n1단에서 n2단까지 출력하는 형태
		for(int dan=n1 ; dan<=n2 ; dan++) {
			for(int su=1; su<=9; su++) {
				System.out.printf("%2d*%2d=%2d ",dan,su,(dan*su));
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		/*
		시나리오] 구구단을 출력하는 메소드를 작성하시오.
			메소드명 : guguPrint()
			주의] main메소드에서 호출하므로 정의하는 메소드는 
			반드시 static으로 선언해야 한다.
			※매개변수도 없고, 반환타입도 없는 경우
		 */
		System.out.println("매개변수 X, 반환값 X");
		guguPrint();
		
		/* 시나리오]매개변수로 2개의 정수를 전달하여 해당 범위의 
		구구단을 출력하는 메소드를 작성하시오.
		만약 2, 5가 전달된다면 2단, 3단, 4단, 5단만 출력된다.
		메소드명 : guguRangeShow(int n1, int n2)
		※매개변수는 있고, 반환타입은 없는 메소드
		*/
		System.out.println("매개변수 O, 반환값 X");
		guguRangeShow(2,5);
		
		
		/*
		시나리오] sungjukResult() 메소드를 호출하면 국어,영어,수학
		점수를 입력받은후 평균값을 반환하도록 구현하시오.
		※매개변수X, 반환값O
		 */
		System.out.println("매개변수 X, 반환값 O");
		//반환값이 있는 메서드는 좌측항이 있거나 print()내에서 호출한다.
		//변수 = sungjukResult(); -> 이렇게 작성해도 괜찮음
		System.out.println("평균값은? "+sungjukResult());
		
		/*
		시나리오] 정수 하나를 매개변수로 전달하면 1부터 해당 매개변수
		까지의 합을 구하여 결과값을 반환하는 메소드를 작성하시오.
		메소드명 : numberPlus(int endNum) 
		※매개변수O, 반환값O
		 */
		System.out.println("매개변수 O, 반환값 O");
		int inputNum = 100;
		int total = numberPlus(inputNum);
		System.out.println(inputNum+"까지의 합은:"+ total);
		
		
		/* 
		연습문제] 다음과 같은 출력결과를 보이는 프로그램을 메소드로 구현하시오
		메소드명 : upgradeGugu()
		실행결과] 
		---------- java ----------
		2x1=2 2x2=4
		3x1=3 3x2=6 3x3=9
		4x1=4 4x2=8 4x3=12 4x4=16
		5x1=5 5x2=10 5x3=15 5x4=20 5x5=25
		6x1=6 6x2=12 6x3=18 6x4=24 6x5=30 6x6=36
		7x1=7 7x2=14 7x3=21 7x4=28 7x5=35 7x6=42 7x7=49
		8x1=8 8x2=16 8x3=24 8x4=32 8x5=40 8x6=48 8x7=56 8x8=64
		9x1=9 9x2=18 9x3=27 9x4=36 9x5=45 9x6=54 9x7=63 9x8=72 9x9=81
		*/
		System.out.println("연습문제(업글구구)");
		upgradeGugu();
		
	}////end of main
	
	//타입3 : 세과목의 평균값을 반환하는 메서드
	public static double sungjukResult() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수:");
		int kor = scanner.nextInt();
		System.out.print("영어점수:");
		int eng = scanner.nextInt();
		System.out.print("수학점수:");
		int math = scanner.nextInt();
		//실수(double)의 결과를 얻기위해 3.0으로 나눠준다.
		double result = (kor+eng+math) / 3.0;
		return result;
	}
	
	//타입4 : 주어진 값까지의 합을 구해서 반환하는 메서드
	public static int numberPlus(int endNum) {
		int total = 0;
		//정수의 합은 정수이므로 반환타입은 int로 결정하면 된다.
		for(int i=1 ; i<=endNum ; i++) {
			total+=i;
		}
		return total;
	}
	
	//연습문제] 업글 구구
	public static void upgradeGugu() {
		/*
		일반적인 구구단은 각 단마다 1~9까지 출력된다.
		하지만 업글 구구단은 2단은 2까지, 5단은 5까지만 출력되므로
		su의 반복을 dan만큼으로 제한하면 된다.
		 */
		for(int dan=2 ; dan<=9 ; dan++) {
			for(int su=1 ; su<=dan ; su++) {
				System.out.printf("%2d*%2d=%2d ",dan,su,(dan*su));
			}
			System.out.println();
		}
	}
}
