package quiz;

import java.util.Random;

/*
선택정렬은 전체요소 중에서 최소값을 찾아 첫번째 자리와 교환한다.
1회전을 수행하면 최소값이 맨 앞에 오게되므로 첫번째 자료를 제외한
 나머지 자료에서 다시 최소값을 찾아 두번째 자리와 교환한다. 
이 과정을 반복한다. 
자료가 N개라면 교환은 (N-1)번 이루어진다.

1. 1~100 사이의 중복되지 않는 정수 10개의 난수를 생성한다. 
2. 생성한 난수는 크기 10인 배열에 저장한다. 
3. 위 그림을 참조하여 선택정렬로 오름차순 정렬한다. 
4. 정렬한 결과를 출력한다. 
5. 단 정렬되는 과정을 모두 출력해야 한다. 

 */
public class SelectionSort
{

	public static void main(String[] args)
	{
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
		
		
		//선택정렬
		int temp;
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i ; j<arr.length ; j++) {
				if(arr[j]<arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

			for(int k=0 ; k<arr.length ; k++) {
				System.out.print(arr[k]+ " ");
			}
			System.out.println();
			
		}
		
		System.out.println("선택정렬 후");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
	
	}
}
