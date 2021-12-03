package ex06array;
/*
다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다.
배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여
counter 배열에 순서대로 저장하시오.

샘플코드]
int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
int[] counter = new int[4];


실행결과]
counter[0] => 3
counter[1] => 2
counter[2] => 2
counter[3] => 4

 */
public class QuNumberCounter
{

	public static void main(String[] args)
	{
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		for(int a=0; a<answer.length; a++) {
			for(int c=0; c<4; c++) {
				if(answer[a]==c+1) 
				counter[c]++;
			}
		}
		for(int a=0; a<counter.length; a++) {
			System.out.printf("counter[%d]=> %d\n", a, counter[a]); 
		}
	}
}

/*
[선생님 버전]

public static void main(String[] args)
	{
	    //문제에서 주어진 샘플코드
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		//배열선언시 크기만 지정되는 경우 0으로 초기화된다.
		int[] counter = new int[4];
		
		//answer 배열의 크기만큼 반복
		for(int i=0; i<answer.length; i++) {
		 //i번째 인덱스 요소가 만약 1이라면 i번째 요소를 1 증가시킨다.
				if(answer[i]==1) counter[0]++; //증가연산자 사용
				if(answer[i]==2) counter[1] += 1; //복합대입연산자 사용
				if(answer[i]==3) counter[2] = counter[2]+1; //산술연산자 사용
				if(answer[i]==4) counter[3] = counter[3]+1;
		}
		//counter 배열 출력
		for(int i=0; i<counter.length ; i++) {
		  //0번째 요소에는 1의 갯수가 입력되어있다.
		  System.out.printf("counter[%d] %d의갯수:%d%n",i,i+1,counter[i]);
		} 
	}

 */

