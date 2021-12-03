package quiz;

import java.util.Random;

/*
중복되지 않는 난수 10개(1~99)를 생성하여 크기가 10인 배열에 담는다.
오름차순으로 버블정렬한다.(1, 2, 3 …… 10)
버블정렬이란 모든 배열요소를 순차적으로 비교하여 스왑(교환)하는 알고리즘이다.
단, 정렬되는 과정을 모두 출력해야 한다.
위 그림은 버블정렬을 이용하여 오름차순으로 정렬하는 과정이다.
 */

public class BubbleSort
{
	public static void main(String[] args)
	{
		//중복되지 않은 난수를 생성
		Random random = new Random();
		int[] arr = new int[10];
		while(true) {
			//난수10개를 생성
			for(int i=0 ; i<arr.length ; i++) {
				arr[i] = random.nextInt(100)+1;
			}
			//중복체크 위한 변수
			boolean rndFlag = false;
			
			//중복확인
			for(int i=0 ; i<arr.length ; i++) {
				for(int j=0 ; j<arr.length ; j++) {
					if(arr[i]==arr[j] && i!=j) {
						rndFlag = true;// 중복된 값이 발견되면 true로 변경
					}
				}
			}
			//중복된 값이 없다면 break로 while루프 탈출
			if(rndFlag==false) break;
			System.out.println("난수생성시도");
		}

		//생성된 난수를 출력
		//난수확인
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		//버블정렬
		int temp;
		/*
		크기가 10인 배열이므로 스캔은 9번만 반복하면 된다.
		즉, i의 증가치는 0~8까지 변하게 된다. 
		*/
		for(int i=0 ; i<arr.length-1 ; i++) {
			/*
			실제 요소값에 대한 비교를 진행하여 큰 숫자를 뒤로 보내준다.
			즉, 요소1과 2를 비교하여 요소1이 크다면 두 요소를 교환(swap)한다.
			한번 스캔을 완료하면 가장 큰 숫자가 제일 뒤로 밀리게 되므로
			비교의 구간을 하나 줄여주기 위해 i를 차감한다. 
			 */
			for(int j=0 ; j<(arr.length-1)-i ; j++) {
				//앞에 숫자가 더 크다면 뒤의 숫자와 교환한다.
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			for(int k=0 ; k<arr.length ; k++) {
				System.out.print(arr[k]+ " ");
			}
			System.out.println();
		}
		//정렬된 난수를 출력
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}

