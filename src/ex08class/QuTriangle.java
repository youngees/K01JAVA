package ex08class;
/*
밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의해보자. 
init메소드를 통해 밑변과 높이를 초기화한다.
그리고 밑변과 높이를 변경시킬수 있는 메소드와 삼각형의 넓이를 계산해서
반환하는 메소드도 함께 정의해보자.

실행결과]
밑변 * 높이 / 2
삼각형의 넓이 : 85.0
삼각형의 넓이 : 350.0

 */
public class QuTriangle
{
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}
}
class Triangle {
	int bo;
	int he;
	double Area;
	
	void init (int a, int b) {
	  bo = a;
	  he = b;
	}
	void setBottom(int a) {
		bo = a;
	}
	void setHeight(int b) {
		he = b;
	}
	double getArea() {
		Area = bo * he / 2 ;
		return Area;
	}
}

/*
[선생님 버전]

class Triangle {
	
	//멤버변수
	int bottom;//밑변
	int height;//높이
	double Area;
	
	//밑변과 높이를 초기화
	void init (int bottom, int height) {
	   //this를 통해 멤버변수와 매개변수를 구분할 수 있다.
	   this.bottom = bottom;
	   this.height = height;
	}
	//밑변을 변경
	void setBottom(int bottom) {
		this.bottom = bottom;
	}
	//높이를 변경
	void setHeight(int height) {
		 this.height = height;
	}
	//삼각형의 넓이를 계산 후 반환
	double getArea() {
		retrun (bottom * height * 0.5);
	}
}
 */
