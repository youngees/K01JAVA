package bokang.sub;

/*
체크카드 클래스 Ver.01

시나리오] 체크카드를 클래스로 표현해보자.
	멤버변수 : 카드번호, 소유자, 잔액, 포인트
	멤버메소드 : 충전(입금), 결제, 적립, 현재상태출력
	적립율 : 사용금액의 0.1%	
*/

public class CheckCard1
{
	//멤버변수
	public long cardNumber;//카드번호
	public String owner;//소유자
	public int balace; //잔액
	public int point; //포인트
	
	//멤버메서드
	//충전(입금)
	public void charge(int amount) {
		//현재 잔고에 충전할 금액 amount원을 더해준다.
		this.balace += amount;
	}
	//결제
	public void payment(int amount) {
		//잔고에서 사용한 금액을 차감한다.
		this.balace -= amount;
		//체크카드 사용시 적립금이 발생되므로 호출한다.
		savingPoint(amount);
	}
	//적립
	public void savingPoint(int amount) {
		double plusPoint = amount * 0.1;
		
		/*
		복합대입연산자의 특성상 자료형은 항상 좌측항을 따라간다.
		따라서 형변환에 대한 에러가 발생하지 않는다.
		 */
		this.point += plusPoint;
		//아래와 같은 경우 실수를 정수에 대입할 수 없으므로 에러발생
		//this.point = this.point + plusPoint;
	}
	
	//현재상태출력
	public void showState() {
		System.out.println("카드번호:"+ this.cardNumber);
		System.out.println("소유자:"+ this.owner);
		System.out.println("잔고:"+ this.balace);
		System.out.println("포인트:"+ this.point);
	}
	
}
