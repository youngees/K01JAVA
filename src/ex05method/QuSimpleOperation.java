package ex05method;
/*
두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 
단 나눗셈은 몫과 나머지를 각각 출력해야 한다. 파라메타로 전달되는 두 숫자는 
모두 0 이상의 양의 정수이다.
메소드명 : arithmetic()

실행결과]
덧셈결과 -> 177
뺄셈결과 -> 23
곱셈결과 -> 7700
나눗셈 몫 -> 1
나눗셈 나머지 -> 23

*/
import java.util.Scanner;

public class QuSimpleOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 정수:");
		int i = scanner.nextInt();
		System.out.print("두번째 정수:");
		int k = scanner.nextInt();
		arithmetic(i,k);
	}
	//반환값은 없고, 매개변수만 있는 메소드
    static void arithmetic(int h, int s) {
    	
    	System.out.println("덧셈결과->"+(h+s));
    	System.out.println("뺄셈결과->"+(h-s));
    	System.out.println("곱셈결과->"+(h*s));
    	System.out.println("나눗셈 몫->"+(h/s));
    	System.out.println("나눗셈 나머지->"+(h%s));
    	
//    	System.out.printf("덧셈:%d + %d = %d\n",h,s,(h+s));
//    	System.out.printf("뺄셈:%d - %d = %d\n",h,s,(h-s));
//    	System.out.printf("곱셈:%d * %d = %d\n",h,s,(h*s));
//    	System.out.printf("나눗셈:%d / %d = %d\n",h,s,(h/s));
    	//%기호를 콘솔에 출력하기 위해서 이스케이프 시퀀스를 사용함
//    	System.out.printf("나머지:%d %% %d =%d\n",h,s,(h%s));
//    	
    }
    
}

