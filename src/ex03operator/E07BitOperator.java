package ex03operator;

public class E07BitOperator {

	public static void main(String[] args) {
		/*
		 비트연산자 : 자료를 bit 단위로 논리연산한다.
		 & : 비트 And. 좌우가 둘다 1일때만 1을 반환한다.
		 | : 비트 Or. 좌우 둘 중 하나만 1이면 1을 반환한다.
		 ^ : 비트 XOR. 둘이 같을 때 0을 반환, 다를 때 1을 반환한다.
		 ~ : 비트 NOT. 비트를 반전시켜 반환한다. 0이면 1, 1이면 0.
		 */
		int num1 = 5; // 00000000 00000000 00000000 00000101
		int num2 = 3; // 00000000 00000000 00000000 00000011
		int num3 =-1; // 11111111 11111111 11111111 11111111
		              // 00000000 00000000 00000000 00000001 => 1
		
		/*
		 num3의 값이 -1인 이유는 1을 더했을 때 0이 되기 때문이다.
		 양수 1을 2의 보수를 취하면 -1이 된다.
		 1의보수 : 기존값을 반전시킨 값
		 2의보수 : 1의 보수에 1을 더한 값
		 */
		
		System.out.println("비트AND:"+ (num1 & num2)); //결과1
		System.out.println("비트OR:"+ (num1 | num2)); //결과7
		System.out.println("비트XOR:"+ (num1 ^ num2)); //결과 6
		System.out.println("비트NOT:"+ (~num3)); //결과0

	}

}
