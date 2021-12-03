package ex04controlstatement;

import ex01start.E02SystemOutPrintln;

/*
 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을
 작성하시오. 단, 3과 7의 공배수인 경우 합에서 제외해야 한다.
 출력의결과는 누적되는 모든 수를 콘솔에 print한다.
 실행결과]
   3+6+7+~~~~~~=????
 */
public class Qu_04_07 {

	public static void main(String[] args) {
		
		int total = 0;
		for (int i=1 ; i<=100 ; i++) {
			if(i%3==0 || i%7==0) {
				if(i%3==0 && i%7==0) {
					continue;
				}
			    total += i;
			    System.out.print(i);
			    System.out.print("+");
			}
		}System.out.printf("="+total);
		
	}	
}


/*
 [선생님 버전]
 
 int sum = 0;
 //1~100까지 반복
 for(int i=1 ; i<=100; i++) {
     // 3의 배수 혹은 7의 배수
      if(i%3==0 || i%7==0 && 공배수조건을 여기에 넣어도됨) {
          // 3과 7의 공배수가 아닌 정수
		   if(i%(3*7)!=0) {
              sum += i;//누적합
              if(i!=99)
			    System.out.print(i+"+");
			  else
			    System.out.print(i);
			    
			  //또는 System.out.print(i);
			    if(i!=9) System.out.print("+");
			}
	}System.out.println("="+sum); //결과출력
 ]
 */

