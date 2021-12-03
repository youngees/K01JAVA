package ex04controlstatement;
/*
 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
 실행결과]
 * * * * *
 * * * *
 * * *
 * *
 *
 */
public class Qu_04_08 {

	public static void main(String[] args) {
		
		for (int i=5 ; i>=1 ; i--) {
		   for(int k=1 ; k<=i ; k++) {
			   System.out.print("*");
		   }System.out.printf("\n");
		}
	}
}

/*

[선생님 버전]
1번째
//*를 출력할 행의 갯수를 상수로 표현
 
//  ROW(행의갯수) - x + 1
//    : 변수 x가 증가함에 따라 점점 감소하는 y를 표현하기 위한 일반식 정의
//  x가 1일때: 5 - 1 + 1 =5
//  ....
//  x가 5일때 : 5 - 5 + 1 =1

final int ROW = 5;
for(int x=1; x<=ROW; x++) {
	for(int y=1 ; y<=(ROW-x+1) ; y++) {
		System.out.print("* ");
	}
	System.out.println("");
}
 */

/*
 2번째 방법
 // n과 m의 크기를 통해 반복횟수를 제한한다.
  for(int n=1 ; n<=5 ; n++)	{
     for(int m=1 ; m<=5 ; m++) {
         if(n<=m){
         System.out.println("* ");
        }
     }
     System.out.println("");
  } 
 */
