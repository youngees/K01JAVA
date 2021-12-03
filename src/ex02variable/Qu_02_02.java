package ex02variable;
/*
 국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
 */
public class Qu_02_02 {

	public static void main(String[] args) {
		    
		double kor=99, eng=80, math=96;
		    
		    
		double avg = (kor+eng+math) / 3.0; 
		    System.out.printf("평균점수(실수형)=%.14f%n",avg);
		    
		int avg1 =(int)(kor+eng+math) / 3; 
		    System.out.printf("평균점수(정수형)=%d%n",avg1);
		    
		/*
		 * [선생님버전]
		 int k=99, e=80, math=96;
		 int avg1 = (k+e+m) / 3;
		 double avg2 = (k+e+m) / 3.0;
		 
		 System.out.println("평균점수(실수형)="+avg2);
		 System.out.println("평균점수(정수형)="+avg1);
		 
		 */
		 
	    }
		   
	}

