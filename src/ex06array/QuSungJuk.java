package ex06array;

import java.util.Scanner;

/*
다음 조건에 맞는 프로그램을 작성하시오.
1] 학생수를 사용자로부터 입력받는다.
	-Scanner클래스 사용
2] 입력받은 학생수만큼 국영수 점수를 저장할 수 있는 int형 배열을 선언한다.
3] 다시 학생수만큼 각 학생의 국영수 점수를 입력받아 2]에서 생성한 배열에 저장한다.
	-Scanner클래스 사용
4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력하여라. 
5] 이 문제는 2차원 배열을 활용하는 문제이다.

실행결과]
학생수를 입력하세요?3
학생수:3
[1번째 학생의 점수 입력]
국어점수 입력?77
영어점수 입력?78
수학점수 입력?79
[2번째 학생의 점수 입력]
국어점수 입력?82
영어점수 입력?83
수학점수 입력?84
[3번째 학생의 점수 입력]
국어점수 입력?97
영어점수 입력?98
수학점수 입력?99
==========================
NO KOR ENG MAT TOT AVG
==========================
1  77  78  79  234 78.00
2  82  83  84  249 83.00
3  97  98  99  294 98.00
==========================

 */
public class QuSungJuk
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생수를 입력하세요?");
		int a = scanner.nextInt();
		System.out.println("학생수:"+ a);
		
		int[][] arr = new int [3][3];
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.printf("[%d번째 학생의 점수 입력%n]", i+1);
			System.out.println("국어점수 입력:");
			arr[i][0] = scanner.nextInt();
			System.out.println("영어점수 입력:");
			arr[i][1]= scanner.nextInt();
			System.out.println("수학점수 입력:");
			arr[i][2] = scanner.nextInt();
		}
		System.out.println("===========================");
		
		System.out.println("NO KOR ENG MATH TOT AVG");
		
		System.out.println("===========================");
		
		for(int k=0 ; k<arr.length ; k++) {
			System.out.printf("%d %d %d %d %d %.2f\n", k+1, arr[k][0],arr[k][1],arr[k][2],
				                (arr[k][0]+arr[k][1]+arr[k][2]),
				                ((arr[k][0]+arr[k][1]+arr[k][2]) / 3.0));
			
		}System.out.println("===========================");

	}

}
