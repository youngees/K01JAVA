package ex05method;
/*
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서
섭씨로 변환하여 리턴하는 함수를 만들어라.
공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8
*/
import java.util.Scanner;

public class QuTemperature {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("섭씨를 입력해주세요.");
		double c = scanner.nextDouble();
		System.out.print("화씨를 입력해주세요.");
		double f = scanner.nextDouble();
		
		System.out.println("섭씨=>화씨=" + fahrenheit(c));
		System.out.println("화씨=>섭씨=" + celsius (f));
	}
	static double fahrenheit(double c) {
		double fa = 1.8* c +32;
		return fa;
	}
	static double celsius(double f) {
		double ce =(f-32) /1.8;
		return ce;
		//return (f-32) /1.8; -> 이렇게 한줄만 작성해도 가능
	}
}

