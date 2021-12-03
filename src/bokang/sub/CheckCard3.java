package bokang.sub;
/*
체크카드 클래스 Ver.03
	: initMembers 초기화 메소드는 삭제처리 
	
	1.충전은 10000원 단위로만 가능하다.
	만약 5000원을 충전하면 충전불능으로 처리한다.
	
	2.잔고가 부족하면 결제불능으로 처리해야 한다.
	
	3.생성자 오버로딩 처리
		new CheckCard3(카드번호, 소유자, 잔고, 포인트);
		new CheckCard3(카드번호, 소유자, 잔고); => 포인트 0으로 초기화
		new CheckCard3(카드번호, 소유자); => 잔고, 포인트 0으로 초기화
	
	4.포인트 적립율 변경
		10만원 이하결재 : 0.1%적립
		10만원 초과결재 : 0.3%적립
 */

public class CheckCard3
{
	
	private long cardNumber;//카드번호
	private String owner;//소유자
	private int balace; //잔액
	private int point; //포인트
	
	
	public void initMembers(long cardNumber, String owner, int balace, int point) {
		//멤버변수를 맴버메서드에서 사용할땐 무조건 this를 붙여주면 좋다.
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balace = balace;
		this.point = point;
	}
	
	//기본생성자(디폴트 생성자)
	public CheckCard3() {}
	//인자생성자
	public CheckCard3(long cardNumber, String owner, int balace, int point)
	{
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balace = balace;
		this.point = point;
	}
//	public CheckCard3(long cardNumber, String owner, int balace)
//	{
//		this.cardNumber = cardNumber;
//		this.owner = owner;
//		this.balace = balace;
//		this.point = 0;
//	}
//	public CheckCard3(long cardNumber, String owner)
//	{
//		this.cardNumber = cardNumber;
//		this.owner = owner;
//		this.balace =0;
//		this.point = 0;
//	}
	

	public long getCardNumber()
	{
		return cardNumber;
	}
	public void setCardNumber(long cardNumber)
	{
		this.cardNumber = cardNumber;
	}
	public String getOwner()
	{
		return owner;
	}
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	public int getBalace()
	{
		return balace;
	}
	public void setBalace(int balace)
	{
		this.balace = balace;
	}
	public int getPoint()
	{
		return point;
	}
	public void setPoint(int point)
	{
		this.point = point;
	}


	//충전(입금)
	public void charge(int amount) {
		if(amount%10000==0) {
			this.balace += amount;		
			System.out.printf("%s님 %d원 충전완료\n", owner, amount);
			System.out.printf("[잔고]%d원입니다.\n", balace);
		}
		else {
			System.out.println("충전 불가능 : 10000원 단위로만 입력이 가능합니다.");
		}
		
	}
	//결제
	public void payment(int amount) {
		
		if(this.balace>=amount) {
			this.balace -= amount;
			//카드를 사용할때 적립금이 발생되므로 여기서 호출한다.
			savingPoint(amount);
		}
		else  {
			System.out.printf("%s님 잔고가 부족합니다.\n",owner);
		}
	}
	//적립
	public void savingPoint(int amount) {
		
		double plusPoint = 0;
		if(amount>100000) {
			plusPoint = (amount * 0.3);
		}
		else {
			plusPoint = (amount * 0.1);
		}
		
		this.point += plusPoint;
	}
	
	//현재상태출력
	public void showState() {
		System.out.println("카드번호:"+ this.cardNumber);
		System.out.println("소유자:"+ this.owner);
		System.out.println("잔고:"+ this.balace);
		System.out.println("포인트:"+ this.point);
	}
	
}
