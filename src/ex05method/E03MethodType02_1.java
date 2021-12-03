package ex05method;
/*
 메소드형태2] 매개변수는 없고 반환값은 있는 경우
    : 사용자로부터 입력값을 받은 후 연산을 진행하고, 결과를 반환하는
    난수를 생성하는 경우 주로 사용된다.
 */
public class E03MethodType02_1 {
    
	//1~10까지의  합을 구하는 수열 메서드
	static int noParamYesReturn() {
		int sum =0;
		for(int i=1 ; i<=10; i++) {
			sum += i;
		}
		return sum;
	}
	
	//static으로 선언된 메소드는 static으로 선언된 메소드만 호출할 수 있다.
	public static void main(String[] args) {
		
		/*
		 반환값이 있는 메소드는 주로 printf()문 안이나, 변수의 할당을 위해
		 코드의 우측에서 호출된다.
		 */
		System.out.println("1~10까지의 합:"+ noParamYesReturn());
		
		int sum10 = noParamYesReturn();
		System.out.printf("1~10까지의 합은 %d입니다", sum10);
		//System.out.printf("1~10까지의 합은 %d입니다", noParamYesReturn());=>이것도 된당
	}
}
