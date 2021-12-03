package ex05method;
/*
원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를
 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.
메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름
-둘레공식 : 2 * 3.14 * 반지름


실행결과]
원의 둘레(5.5) : 34.54
원의 넓이(5.5) : 94.985
*/
import java.util.Scanner;

public class QuCircleCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("반지름 값을 입력하세요");
		double i = scanner.nextDouble();
		circleRound(i);
		circleArea(i);
		//반환값이 있는 메서드이므로 print문 안에서 호출한다.
		//System.out.println("원의 둘레: "+ circleRound(i)); ->반환값이 있는 버전
	}
	//반환값이 없으므로 매개변수를 받은 후 결과를 즉시 출력한다.
    static void circleRound(double e) { //원의 둘레
    	System.out.println("원의 둘레: "+ (2*3.14*e));
    }
    static void circleArea (double k) { //원의 넓이
    	System.out.println("원의 넓이: "+(3.14*k*k));
    }
    /*
     static double circleRound(double radian) { 
    	return (2*3.14*radian);
     } ->반환값이 있는 버전
     static void circleArea (double k) { //원의 넓이
    	double result = 3.14 * k * k;
    	System.out.println("원의 넓이: "+ result);
    } -> 반환값이 없는 버전
     */

}


