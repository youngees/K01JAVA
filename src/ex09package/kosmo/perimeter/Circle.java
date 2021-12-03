package ex09package.kosmo.perimeter;
/*
원의 둘레를 구하기위한 클래스로 perimeter 패키지에 정의하였다.
 */
public class Circle
{
	//멤버변수와 상수를 정의
	double rad;
	final double PI; 
	
	//생성자
	public Circle(double rad) {
		this.rad = rad;
		PI = 3.14159;
	}
	//둘레를 구하기 위한 멤버메서드
	public double getPerimeter() {
		return 2 * PI * rad;
	}
}
