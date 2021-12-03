package quiz;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
게임설명 : 업다운게임을 메소드를 이용해 구현한다.
1. 컴퓨터는 1~100사이의 숫자 하나를 생성한다.
2. 총 시도횟수는 7번을 부여한다.
3. 사용자는 7번의 시도안에 숫자를 맞춰야 한다.
4. 사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
5. 7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
6. 성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
7. 함수를 사용하여 구현한다.
8. 무한루프에 빠지게 된다면 scan.nextLine()을 활용하여
   버퍼에 남아있는 Enter키를 제거해주도록 하자.

업다운 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오.
숫자입력시 1~100을 벗어난 경우 사용자정의 예외클래스를 통해 처리하시오
클래스명 : NumberRangeException
게임 재시작 / 종료 입력시 문자를 입력했을때 발생되는 예외를 처리하시오.

 */
class NumberRangeException extends Exception {
	
	public NumberRangeException() {
		super("입력할 수 있는 숫자의 범위를 초과하였습니다.");
	}
}
public class QuUpDownGame {
	
	public static int readNumber()throws NumberRangeException {
		Scanner sc = new Scanner(System.in);
		int user1=0;
		
		try {
			if(user1<=100);
		}
		catch(InputMismatchException e) {
			if(user1>100) {
				NumberRangeException ex = new NumberRangeException();
				throw ex;
			}
			System.exit(0);
		}
		return user1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		boolean yeah = false;
		int restart;
		
		while(true) {
			int com = random.nextInt(100) + 1;
			System.out.println("컴퓨터:"+ com);
			
			for(int i=1 ; i<=7 ; i++) {
				System.out.println("숫자를 입력하세요.");
				int user = scan.nextInt();
				
				try {
					readNumber();
					System.out.println("당신이 입력한 숫자는 "+ user +" 입니다.");
				}
				catch(NumberRangeException e) {
					scan.nextLine();
					System.out.println("[예외발생]"+e.getMessage());
				}
				
				if(user<com) {
					System.out.println("UP");
				}
				else if(user>com) {
					System.out.println("Down");
				}
				else {
					System.out.println("정답입니다.");
					System.out.println(i+"번만에 맞추셨습니다.");
					yeah = true;
					break;
				}
			}
			if(yeah==false) {
				System.out.println("7번안에 맞추기를 실패하셨습니다.");
			}
			while(true) {
				try {
					System.out.println("게임재시작(1), 종료(0):");
					restart = scan.nextInt();
					if(restart==0 || restart==1) {
						break;
					}
					
				}
				catch(InputMismatchException e){
					System.out.println("잘못입력하셨습니다.");
					scan.nextLine();
					continue;
				}
			}								
			if(restart==0) {
				break;
			}
			else {
				System.out.println("게임을 재시작합니다.");
			}
		}
	}				
}



