package ex08class;
/*
기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를
출력하는 계산기 클래스를 정의해보자.
아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고
해당 수치는 임의로 바꿔도 된다. init() 멤버메소드에서는 계산의 결과를 
카운트하는 멤버변수를 0으로 초기화 한다.


실행결과]
1 + 2 = 3.0
10.5 - 5.5 = 5.0
4.0 * 5.0 = 20.0
100 / 25 = 4.0
10.0 * 3.0 = 30.0
덧셈횟수 : 1
뺄셈횟수 : 1
곱셈횟수 : 2
나눗셈횟수 : 1

 */
public class QuSimpleCalculator
{
	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}
}

class CalculatorEx {
	
//	double a; => 꼭 정의 하지않아도 되는듯
//	double d; =>            ''
	
	//계산의 횟수 카운트위한 멤버변수
	int addCount, minCount, mulCount, divCount;
	
	//사칙연산 수행
    double add(double a, double d) {
        addCount++;
    	double k = a+d;
    	return k;
    	//return a + d; => 이렇게만 적어도 됨
    }
    double min(double a, double d) {
    	minCount++;
    	double k = a-d;
    	return k;
    }	
    double mul(double a, double d) {
    	mulCount++;
    	double k = a*d;
    	return k;
	}
    double div(double a, double d) {
    	divCount++;
    	double k = a/d;
    	return k;
    }
    //멤버변수 초기화 메서드
    void init() {
    	addCount = 0;
    	minCount = 0;
    	mulCount = 0;
    	divCount = 0;
    }
    //연산의 횟수 출력
	void showOpCount() {
		System.out.println("덧셈횟수 : "+ addCount);
		System.out.println("뺄셈횟수 : "+ minCount);
		System.out.println("곱셈횟수 : "+ mulCount);
		System.out.println("나눗셈횟수 : "+ divCount);
	}
}