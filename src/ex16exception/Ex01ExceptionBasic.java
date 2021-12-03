package ex16exception;

import java.io.IOException;

public class Ex01ExceptionBasic
{

	public static void main(String[] args) 
	{
		/*
		Syntax에러(구문에러, 문법에러)
		    : 실행자체가 안되는 코드로 오류를 수정해야만 정상적으로
		    실행된다. 즉 코드에 문법적인 오류가 발생되었음을 의미한다.
		 */
//		Int number = 10; // -> int를 Int로 표기했음
//		if(true);
//		{}
//		else /// -> if문이 세미콜론으로 종료되어 의미없는 else문이 됨
//		{}
		
		int number = 10;
		if(true) {
			System.out.println("참이다");
		}
		else {
			System.out.println("거짓이다");
		}
		
		
		/*
		외부자원을 사용할 때 발생되는 예외
		처리방법1] main() 메서드 밖으로 에외를 던진다. 이것을 "예외던지기"라고
		표현하고, 내부에서 예외를 처리하지않고 무시하겠다는 의미이다.
		이 경우 main() throws IOException 처럼 작성하면 된다.
		 */
		
		System.out.print("문자하나를 입력하세요:");
		/*
		처리방법2] 예외가 발생한 지점을 try~catch문으로 직접 예외처리한다.
		 */
		try {
			int iChar = System.in.read();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
