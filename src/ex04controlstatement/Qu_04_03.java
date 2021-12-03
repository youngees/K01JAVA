package ex04controlstatement;
/*
 아래 코드의 삼항연산자를 if~else문으로 변경하시오. 단, 실행결과는 동일해야 합니다.
 */
public class Qu_04_03 {

	public static void main(String[] args) {
		
		int num1=50, num2=100;
		int big=num2;
		int diff=num2-num1;

		if(num2>num1) { 
			System.out.println(big);
		}
		else {
			System.out.println(diff);
		}
		
		if(num2<num1) { 
			System.out.println(big);
		}
		else {
			System.out.println(diff);
		}
	}
	/*
	 * [선생님버전]
	 
	 int num1=50, num2=100;
	int big, diff;

	//big = (num1>num2)? num1:num2;
	if(num1>num2) {
	    big = num1;
	}
	else {
	    big = num2;
	}
	
	System.out.println(big);

	//diff = (num1>num2)? num1-num2: num2-num1;
	if(num1>num2) {
	   diff = num1-num2;
	}
	else {
	   diff = num2-num1;
	}
	System.out.println(diff); 

	 */
}











