package ex04controlstatement;
/*
 하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 
 구현하시오.	
(System.in.read()를 사용하세요)
 */

import java.io.IOException;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("하나의 문자를 입력하세요:");
		int asciiCode = System.in.read();
		String asciiCode1 = (asciiCode>=48 && asciiCode<=57) ? 
				"입니다":"가 아닙니다.";
	    System.out.println("숫자" + asciiCode1);
	}
	    
	/*
	 * [선생님버전]
	 
	 System.out.print("하나의 문자를 입력하세요:"); //굳이 줄 바꾸지 않아도 되니까
	 int ascii = System.in.read();//=>throws IOException를 자동완성으로 해야 오류가 안뜸
	  
	  //삼항 연산자의 형식
	    변수 = (조건식) ? "참일때" : "거짓일때";
	   
	 * 아스키 코드를 알고있을 때(47~58사이)
	 
	 String result =(ascii>=47 && ascii<=58) ? "숫자입니다" : "숫자가아닙니다";
	 System.out.println((char)ascii+"는"+result);    
	    
	 * 아스키 코드를 모를때                                  
	 
	 result =(ascii>='0' && ascii<='9') ? "숫자입니다" : "숫자가아닙니다";
	 System.out.println((char)ascii+"는"+result); 
	 
	 */

}
