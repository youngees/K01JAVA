package evaluation;
/*
1 ~ 1000까지 정수중 2의 배수 이거나 5의 배수인 숫자의 합을 구하는 프로그램을 작성하시오.
단, 2와 5의 공배수인 경우 제외해야 하고, for문으로 작성한다.
-클래스명 : Sum2And5
[샘플코드]
public class Sum2And5 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1 ; i<=1000 ; i++) {
            _작성_;
        }
        System.out.println("정답:"+sum);
    }
}
[출력결과] 정답:250000
*/
public class Sum2And5
{

	public static void main(String[] args)
	{
		int sum = 0;
        for(int i=1 ; i<=1000 ; i++) {
        	 if(i%2==0 || i%5==0) {
        		if(i%2==0 && i%5==0) {
        			continue;
        		}
                sum += i;
        	}   
        }
        System.out.println("정답:"+sum);
	}
}
