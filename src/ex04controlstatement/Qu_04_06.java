package ex04controlstatement;
/*
 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
실행결과]
*
* *
* * *
* * * *
* * * * *
 */
public class Qu_04_06 {

	public static void main(String[] args) {
		
		int i = 1, k;
		while (i<=5) {
			k=1;
			while (k<=i) {
				System.out.printf("*");
				k++;
			}
			System.out.printf("\n");
			i++;
		}

	}

}

/*
[선생님 버전]

int i =1;
while(i<5) {
  int j=1;
  while(j<=i) {
    System.out.printf("*");
	j++;
  }
   System.out.println("");
   i++;
}
*/
