package ex09package;

import ex09package.kosmo.seller.FruitSeller3;

/*
연습문제] 해당 프로그램을 아래의 지시에 따라 패키지로 구분하여 
정상 실행되도록 변경하시오.

FruitSeller3 클래스 =>  ex09package.kosmo.seller 패키지에 묶는다.
FruitBuyer3 클래스 =>  ex09package.kosmo.buyer 패키지에 묶는다.
 
두 클래스를 적절히 import 하여 정상동작할 수 있도록 FruitSaleMain3클래스를
구성하시오.
 */

//프로그램의 출발점이 되는 메인 클래스
public class FruitSalesMain4
{
	public static void main(String[] args)
	{
		
		//판매자1 : 사과100개, 단가1000원
		FruitSeller3 seller1 = new FruitSeller3(0,100,1000);
		
		//판매자2 : 사과80개, 단가500원
		FruitSeller3 seller2 = new FruitSeller3(0,80,500);
		
		//구매자 : 보유금액10000원 
		ex09package.kosmo.buyer.FruitBuyer3 buyer =
				new ex09package.kosmo.buyer.FruitBuyer3(10000,0); 
		//=> seller와 파일명이 다르니 그냥 import해도 됨
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//각각의 판매자에게 5000원씩 지불하고 사과 구매
		buyer.buyApple(seller1,5000);
		buyer.buyApple(seller2,5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}
}
