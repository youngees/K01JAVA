package bokang.sub;
/*
체크카드 클래스 Ver.02

버전02에서 추가부분
	1. 멤버변수 초기화 메소드 정의 
		메소드명 : initMembers()
	2. 기본생성자, 인자생성자 정의
	3. 멤버변수 정보은닉
	4. getter/setter 메소드 추가
 */

public class CheckCard2
{
	//멤버변수
	/*
	정보은닉이란 멤버변수를 private으로 선언해서 클래스 외부에서는
	접근하지 못하게 차단하는것을 말한다.
	 */
	private long cardNumber;//카드번호
	private String owner;//소유자
	private int balace; //잔액
	private int point; //포인트
	
	//초기화메서드
	/*
	생성자가 아닌 일반적인 멤버메서드를 만들때에는 무조건 public void를
	붙여놓고 시작한다. 차후 반환타입이 있는경우 void를 해당 반환타입으로
	변경하면 된다.
	 */
	public void initMembers(long cardNumber, String owner, int balace, int point) {
		//멤버변수를 맴버메서드에서 사용할땐 무조건 this를 붙여주면 좋다.
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balace = balace;
		this.point = point;
	}
	
	/*
	생성자는 멤버메서드와는 다르게 반환형이 없고 클래스와 이름이 동일하다.
	멤버변수를 정의하였다면 생성자는 무조건 자동생성 메뉴를 사용한다.
	source > generate constructor > 생성하기
	 */
	//기본생성자(디폴트 생성자)
	public CheckCard2() {}
	//인자생성자
	public CheckCard2(long cardNumber, String owner, int balace, int point)
	{
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balace = balace;
		this.point = point;
	}
	
	/*
	멤버변수를 private으로 선언하면 클래스 내부에서만 접근할 수 있으므로
	외부에서으 접근을 위해 getter/setter를 무조건 생성해야한다.
	 */
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
